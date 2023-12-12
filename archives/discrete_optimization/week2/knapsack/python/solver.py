#!/usr/bin/env pytyhon

from collections import namedtuple
from pathlib import Path
import sys
from typing import List


optimality: int = 1
item: namedtuple = namedtuple("Item", ['index', 'value', 'weight'])


def solve(input_: str) -> str:
    # Parse the lines from standard input and fill items
    lines: List[str] = input_.split('\n')
    n: int  # Number of items
    K: int  # Capacity
    n, K = map(int, lines[0].split(' '))

    items: List[namedtuple] = []
    for i in range(1, n+1):
        line = lines[i]
        parts = line.split(' ')
        items.append(item(i-1, int(parts[0]), int(parts[1])))

    # Initialize variables
    matrix: List[List[int]] = [[0 for _ in range(K+1)] for _ in range(n+1)]
    is_taken = [0 for _ in range(len(items))]
    item_i: int
    value_i: int
    weight_i: int
    for i in range(1, n+1):
        item_i = items[i-1]
        value_i = item_i.value
        weight_i = item_i.weight
        for j in range(1, K+1):
            # Unselect the i-th item if the weight is bigger than the specified capacity
            if j < weight_i:
                matrix[i][j] = matrix[i-1][j]
            # otherwise select the i-th item if its value makes the sum of values bigger
            else:
                matrix[i][j] = max(matrix[i-1][j], matrix[i-1][j-weight_i] + value_i)

    # Select the highest total value
    value: int = matrix[n][K]

    # Determine which items achieve the highest total value
    j: int = K
    for i in range(n, 0, -1):
        if matrix[i][j] != matrix[i-1][j]:
            is_taken[i-1] = 1
            j -= items[i-1].weight

    # Prepare the solution in the specified output format
    output: str = f"{value} {optimality}\n{' '.join(map(str, is_taken))}"
    return output


if __name__ == '__main__':
    if len(sys.argv) > 1:
        filepath: Path = Path(sys.argv[1].strip())
        with filepath.open() as f:
            input_ = f.read()
        output = solve(input_)
        print(output)
    else:
        print("This test requires an input file. Please select one from the data directory. (i.e. python solver.py ./data/ks_4_0)")
