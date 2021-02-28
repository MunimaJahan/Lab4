 ## Task1: Interface
 
 Under the interface package you will find a few classes to practice interface.
 
 The class **Main** and the interface **Speak** are complete.


Your job is to complete the  **Cow**, **Horse**, and **Dog** classesHave each of these classes implement the **Speak** interface so that:

- the **Cow** says() "moo"
- the **Horse** says() "neigh"
- the **Dog** says() "woof"

## Task 2: Ordering with Comparable and Comparator

You will find a list of classes under the package comparator to practice ordering your objects using interfaces.

The **Employee** class is partially complete,  you should not add any instance variables/mutators/accessors or change the Constructor or toString.

Your job is to make this **Employee** class sortable

To do this you will want to implement the Java **Comparable** interface

This will create a natural ordering for the **Employee** class that can be used by the Collections.sort() method

The natural ordering you should create should first sort **Employees** so that worse **salary** are before better **salary**

If two Employee's **salary** are the same then the S**tudents** should be ordered by their **name alphabetically**

You can make use of the natural ordering of the **String** type used for the name to get alphabetical ordering


## Task 3: Ordering with Comparator

The **Employee** class is now complete and is already sortable with the natural ordering from the previous natural ordering. This should remain unchanged.

Your next job is to create a secondary ordering of the **Employee** class using the **EmployeeIDComparator** class:

To do this you will want to implement the Java **Comparator** interface

This will create a secondary ordering for the **Employee** class that can be used by the Collections.sort() method

The secondary ordering you should create should sort **Employees** by the newly added instance variable of Employee **id**

You can access Employee id using the **getID()** method


