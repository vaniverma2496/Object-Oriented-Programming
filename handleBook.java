public class handleBook {
    private String title;
    private String author;
    private double price;

    public handleBook(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display(){
        System.out.println("BookName: "+ title);
         System.out.println("authorName: "+  author);
          System.out.println("amount: "+ price);
    }


public static void main(String[] args){
    handleBook book1 = new handleBook("photography", "alizabeth", 250);

     handleBook book2 = new handleBook("science", "abdul kalam", 300);

     System.out.println("Book1");
     book1.display();
     System.out.println("Book2");
     book2.display();

}
}