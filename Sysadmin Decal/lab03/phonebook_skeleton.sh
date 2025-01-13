#!/bin/bash

PHONEBOOK_ENTRIES="bash_phonebook_entries"


if [ "$#" -lt 1 ]; then
    exit 1

elif [ "$1" = "new" ]; then
    # YOUR CODE HERE #
	echo "$2 $3 $4" >> phonebook.txt
elif [ "$1" = "list" ]; then
    if [ ! -e $PHONEBOOK_ENTRIES ] || [ ! -s $PHONEBOOK_ENTRIES ]; then
        echo "phonebook is empty"
    else
        # YOUR CODE HERE #
		cat phonebook.txt
    fi

elif [ "$1" = "lookup" ]; then
    # YOUR CODE HERE #
	grep "$2 $3" phonebook.txt

elif [ "$1" = "remove" ]; then
    # YOUR CODE HERE #
	grep -v "$2 $3" > phonebook.txt

elif [ "$1" = "clear" ]; then
    # YOUR CODE HERE #
	> phonebook.txt
else
     # YOUR CODE HERE #
	 echo "WTF?what are you typing?"
fi
