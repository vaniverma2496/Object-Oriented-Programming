public class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //display details
    public void displayDetails(){
        System.out.println("Name :"+ name);
         System.out.println("id :"+ id);
          System.out.println("salary :"+ salary);
    }


  
    public static void main(String[] args){
        Employee emp1 = new Employee("vani", 1, 50000);
        Employee emp2 = new Employee("vedansh", 2, 60000);

        System.out.println("Employee 1:");
        emp1.displayDetails();

        System.out.println("Employee 2:");
        emp2.displayDetails();
    }
}

