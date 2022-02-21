# CMPE 202 - LAB #1 - Code Maintainability

![Class Diagram](https://user-images.githubusercontent.com/98665897/153732125-0a0bc2b6-eb1f-4868-a665-f5869faf8a45.png)

In this model I have modified the code to support all the three gumball machines.
Firstly,
# Gumball Typical:
Here I have created three seperate codes to support gumball Machine
First one is the default Machine that takes one quarter and ejects the gumball if it has any gumballs left otherwise the quarter cannot be retrived and gumball will not eject because it's empty.
The second machine functionality is same as the first one but instead of one quarter it needs two quarters to eject the gumball.
the third machine is slightly different if accepts any of the three coins like quarter , nickel and dimes. So if the total amount is gretaer that 50 cents then it ejects the gumball.

# Gumball Pattern:
Here I've made changes to the code slightly in different manner, I made the code to support all the three machines in same program by this we can reduce the code smell by creating a parent class and inherit its property to all the three different machines.
