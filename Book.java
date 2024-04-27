/*ALGORITHM:
<class Book:
  // Private instance variables
    title: string
    rating: int
    genre: string
    pages: int
    completed: boolean
    summary: string

  // Default constructor
    Book():
      // Initialize instance variables with default values

  // Parameterized constructor
    Book(title: string, rating: int, genre: string, pages: int, completed: boolean, summary: string):
  // Initialize instance variables with provided values

  // Getter and setter methods for instance variables
    getTitle():
      return title

    setTitle(newTitle: string):
      title = newTitle

    getRating():
      return rating

    setRating(newRating: int):
      rating = newRating

    getGenre():
      return genre

    setGenre(newGenre: string):
      genre = newGenre

    getPages():
      return pages

    setPages(newPages: int):
      pages = newPages

    isCompleted():
      return completed

    setCompleted(isCompleted: boolean):
      completed = isCompleted

    getSummary():
      return summary

    setSummary(newSummary: string):
      summary = newSummary

  // Override toString method
    toString():
      return "Book{title='" + title + "', rating=" + rating + ", genre='" + genre + "', pages=" + pages + ", completed=" + completed + ", summary='" + summary + "'}"

  // Override equals method
    equals(obj: Object):
      if this is same as obj:
        return true
      if obj is null or type(obj) is not Book:
        return false

      book = obj as Book
  return title equals book.title>
*********************************************/

/*Static Methods
<+------------------+
|       Book       |
+------------------+
| - title: String  |
| - rating: int    |
| - genre: String  |
| - pages: int     |
| - completed: boolean |
| - summary: String|
+------------------+
| + Book()         |
| + Book(title: String, rating: int, genre: String, pages: int, completed: boolean, summary: String) |
| + getTitle(): String |
| + setTitle(title: String): void |
| + getRating(): int |
| + setRating(rating: int): void |
| + getGenre(): String |
| + setGenre(genre: String): void |
| + getPages(): int |
| + setPages(pages: int): void |
| + isCompleted(): boolean |
| + setCompleted(completed: boolean): void |
| + getSummary(): String |
| + setSummary(summary: String): void |
| + toString(): String |
| + equals(obj: Object): boolean |
+------------------+>
*********************************************/

/***** CONSTANT SECTION *****/

public class Book {

/***** DECLARATION SECTION *****/

    private String title;
    private int rating;
    private String genre;
    private int pages;
    private boolean completed;
    private String summary;

  public Book() {
    }

    public Book(String title, int rating, String genre, int pages, boolean completed, String summary) {

/***** INITIALIZATION SECTION *****/
/***** INTRO SECTION *****/

        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.pages = pages;
        this.completed = completed;
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
/***** INPUT SECTION *****/
/***** PROCESSING SECTION *****/
/***** OUTPUT SECTION *****/
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", completed=" + completed +
                ", summary='" + summary + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;

        return title.equals(book.title);
    }
}