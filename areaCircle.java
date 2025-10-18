public class areaCircle {
    private double radius;

    public areaCircle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius *radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public void display(){
        System.out.printf("Radius :", radius);
         System.out.printf("Area :", getArea());
          System.out.printf("Circumference :", getCircumference());
    }
    public static void main(String[] args){
        areaCircle c1 = new areaCircle(6);
        System.out.println("Radius of Circle 6");
        c1.display();
        
        areaCircle c2 = new areaCircle(12);
        System.out.println("radius of circle 12");
        c2.display();
    }
}
