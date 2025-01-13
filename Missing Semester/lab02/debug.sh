#!/bin/bash
count=0
./buggy.sh > buggy_log.log
until [[ "$?" -ne 0  ]];
do
	count=$((count+1))
	./buggy.sh >> buggy_log.log
done

cat buggy_log.log
echo "The buggy.sh ran $count times before the first error occurred"
