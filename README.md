# Enigma
You are given n lines of encrypted messages. The messages will contain ASCII characters. In each message, only the Latin letters and special characters will be encrypted. The numbers and whitespace will not be encrypted. Your task is to write a program to decrypt the messages. The formula for the decrypting each letter is X = k + m, where X is the ASCII code of the decrypted letter, k is the ASCII code of the encrypted character and m is the integer half of the length of the input line, without the numbers and whitespace.

Input
The input comes from the console. The first line holds the count n. After that there are n lines with the encrypted messages. 
The input data will always be valid and in the format described. There is no need to check it explicitly.

Output
Print at the console the decrypted messages, each on separate line.
Each message should hold the numbers, whitespace and decrypted letters. See the examples below. 
