# b01-Solution

## Shell spelunker
    3. The "pwd" command is used to get the absolute directory where the current pointer is located
    4. Using 'ls-a` to find out the hidden file.
    5. Using `ls | xarg cat` where | pipes 'ls' into 'xarg' and 'xarg' pass 'ls' as arguments into 'cat'.
    6. `rm path` 
    (ps:When using the rm command, be sure to check whether the PATH is accurate and avoid using it with sudo)
    7. `grep -C 2 'https' big_data.txt` 
    8. Require 'execute' permission, using `chmod +x ./a_script`. # using `ls -l` to check permission
    9. `echo vlify >> hello_world`

## General questions
    1. They are all Unix-like systems.
    2. The GUI is newbie-friendly, and the command line is friendly to those who are familiar with it
    3. The root directory is the top-most directory in the hierarchical filesystem, the start point of the filesystem.
    4. `ls -ltrh`
    5. `head -n 4`
    6. `cat foo > out.txt` read file a and overwrite int in file b `cat foo >> out.txt` read and append.

