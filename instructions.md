 The objective of this lab is to practice interface and use the sort method of Java Collections.
 
 ## Task1: Interface
 
 Under the interface package you will find a few classes to practice interface.
 
 The class **Main** and the interface **Speak** are complete.


Your job is to complete the  **Cow**, **Horse**, and **Dog** classes. Have each of these classes implement the **Speak** interface so that:

- the **Cow** says() "moo"
- the **Horse** says() "neigh"
- the **Dog** says() "woof"

## Task 2: Ordering with Comparable (Natural ordering)

You will find a list of classes under the package comparator to practice ordering your objects using interfaces.

The **Employee** class is partially complete,  you should not add any instance variables/mutators/accessors or change the Constructor or toString.

Your job is to make this **Employee** class sortable

To do this you will want to implement the Java **Comparable** interface

This will create a natural ordering for the **Employee** class that can be used by the Collections.sort() method

The natural ordering you create should first sort **Employees** so that the employees with higher **salary** come before employees with lower **salary**

If two Employee's **salary** are the same then the **Employees** should be ordered by their **name alphabetically**



## Task 3: Ordering with Comparator

The **Employee** class is now complete and is already sortable with the natural ordering from the previous natural ordering. 

This should remain unchanged.

Your next job is to create a secondary ordering of the **Employee** class using the **EmployeeIDComparator** class.

To do this you will want to implement the Java **Comparator** interface

This will create a secondary ordering for the **Employee** class that can be used by the Collections.sort() method

The secondary ordering you will create should sort **Employees** by the instance variable of Employee **id**

You can access Employee id using the **getID()** method

## Submission Expectations

- Upload your final code in the repository before the deadline and a zip file on Blackboard.
- The deadline for this lab is March 9th.
- Complete the documentations required for creating a JavaDoc including author name.
- You don't need to create the JavaDoc.
- The total marks for this lab is 2 points.
- You get 1 point for partial submission and 2 points for complete submission.
