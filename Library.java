/*ALGORITHM:
<class Library {
  private Book[] books;
  private int bookCount;

  // Constructor
   public Library() {
    Initialize books array with size 100
    Set bookCount to 0}>

*********************************************/

/*Static Methods:
<+------------------+
|     Library      |
+------------------+
| - books: Book[]  |
| - bookCount: int |
+------------------+
| + Library()      |
| + addBook(Book)  |
| + displayBooks() |
+------------------+>
*********************************************/

// Library class definition
/***** CONSTANT SECTION *****/

class Library {

/***** DECLARATION SECTION *****/

    private Book[] books;
    private int bookCount;

    public Library() {

/***** INITIALIZATION SECTION *****/

        books = new Book[100];
        bookCount = 0;
    }

/*ALGORITHM:
<public void addBook(Book book) {
  if (bookCount is equal to length of books array) {
    Create a new array newBooks with double the capacity of books array
    Copy elements from books array to newBooks array
    Set books array reference to newBooks array}
  Add the book to the books array at the bookCount index
  Increment bookCount by 1
  Print "Book added successfully!"}>
*********************************************/

/***** INTRO SECTION *****/
/***** INPUT SECTION *****/

    public void addBook(Book book) {

/***** PROCESSING SECTION *****/

        if (bookCount == books.length) {
            // If the array is full, create a new array with double the capacity
            Book[] newBooks = new Book[books.length * 2];
            System.arraycopy(books, 0, newBooks, 0, books.length);
            books = newBooks;
        }
        books[bookCount] = book;
        bookCount++;
        System.out.println("Book added successfully!");
    }

/*ALGORITHM:
<public void displayBooks() {
  if (bookCount is equal to 0) {
    Print "No books in the library."
    Return}

  Print "Books in the library:"
  for (i = 0 to i < bookCount) {
    Print "Title: " + books[i].getTitle()
    Print "Rating: " + books[i].getRating()
    Print "Genre: " + books[i].getGenre()
    Print "Pages: " + books[i].getPages()
    Print "Completed: " + (books[i].isCompleted() ? "Yes" : "No")
    Print "Summary: " + books[i].getSummary()
    Print "---------------------"}
  }
}>
*********************************************/

/***** OUTPUT SECTION *****/
    public void displayBooks() {
      if (bookCount == 0) {
            System.out.println("No books in the library.");
        return;
      }

      System.out.println("Books in the library:");
        for (int i = 0; i < bookCount; i++) {
        System.out.println(ColorTheme.LIGHT_PINK + "Title: " + books[i].getTitle() + ColorTheme.RESET);
            System.out.println(ColorTheme.LIGHT_PINK + "Rating: " + books[i].getRating() + ColorTheme.RESET);
            System.out.println(ColorTheme.LIGHT_PINK + "Genre: " + books[i].getGenre() + ColorTheme.RESET);
            System.out.println(ColorTheme.LIGHT_PINK + "Pages: " + books[i].getPages() + ColorTheme.RESET);
            System.out.println(ColorTheme.LIGHT_PINK + "Completed: " + (books[i].isCompleted() ? "Yes" : "No") + ColorTheme.RESET);
            System.out.println(ColorTheme.LIGHT_PINK + "Summary: " + books[i].getSummary() + ColorTheme.RESET);
            System.out.println(ColorTheme.LIGHT_PINK + "---------------------" + ColorTheme.RESET);
        }
      }    
}