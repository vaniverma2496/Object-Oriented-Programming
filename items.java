public class items {
    private double itemCode;
    private String itemName;
    private double price;

    public items(double itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void display(){
       System.out.println("code :" + itemCode);
       System.out.println("name :" + itemName);
       System.out.println("price :" + price);

    }
       public static void main(String[] args){
        items item1 = new items(101,"books", 250);
        items item2 = new items(102,"register", 200);

        System.out.println("item1");
        item1.display();
        System.out.println("item2");
        item2.display();
       }
    }