 Task 1
 The **Employee** class is partially complete,  you should not add any instance variables/mutators/accessors or change the Constructor or toString.

Your job is to make this **Employee** class sortable

To do this you will want to implement the Java **Comparable** interface

This will create a natural ordering for the **Employee** class that can be used by the Collections.sort() method

The natural ordering you should create should first sort **Employees** so that worse **salary** are before better **salary**

If two Employee's **salary** are the same then the S**tudents** should be ordered by their **name alphabetically**

You can make use of the natural ordering of the **String** type used for the name to get alphabetical ordering

All **enums** also have a natural ordering which is the the order of the constants names when the **enum** is declared
 
 Task2

The **Employee** class is complete

The **Employee** class is already sortable with the natural ordering from the previous natural ordering. this should remain unchanged.

Your job is to create a secondary ordering of the **Employee** class using the **EmployeeIDComparator** class:

To do this you will want to implement the Java **Comparator** interface

This will create a secondary ordering for the **Employee** class that can be used by the Collections.sort() method

The secondary ordering you should create should sort **Employees** by the newly added instance variable of Employee **id**

You can access Employee id using the **getID()** method