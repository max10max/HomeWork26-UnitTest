public class Book {
    public String name;
    public Author author;
    public int yearCreate;
    public int rating;
    public String textBook;

    public Book(String name, Author author, int yearCreate) {
        this.name = name;
        this.author = author;
        this.yearCreate = yearCreate;
        this.rating = 3;
        this.textBook = " ";
    }

    public void up() {
        if (rating < 5) rating++;
    }

    public void down() {
        if (rating > 0) rating--;
    }

    public  void append (String moreText) {
        StringBuffer endText = new StringBuffer(this.textBook);
        endText.append(moreText);
        this.textBook = endText.toString();
    }
    public String toString(){
        return  name + " " + author +" " + yearCreate;
    }

}