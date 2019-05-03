# Databse Table Prototype
This is a database table data structure prototype I made

While reading MySQL related material, the book mentioned that the time take to search increases as amount of row increases
Knowing this may be troublesome when the table contain huge amount of data, I wanted to create a database with near instant feedback

## Structure
**Cell:**
* Contains data value
* Linked to other `Cell`s in the same row

**Column:**
* Contains `HashMap<Object, ArrayList<`**`Cell`**`>>`
  * `Keys`: All of the different values user have entered for that specific `Column`
  * `Values`: For each key, the ArrayList related is all `Cells` containing the value of the key
  
**Row:**
* Only exist on a logical level, with each `Cell` linked to the `Cell` in the previous and next `Column`
  
**TitleNC:**

Short for **Title and Column**
* Contains **Column Titel** in the form of `String`
* Contains `Column` which contains the actual `Cells`

**Table:**
* Contains `ArrayList<`__`TitleNC`__`>`
* **This is the class to be called when want to use the table data structure**

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
    
## Time Complexity
Searching for the title require N iteration (ArrayList)

Finding the value user wants require O(1) time (HashMap)

For each element in the ArrayList that matches the user wanted value, it require roughly 2N iteration to extract information for each row

Thus total time complexity is O(N), which N stand for the amount of column in the table
