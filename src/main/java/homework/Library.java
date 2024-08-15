package homework;

public class Library {
    public static void main(String[] args) {
        Author author = new Author("J.K.Rowling", "beth@mail.com");
        Book book = new Book("Harry Potter And The Philosopher's Stone",1997,author,30);
        System.out.println(book);
    }
}
