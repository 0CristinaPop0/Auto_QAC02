package homework;

public class Book {

    private String name;
    private int year;
    private double price;
    private Author author;

    //constructor
    public Book(String name, int year, Author author, double price){
        this.name=name;
        this.year=year;
        this.price=price;
        this.author=author;
    }
    public String getName()
    {
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getYear(){
        return year;
    }
    @Override
    public String toString() {
        return name + " (" + price + " RON), by " + author.getName() + " published in " + year;
    }

}
