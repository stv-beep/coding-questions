# jutge.org P23001 - Consecutive repeated words
""" Given a sequence of words, print the length of the longest consecutive subsequence that only contains the first word. 
That is, if the sequence is s1, …, sn, print
max{j − i + 1 : 1 ≤ i ≤ j ≤ n ∧ si = si+1 = … = sj−1 = sj = s1 }.
Input consists of a non-empty sequence of words.
Print the number of words of the longest consecutive subsequence that only contains the first word. 
hello bye bye hello hello hello bye hello hello: 3 """


words = "hello bye bye hello hello hello bye hello hello"
def consecutiveRepWords(words):
    counter = 0
    max = 1
    arr = words.split(" ")

    for i in range(len(arr)):
        counter+1
        if i != len(arr)-1 and arr[i] == arr[i+1]:
            counter+=1
            if counter>max:
                max=counter+1
        elif i != len(arr)-1 and arr[i] != arr[i+1]:
            counter=0
    print(max)


print(consecutiveRepWords(words))
