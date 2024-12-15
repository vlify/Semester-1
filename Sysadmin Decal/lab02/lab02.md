# b02-Solution

## Pipes and Redirection
    1. `grep -i -v [aeiouy] words.txt | head` where `-i` means no matter capital or non-capital, `-v` means reverse.
    2. `grep -i cal words.txt | grep -x '.\{7,100\}'`.

## `vim`
    1. `10dd`(Normal mode)
    2. ':sh' to Shell,or using <C-z> and "fg" in Shell 
    3. `:split newfile.txt` open a new file horizontally `:vsp newfile.txt` open a new file vertically.
    4. Using `V` to enter visual mode, select text, and use `<` and `>` to index.
## tmux
    1. Press <C-b>, then use `:split -v/h` to split windows, finally use `:resize-pane -D / -U / -L / -R  + size` to resize.
    2. `tmux attact -t n` where n refers to number of terminal
    3. `tmux kill-session -t <session-name>`
    4. `tmux new -s <session-name>`
