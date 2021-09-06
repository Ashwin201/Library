
//CREATE A PROGRAM FOR LIBRARY IN WHICh ADD BOOK,ISSUE BOOK ,RETURN BOOK FUNCTION ALSO THERE



class Libraryy
{
     String[] books;
     int no_of_books;

     Libraryy()
     {
       books =new String[100];
     }

     public void addBooks(String book)
     {
         this.books[no_of_books++]=book;
     }

     public void note()
     {
         System.out.println("NOTE : You can only issue one book at a time.");

     }
     public void show_Available_Books()
     {
         System.out.println("Available Books are....");
         for (String book: books)
         {
             if (book==null)
             {
                 continue;
             }
                 System.out.println("* " + book);

         }
     }
     public void issueBook(String book)
     {
         for (int i=0; i<this.books.length; i++)
         {
             if(this.books[i].equals(book))
             {
                 System.out.println("The "+book+" book has issued .");
                 this.books[i]=null;
                 return;
             }
         }
         System.out.println("The "+book+" doesn't exists in the library.");
     }

     public void return_book(String book)
     {
         System.out.println("++++++++++CURRENTLY+++++++++++");
         this.books[no_of_books++]=book;

     }
}
public class  Library {
    public static void main(String[] args) {
          Libraryy l=new Libraryy();
          l.note();
          l.addBooks("C++");
        l.addBooks("Python");
        l.addBooks("Database and Management System.");
        l.addBooks("Data Structures");
        l.addBooks("Algorithms");
        l.addBooks("Physics");
        l.addBooks("Math");
        l.addBooks("English");
        l.addBooks("Hindi");
        l.show_Available_Books();

        l.issueBook("Math");
        l.show_Available_Books();

        l.return_book("Math");
        l.show_Available_Books();

    }
}