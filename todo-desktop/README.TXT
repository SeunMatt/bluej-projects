------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: TODO App
PURPOSE OF PROJECT: Training
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS: SeunMatt,LordWise
USER INSTRUCTIONS:



Product Requirement
===================
- As a user, I want to be able to see all my todo items
- As a user, I want to be able to see a single todo item
- As a user, I want to be able to add a new todo item
- As a user, I want to be able to edit an existing todo item
- As a user, I want to be able to delete a todo item
- As a user, I want to be able to mark a todo item as DONE

Technical Specification
=======================

Objects (a.k.a Domains)
-----------------------
- TodoItem:
    - id:
        values: UUID
        dataType: String
    - task:
        values: alphanumeric
        dataType: String
    - status:
       - values: DONE,PENDING
       - dataType: String 
    - dueDate:
        - value: DD-MM-YYYY HH:mm:ss e.g. 03-09-2022 12:22:00
        - dataType: Date  

Features
--------
- LIST all TodoItems
- GET single TodoItem
- UPDATE exising single TodoItem
- DELETE existing TodoItem
- UPDATE TodoItem's status to DONE
- CREATE new TodoItem

Technical Notes:
----------------
- We will store the TodoItems in-memory using an array data structure 
- We will create another class to help us add/remove/edit the data in Memory




TodoItem [] itemStore = new TodoItem[10];
itemStore[0] = item1
itemStore[1] = item2
itemStore[2] = item3 //
itemStore[3] = item4
itemStore[4] = item5
itemStore[5] = item6
itemStore[6] = item7
itemStore[7] = item8
itemStore[8] = item9
itemStore[9] = item10

index Of lastItem == length of array - 1;




Basket A ==> 10 oranges of different colours
Remove ALL black oranges
Basket B ==> 


