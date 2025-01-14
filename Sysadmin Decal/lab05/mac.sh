#!/bin/bash

ip addr show enp0s1 | grep 'link/ether' | head -n 1 | cut -d ' ' -f 6

