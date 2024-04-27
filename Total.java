/*ALGORITHM:
<class Total
  totalbooks: integer
  totalCompletedBooks: integer
  totalIncompleteBooks: Integer
  
  Constructor
  Total()
    totalbooks = 0
    totalCompletedBooks = 0
    totalIncompleteBooks = 0>
*********************************************/

/*Static Methods:
<+-----------------+
|      Total      |
+-----------------+
| - totalBooks: int            |
| - totalCompletedBooks: int   |
| - totalIncompleteBooks: int  |
+-----------------+
| + Total()                   |
| + addBook(book: Book)       |
| + getTotalBooks(): int      |
| + getTotalCompletedBooks(): int |
| + getTotalIncompleteBooks(): int |
+-----------------+>
*********************************************/

/***** CONSTANT SECTION *****/
/***** DECLARATION SECTION *****/

public class Total {

/***** DECLARATION SECTION *****/

    private int totalBooks;
    private int totalCompletedBooks;
    private int totalIncompleteBooks;

    public Total() {

/***** INITIALIZATION SECTION *****/

        totalBooks = 0;
        totalCompletedBooks = 0;
        totalIncompleteBooks = 0;
    }

/*ALGORITHM:
<addBook(book: Book)
  totalBooks = totalBooks + 1
  if book.isCompleted() then
    totalCompletedBooks = totalCompletedBooks + 1
  else
    totalIncompleteBooks = totalIncompleteBooks + 1>
*********************************************/


/***** INTRO SECTION *****/
/***** INPUT SECTION *****/
/***** PROCESSING SECTION *****/

    public void addBook(Book book) {
        totalBooks++;
        if (book.isCompleted()) {
            totalCompletedBooks++;
        } else {
            totalIncompleteBooks++;
        }
    }
  
/*ALGORITHM:
<getTotalBooks(): integer
  return totalBooks>
*******************************************

/***** OUTPUT SECTION *****/

  
    public int getTotalBooks() {
        return totalBooks;
    }
  
/*ALGORITHM:
<getTotalCompletedBooks(): integer
  return totalCompletedBooks>
*********************************************/

    public int getTotalCompletedBooks() {
        return totalCompletedBooks;
    }

  /*ALGORITHM:
<getTotalIncompleteBooks(): integer
  return totalIncompleteBooks>
*********************************************/

    public int getTotalIncompleteBooks() {
        return totalIncompleteBooks;
    }
}