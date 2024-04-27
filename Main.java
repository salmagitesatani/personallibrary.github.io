/********************************************
*	AUTHORS:	<Salma Gitesatani>
* COLLABORATORS: <name of peer, tutor, instructor>
*	LAST MODIFIED:	<05/20/2023>
********************************************/

/********************************************
*	<Bookshelf: Your Personal Library Companion>
*********************************************
*	PROGRAM DESCRIPTION:
*	<"Bookshelf" is a delightful program that allows users to create their personal library, add books with details such as title, rating, genre, and pages, track their completion status, and explore library statistics, all in a cute interface.>
*********************************************
*	ALGORITHM:
*	<FUNCTION main():
    INITIALIZE scanner AS new Scanner(System.in)
    INITIALIZE library AS new Library()
    INITIALIZE total AS new Total()
    SET completedCount TO 0
    SET uncompletedCount TO 0
    SET totalCount TO 0

    DISPLAY welcome message

    SET exit TO false
    WHILE exit is false:
      DISPLAY menu options
      READ choice FROM user input

    IF choice is less than 1 OR choice is greater than 4:
      DISPLAY "Invalid choice. Please enter a valid integer within the specified range."
    ELSE IF choice is 1:
      DISPLAY "Enter the book details:"
      READ title FROM user input
      READ rating FROM user input
      READ genre FROM user input
      READ pages FROM user input
      READ isCompleted FROM user input
      READ summary FROM user input

      CREATE newBook AS new Book(title, rating, genre, pages, isCompleted, summary)
      CALL library.addBook(newBook)
      IF newBook.isCompleted() is true:
        INCREMENT completedCount by 1
      ELSE:
        INCREMENT uncompletedCount by 1
        CALL total.addBook(newBook)
    ELSE IF choice is 2:
      CALL library.displayBooks()
    ELSE IF choice is 3:
      DISPLAY "Library Statistics:"
      DISPLAY "Total Books: " + total.getTotalBooks()
      DISPLAY "Completed Books: " + total.getTotalCompletedBooks()
      DISPLAY "Incomplete Books: " + total.getTotalIncompleteBooks()
    ELSE IF choice is 4:
      DISPLAY "Thank you for using the library. Goodbye!"
      SET exit TO true
    ELSE:
      DISPLAY "Invalid choice. Please try again."

    CLOSE the scanner>

    
*********************************************
*	STATIC METHODS:
*+---------------------+
|        Main         |
+---------------------+
| - scanner: Scanner  |
| - library: Library  |
| - total: Total      |
| - completedCount: int |
| - uncompletedCount: int |
| - totalCount: int   |
+---------------------+
| + main(args: String[]) |
+---------------------+>
*********************************************
*	ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
*	<Scanner= used for console input>
*********************************************/

// <IMPORTS GO HERE>
import java.util.Scanner;
public class Main {

  /***** CONSTANT SECTION *****/
    public static void main(String[] args) {

  /***** DECLARATION SECTION *****/

      Scanner scanner = new Scanner(System.in);
      Library library = new Library();

  /***** INITIALIZATION SECTION *****/
      
      Total total = new Total();
      int completedCount = 0;
      int uncompletedCount = 0;
      int totalCount = 0;


  /***** INTRO SECTION *****/
      System.out.println("╔═════════════════════════════════════════════════╗");
  System.out.printf("║%49s║%n", "");
  System.out.printf("║%20s%s%20s║%n", " ", ColorTheme.RED + "♥♥♥♥♥♥♥♥♥" + ColorTheme.RESET, "");
  System.out.printf("║%5s%s%23s%s%5s║%n", "", ColorTheme.RED + "♥♥♥" + ColorTheme.RESET, "Welcome to your personal library!",          ColorTheme.RED + "♥♥♥" + ColorTheme.RESET, "");
  System.out.printf("║%20s%s%20s║%n", "", ColorTheme.RED + "♥♥♥♥♥♥♥♥♥" + ColorTheme.RESET, "");
  System.out.printf("║%49s║%n", "");
  System.out.println("╚═════════════════════════════════════════════════╝");

/***** INPUT SECTION *****/
      
  boolean exit = false;
  while (!exit) {
    
    
/***** PROCESSING SECTION *****/
    System.out.println(ColorTheme.LIGHT_PINK + "\nSelect an option:");
    System.out.println(ColorTheme.LIGHT_PINK + "1. Add a book");
    System.out.println(ColorTheme.LIGHT_PINK + "2. Display all books");
    System.out.println(ColorTheme.LIGHT_PINK + "3. Library Statistics");
    System.out.println(ColorTheme.LIGHT_PINK + "4. Exit");

/***** OUTPUT SECTION *****/
    
    int choice = readIntInput(scanner);
    if (choice < 1 || choice > 4) {
      System.out.println(ColorTheme.RED+ "Invalid choice. Please enter a valid integer within the specified range." + ColorTheme.RESET);
    } else {
        if (choice == 1) {
          System.out.println(ColorTheme.LIGHT_PINK + "Enter the book details:");
          System.out.print(ColorTheme.LIGHT_PINK + "Title: ");
          String title = scanner.nextLine();

          System.out.print(ColorTheme.LIGHT_PINK + "Rating: ");
          int rating = readIntInputInRange(scanner, 1, 5, "Rating");
          if (rating == -1) {
            System.out.println(ColorTheme.RED + "Invalid rating. Please enter an integer between 1 and 5." + ColorTheme.RESET);
            continue;
          }

          System.out.print(ColorTheme.LIGHT_PINK + "Genre: ");
          String genre = scanner.nextLine();

          System.out.print(ColorTheme.LIGHT_PINK + "Pages: ");
          int pages = readIntInput(scanner);
          if (pages < 0) {
            System.out.println(ColorTheme.RED + "Invalid pages. Please enter a non-negative integer." + ColorTheme.RESET);
            continue;
          }

          System.out.print(ColorTheme.LIGHT_PINK + "Completed (true/false): ");
          Boolean isCompleted = readBooleanInput(scanner);
          if (isCompleted == null) {
            System.out.println(ColorTheme.RED + "Invalid input. Please enter 'true' or 'false'." + ColorTheme.RESET);
            continue;
          }

          System.out.print(ColorTheme.LIGHT_PINK + "Summary: ");
          String summary = scanner.nextLine();

          Book newBook = new Book(title, rating, genre, pages, isCompleted, summary);
          library.addBook(newBook);
          if (newBook.isCompleted()) {
            completedCount++;
          } else {
            uncompletedCount++;
          }
total.addBook(newBook);
        }
        else if (choice == 2) {
          library.displayBooks();
        } 
        else if (choice == 3) {
          System.out.println(ColorTheme.LIGHT_PINK + "Library Statistics:");
          System.out.println(ColorTheme.LIGHT_PINK + "Total Books: " + total.getTotalBooks());
          System.out.println(ColorTheme.LIGHT_PINK + "Completed Books: " + total.getTotalCompletedBooks());
          System.out.println(ColorTheme.LIGHT_PINK + "Incomplete Books: " + total.getTotalIncompleteBooks());
        } 
        else if (choice == 4) {
          System.out.println(ColorTheme.LIGHT_PINK + "Thank you for using the library. Goodbye!" + ColorTheme.RESET);
          exit = true;
        }
        else {
          System.out.println(ColorTheme.RED + "Invalid choice. Please try again." + ColorTheme.RESET);
        }
      }
  }
        scanner.close(); // Close the scanner after use
    }



/*ALGORITHM:
<FUNCTION readIntInput(scanner: Scanner) RETURNS INTEGER
WHILE true DO
  INPUT input FROM scanner.nextLine()
  TRY
    RETURN Integer.parseInt(input)
    CATCH NumberFormatException
    OUTPUT "Invalid input. Please enter a valid integer."
  END TRY-CATCH
  END WHILE
  END FUNCTION>
*********************************************/

/*STATIC METHODS:
<+-------------------------+
|       MainClass       |
+-------------------------+
| - readIntInput(scanner: Scanner): int |
+-------------------------+>
*********************************************/
  
  private static int readIntInput(Scanner scanner) {
    while (true) {
      String input = scanner.nextLine();
      try {
        return Integer.parseInt(input);
      } catch (NumberFormatException e) {
      System.out.println(ColorTheme.RED + "Invalid input. Please enter a valid integer." + ColorTheme.RESET);
        }
    }
  }


/*ALGORITHM:
<function readIntInputInRange(scanner, min, max, inputName):
  input: int

  while true:
    input = readIntInput(scanner)
    if input >= min and input <= max:
      break
      print("Invalid " + inputName + ". Please enter an integer between " + min + " and " + max + ".")

  return input>
*********************************************/

/*STATIC METHODS:
<+-------------------------+
|       MainClass       |
+-------------------------+
| - readIntInputInRange(scanner: Scanner, min: int, max: int, inputName: String): int |
+-------------------------+>
*********************************************/
  
  private static int readIntInputInRange(Scanner scanner, int min, int max, String inputName) {
    int input;
      while (true) {
        input = readIntInput(scanner);
          if (input >= min && input <= max) {
            break;
          }
            System.out.println(ColorTheme.RED + "Invalid " + inputName + ". Please enter an integer between " + min + " and " + max + "." + ColorTheme.RESET);
        }
        return input;
    }

/*ALGORITHM:
<function readBooleanInput(scanner):
  while true:
    input = scanner.nextLine().toLowerCase()
    if input equals "true":
      return true
    else if input equals "false":
      return false
      print("Invalid input. Please enter 'true' or 'false'.")>
*********************************************/

/*STATIC METHODS:
<+-------------------------+
|       MainClass       |
+-------------------------+
| - readBooleanInput(scanner: Scanner): Boolean |
+-------------------------+>
*********************************************/
  private static Boolean readBooleanInput(Scanner scanner) {
    while (true) {
      String input = scanner.nextLine().toLowerCase();
        if (input.equals("true")) {
            return true;
        } else if (input.equals("false")) {
            return false;
          }
            System.out.println(ColorTheme.RED + "Invalid input. Please enter 'true' or 'false'." + ColorTheme.RESET);
        }
      }
    }