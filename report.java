public class report {
    private String name;
    private int rollNumber;
    private double marks;

    public report(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public char calculateGrade(){
        if(marks >= 90){
            return 'A';
        } else if(marks >= 75){
            return 'B';
        } else if(marks >= 60){
            return 'C';
    } else {
            return 'D';
    }
}

public void displayDetails(){
    System.out.println("Student Details: ");
    System.out.println("Name : " + name);
    System.out.println("Roll no. : " + rollNumber);
    System.out.println("marks :" + marks);
    System.out.println("Grade :" + calculateGrade());
}

public static void main(String[] args){
    report s1 = new report("vani" , 101, 89);

    report s2 = new report("vedansh", 102, 90);

    s1.displayDetails();
    System.out.println()
    ;
    s2.displayDetails();

}
}

