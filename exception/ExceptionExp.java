/**
Types of error:-
1. Complile - time error
2. Runtime error -> Exception handling
3. Logical error

Error and Exception extends Throwable class.
Throwable class is extended by Object class.

Error is divided into :-
1. Thread Death
2. Virtual Machine error ( Out of memory)
3. IO Error

Exception is divided into:-
1. Runtime Exception  (Unchecked Exception)
	- Arithmetic 
	- ArrayIndexOutOfBound
	- Null POinter
- It is your choose to handle or not

2. SQL Exception   (Checked Exception)
- It is necessary to handle

3. IO Exception  (Checked Exception)
- It is necessary to handle

**/

package exception;

import java.io.*;
import java.sql.*;

public class ExceptionExp {

    public static void main(String[] args) {

        // 1. Arithmetic Exception (Unchecked)
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException (Unchecked)
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: " + e.getMessage());
        }

        // 3. NullPointerException (Unchecked)
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }

        // 4. IOException (Checked)
        try {
            FileReader file = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }

        // 5. SQLException (Checked)
        try {
            throw new SQLException("Database connection failed");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }

        // 6. Finally block example
        try {
            int num = 5 / 1;
            System.out.println("Result: " + num);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}