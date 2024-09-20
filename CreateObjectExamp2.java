class Book{
    String title;
    String author;
    //without constructor(default constructor)
    void display(){
        System.out.println("Title: " + title + "Author: " + author);
    }
}

public class CreateObjectExamp2 {
    public static void main(String args[]){
        Book b=new Book();
        //Setting fields
         b.title="The Great Gatsby";
         b.author="F.Scott Fitzgerald";
         b.display();
    }
}
