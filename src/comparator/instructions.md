 

The **Employee** class is partially complete,  you should not add any instance variables/mutators/accessors or change the Constructor or toString.

Your job is to make this **Employee** class sortable

To do this you will want to implement the Java **Comparable** interface

This will create a natural ordering for the **Employee** class that can be used by the Collections.sort() method

The natural ordering you should create should first sort **Employees** so that worse **salary** are before better **salary**

If two Employee's **salary** are the same then the S**tudents** should be ordered by their **name alphabetically**

You can make use of the natural ordering of the **String** type used for the name to get alphabetical ordering

