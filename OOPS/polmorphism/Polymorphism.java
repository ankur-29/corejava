package OOPS.polmorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of 2 and 3: " + calc.add(2, 3));
        System.out.println("Addition of 1.5, 2.5 and 3.5: " + calc.add(1.5, 2.5, 3.5));
        System.out.println("Subtraction of 5 from 10: " + calc.subtract(10, 5));
        System.out.println("Multiplication of 4 and 6: " + calc.multiply(4, 6));
        System.out.println("Division of 20 by 4: " + calc.divide(20, 4));
    }   
}
