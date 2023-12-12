#!/usr/bin/env bash

TEST_DATA_FILES=(tinyUF.txt mediumUF.txt largeUF.txt)
ALGORITHMS=(UF QuickFindUF QuickUnionUF WeightedQuickUnionUF)

for algorithm in ${ALGORITHMS[@]}; do
	for test_data_file in ${TEST_DATA_FILES[@]}; do
    	echo "========================"
    	echo ${algorithm}
    	javac-algs4 ${algorithm}.java
    	echo "========================"
		echo "test data file: ${test_data_file}"
		start=`date +%s`
        java-algs4 ${algorithm}.java < ${test_data_file}
		end=`date +%s`
		time_elapsed=$((end - start))
		echo "time elapsed: ${time_elapsed}"
    done
done

exit 0
