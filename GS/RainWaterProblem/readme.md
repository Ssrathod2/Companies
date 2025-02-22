RainWatter Problem Solution : 

![image](https://github.com/user-attachments/assets/a685d4ec-cb66-4246-be9e-4d7f94a145df)

Simple Approach :
Get the prefix max elements in array : premins
Get the postfix max elements in array : postmins
Then Use This formula to calculate the water can be hold in each cell in the array index

water (ans += ) =  Math.min( premins[idx],postmins[idx] ) - Height[idx] ;

![image](https://github.com/user-attachments/assets/22509b3f-4b89-432e-bf98-7b91ffb258bf)

