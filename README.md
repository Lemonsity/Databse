# Databse Prototype
This is a databse data structure prototype I made

While reading MySQL related material, the book mentioned that the time tke to search increases as amount of row increases
With experience in CCC, I wanted to create a database that gives near instant feedback

## Structure
**Cell:**
* Contains value
* Linked to other **cells** in the same row

**Column:**
* Contains HashMap<Object, ArrayList<**Cell**>>
  * **Keys**: All of the values user have entered. Exmaple, if column A user entered 1 and 2, keysett will then contain {1, 2}
  * **Values**: For each key, the ArrayList related is all **Cells** containing the value of the key
  
**Row:**
* Only exist on a logical level, with each **Cell** linked to the **Cell** in the previous and next **Column**
  
**TitleNC:**
Short for **Title and Column**
* Contains **Column Titel** in the form of **String**
* Contains **Column** which contains the actual **Cells**

**DB**
Short for Database
* Contains ArrayList<**TitleNC**>
* The object to be created when want to use the Database data structure
