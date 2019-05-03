# Databse Prototype
This is a databse data structure prototype I made

While reading MySQL related material, the book mentioned that the time tke to search increases as amount of row increases
With experience in CCC, I wanted to create a database that gives near instant feedback

## Structure
**Cell:**
* Contains data value
* Linked to other `Cell`s in the same row

**Column:**
* Contains `HashMap<Object, ArrayList<Cell>>`
  * `Keys`: All of the values user have entered. Exmaple, if column A user entered 1 and 2, keysett will then contain {1, 2}
  * `Values`: For each key, the ArrayList related is all `Cells` containing the value of the key
  
**Row:**
* Only exist on a logical level, with each `Cell` linked to the `Cell` in the previous and next `Column`
  
**TitleNC:**

Short for **Title and Column**
* Contains **Column Titel** in the form of `String`
* Contains `Column` which contains the actual `Cells`

**DB:**

Short for Database
* Contains `ArrayList<**TitleNC**>`
* The object to be created when want to use the Database data structure

## Methods
**`.addC(String title)`:**
* Add a new column into the database with the title `title`

**`.addRow(ArrayList values)`:**
* For each element in `ArrayList values`, create a new `Cell`
* Link `Cell`s into a **row**
* 1st `Cell` go into 1st `Column`, 2nd `Cell` go into 2nd `Column`

**`.search(String title, Object value)`:**
* Look through the database for `Column` named `title`
  * If no such `Column` is found, prompt the user with message
  * Other-wise search through the `Column` for `Cell ` with value `value`
    * If no such `Cell` is found, prompt the user with message
    * Other-wise display the `Row` the value is located
    * If more then one `Cell` have such value, all rows will be displayed
