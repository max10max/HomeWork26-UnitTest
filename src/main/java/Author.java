import java.time.LocalDate;

public class Author {
    public String firstName;
    public String secondName;
    public int countBook;

    public Author(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.countBook = 0;
    }

    public String toString(){
        return firstName+" " + secondName;
    }
    public Book newBook(String title){
        return  new Book(title, this, LocalDate.now().getYear());
    }

}