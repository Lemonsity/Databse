# Databse Prototype
This is a databse prototype I made

While reading MySQL related material, the book mentioned that the time tke to search increases as amount of row increases
With experience in CCC, I wanted to create a database that gives near instant feedback

## Structure
**Cell:**
* Contains value
* Linked to other **cells** in the same row

**Column:**
* Contains HashMap<Object, ArrayList<**Cell**>>
  * **Keys**: All of the values user have entered. Exmaple, if column A user entered 1 and 2, keysett will then contain [1, 2]
  * **Values**: For each key, the ArrayList related is all **Cells** containing the value of the key
  
**Row:**
* Only exist on a logical level, with each **cell** linked to the **cell** in the previous and next **column**
  
**TitleNC:**
Short for **Title and Column**

      
