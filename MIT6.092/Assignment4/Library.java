import java.util.ArrayList;
public class Library {
    // Add the missing implementation to this class
    String libraryAddress;
    ArrayList<Book> bookList= new ArrayList<>();

    Library(String address){
      libraryAddress = address;
    }

    public void addBook(Book newBook) {
      bookList.add(newBook);
    }

    public static void printOpeningHours() {
      System.out.println("Librariess arr open daily from 9am to 5pm.");
    }

    public void printAddress() {
      System.out.println(libraryAddress);
    }
  public void borrowBook(String bookTitle) {
    for (Book book: bookList) {
        if (book.getTitle().equals(bookTitle)) {
           if (!book.isBorrowed()) {
              System.out.println("You successfully borrowed " + book.getTitle());
              book.rented();
              return;
           }else{
              System.out.println("Sorry, this book is already borrowed.");
              return;
          }
        }
      }
    System.out.println("Sorry, this book is bot in our catalog.");
    }

  public void printAvailableBooks() {
    boolean isEmpty=false;
    for (Book book : bookList) {
           if (!book.isBorrowed()) {
              System.out.println(book.getTitle());
              isEmpty=book.isBorrowed();
      }
    }
    if (bookList.size() == 0 || isEmpty) {
      System.out.println("No book in catalog.");
    }
  }
          
  public void returnBook(String bookTitle) {
    for (Book book : bookList) {
     if (book.getTitle().equals(bookTitle)) {
          book.returned();
          System.out.println("You successfully returned " + bookTitle);
     } 
    }
  }
  // 


    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 
