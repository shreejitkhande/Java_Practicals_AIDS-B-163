// Addition Class
public class addition {

    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {

        addition add_Object = new addition();
        int number1 = 10;
        int number2 = 20;
        int result = add_Object.add(number1, number2);
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}

// YCCE Class
public class YCCE {
    String name;
    String semester;
    String year;


    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Semester " + semester);
        System.out.println("Year: " + year);
    }
}

class DisplayDataDemo {
    public static void main(String[] args) {

        YCCE student = new YCCE();

        student.name = "Shreejit";
        student.semester = "4th";
        student.year = "2nd";

        student.displayDetails();
    }
}

// Department Class
class Department {
  
    String deptName;
    int deptCode;
    int totalStaff;

    void display() {
      
        System.out.println("Department Name : " + deptName);
        System.out.println("Department Code : " + deptCode);
        System.out.println("Total Staff     : " + totalStaff);
    }
  
    public static void main(String[] args) {

        Department d = new Department();
      
        d.deptName = "Computer Technology";
        d.deptCode = 107;
        d.totalStaff = 25;
      
        d.display();
    }
}
