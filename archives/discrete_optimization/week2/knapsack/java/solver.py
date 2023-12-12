#!/usr/bin/env python

import os
from pathlib import Path
from subprocess import Popen, PIPE
import sys
from typing import List


def solve(input_: str) -> str:
    # Write the input data to a temporay file
    tmp_filename: str = Path('tmp.data')
    with tmp_filename.open('w') as f:
        f.write(input_)

    # Run the Java command: java Solver -file=tmp.data
    process: Popen = Popen(['java', 'Solver', '-file=' + str(tmp_filename)], stdout=PIPE, universal_newlines=True)
    stdout: str
    stderr: str
    (stdout, stderr) = process.communicate()

    # Remove the temporay file
    os.remove(tmp_filename)

    return stdout.strip()


if __name__ == '__main__':
    if len(sys.argv) > 1:
        filepath: Path = Path(sys.argv[1].strip())
        with filepath.open() as f:
            input_ = f.read()
        output = solve(input_)
        print(output)
    else:
        print("This test requires an input file. Please select one from the data directory. (i.e. python solver.py ./data/ks_4_0)")

