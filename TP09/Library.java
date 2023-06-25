package TP09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Category> categories;
    private List<BorrowedBook> borrowedBooks;
    private Map<Student, List<BorrowedBook>> borrowedBooksByStudent;


    public Library() {
        categories = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
        borrowedBooksByStudent = new HashMap<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public List<Category> getCategories() {
        return categories;
    }

    public List<Book> getAllBooks() {
        List<Book> allBooks = new ArrayList<>();
        for (Category category : categories) {
            allBooks.addAll(category.getBooks());
        }
        return allBooks;
    }

    public List<Book> getBooksByCategory(String categoryName) {
        for (Category category : categories) {
            if (category.getName().equalsIgnoreCase(categoryName)) {
                return category.getBooks();
            }
        }
        return new ArrayList<>();
    }

    public List<Book> getBooksByYear(int year) {
        List<Book> booksByYear = new ArrayList<>();
        for (Category category : categories) {
            for (Book book : category.getBooks()) {
                if (book.getYear() == year) {
                    booksByYear.add(book);
                }
            }
        }
        return booksByYear;
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Category category : categories) {
            for (Book book : category.getBooks()) {
                if (book.isAvailable()) {
                    availableBooks.add(book);
                }
            }
        }
        return availableBooks;
    }

    public void addBook(Category category) {
        category.addBook();
    }


    public void decreaseBookByISBN(String isbn) {
        for (Category category : categories) {
            if (category.removeBook(isbn)) {
                break;
            }
        }
    }

    public void removeBookByISBN(String isbn) {
        for (Category category : categories) {
            category.removeBook(isbn);
        }
    }

    //   -------------       error
    public void addCopiesOfBook(String isbn, int numCopies) {
        for (Category category : categories) {
            category.addCopiesOfBook(isbn, numCopies);
        }
    }

    public void markBookUnavailable(String isbn) {
        for (Category category : categories) {
            category.markBookUnavailable(isbn);
        }
    }

    public boolean borrowBook(Book book, Student student) {
        if (studentCanBorrowMoreBooks(student) && book.isAvailable()) {
            BorrowedBook borrowedBook = new BorrowedBook(book, student);
            borrowedBooks.add(borrowedBook);
            borrowedBooksByStudent.computeIfAbsent(student, k -> new ArrayList<>()).add(borrowedBook);
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public void listStudentsWithBorrowedBooks() {
        for (Map.Entry<Student, List<BorrowedBook>> entry : borrowedBooksByStudent.entrySet()) {
            Student student = entry.getKey();
            List<BorrowedBook> borrowedBooks = entry.getValue();
            System.out.println("Student: " + student.getName());
            for (BorrowedBook borrowedBook : borrowedBooks) {
                System.out.println("Book: " + borrowedBook.getBook().getTitle());
                System.out.println("Borrow Date: " + borrowedBook.getBorrowDate());
                System.out.println("Return Date: " + borrowedBook.getReturnDate());
                System.out.println();
            }
        }
    }

    public void returnBook(Book book, Student student) {
        List<BorrowedBook> borrowedBooks = borrowedBooksByStudent.get(student);
        if (borrowedBooks != null) {
            for (BorrowedBook borrowedBook : borrowedBooks) {
                if (borrowedBook.getBook().equals(book) && borrowedBook.getReturnDate() == null) {
                    borrowedBook.setReturnDate(LocalDate.now());
                    book.setAvailable(true);
                    break;
                }
            }
        }
    }

    private boolean studentCanBorrowMoreBooks(Student student) {
        List<BorrowedBook> borrowedBooks = borrowedBooksByStudent.get(student);
        return borrowedBooks == null || borrowedBooks.size() < 5 && !hasOverdueBooks(borrowedBooks);
    }

    private boolean hasOverdueBooks(List<BorrowedBook> borrowedBooks) {
        LocalDate currentDate = LocalDate.now();
        for (BorrowedBook borrowedBook : borrowedBooks) {
            if (borrowedBook.getReturnDate() == null &&
                    borrowedBook.getBorrowDate().plusWeeks(1).isBefore(currentDate)) {
                return true;
            }
        }
        return false;
    }
}
class BorrowedBook {
    private Book book;
    private Student student;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowedBook(Book book, Student student) {
        this.book = book;
        this.student = student;
        this.borrowDate = LocalDate.now();
        this.returnDate = null;
    }

    public Book getBook() {
        return book;
    }

    public Student getStudent() {
        return student;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}