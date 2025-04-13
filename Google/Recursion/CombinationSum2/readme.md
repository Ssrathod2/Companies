## Description :

![image](https://github.com/user-attachments/assets/5ed079c6-7564-4688-9fe8-aca1dbd1947f)


## Approach :

In recursion I can for loop in 2 scenario's :

Like in Permutationn if order matters then we for idx=0 taking boolean variable that has been done or ot

in combination order doenst matter so we can just do take not take logic.

If both take and not take logic has moving the pointer to i+1
then we can use for loop with i = idx+1

In this we don't want to start the recursion with same element again as we cann just skip if cnd[i] == cnd[i-1]
so did this here

## Solution :

![image](https://github.com/user-attachments/assets/fd771492-51b1-43c3-b421-8dea5d55a5ab)
