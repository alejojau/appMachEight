# appMachEight
This is a project in java to accomplish the following statement:

There is also this python notebook where the code is also in python and javascript for the same exercise:

[Python and JavaScript](https://colab.research.google.com/drive/1-U_InLVLudElF80IqQuG4sJVl9IvPQ5Q?usp=sharing)

## Task
​
The task is to write a function that finds pairs of integers from a list that
sum to a given value. The function will take as input the list of numbers as
well as the target sum.
​
Sample output is shown below.
```
> app 1,9,5,0,20,-4,12,16,7 12
​
+ 12,0
+ 5,7
+ 16,-4
​
```
​
In the example, there is an executable named `app`. It takes as command line
arguments a comma separated list of integers, and the target integer. Your app
doesn't need to have identical input/output mechanisms. For example, you could
read from a file instead of the command line.
​
You can assume that all input values are integers. You can assume that there aren't
any repeat values in the list.
​
The algorithm to find the pairs must be faster than O(n^2). All edge cases
should be handled appropriately. This is _not_ a closed book test. You are
encouraged to reach out with any questions that you come across.


## HOW TO RUN THE CODE
###JAVA
​
First you need to have Java 1.8 or above installed on your computer and make sure you can call java commands in your command line. Make sure the compiler and the running version of java is the same, or the compiler version is lower than the running version.

Then download the code from this repository, and then open a command line where the app.java file is located. After this, run the following command:.

```
javac app.java
```

So the short program is compiled, and to run it we run the next command:

```
java app
```

And it will ask to write the list of numbers (separeted by commas) taken into account to reach the number receive as the second parameter.

###Python
The commands in the colaborative notebook (Python) is just to push play in the first part of the code to set the function and then play the second part of the code.
