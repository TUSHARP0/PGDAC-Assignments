#!/bin/bash

read -p "Enter number of rows in your series: " num
#formula is used os that rows are not skipped
let "num= (( (num*2)-1 ))"
for (( i=0; i<=num; i++ ))
do
        echo ""
        for (( k=num; k>=0; k-- ))
        do
                echo -n " "
        done
        ((num--))
        for (( j=0; j<=i; j++ ))
        do
                echo -n "*"
        done
done
echo ""
echo ""
