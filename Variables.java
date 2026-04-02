public class Variables {
    public static void main(String[] args) {
        // Variable declaration and initialization
        int age = 25; // integer variable
        double salary = 50000.50; // double variable
        char grade = 'A'; // character variable
        String name = "Ankur anand"; // string variable

        // Printing variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);

        // Updating variable values
        age = 26; // updating age
        salary = 55000.75; // updating salary

        // Printing updated variables
        System.out.println("Updated Age: " + age);
        System.out.println("Updated Salary: " + salary);
       
        // Type casting demonstration
        Variables variables = new Variables();
        variables.typeCasting();
    }

    public void typeCasting() {
        // Implicit type casting
        int num = 100;
        double doubleNum = num; // int to double (widening)
        System.out.println("Implicit Casting: " + doubleNum);

        // Explicit type casting
        double pi = 3.14159;
        int intPi = (int) pi; // double to int (narrowing)
        System.out.println("Explicit Casting: " + intPi);
    }
}
