package OOPS.inheritance;

public class Inheritance {
    public static void main(String a[]) 
	{
	//	Calc calc = new Calc();
	//	AdvCalc calc = new AdvCalc();
		VeryAdvCalc calc = new VeryAdvCalc();
		
		int r1 = calc.add(4, 5);
		int r2 = calc.sub(7, 3);
		int r3 = calc.multi(5, 3);
		int r4 = calc.div(15, 4);
		double r5 = calc.power(4, 2);
		
		System.out.println("Sum: " + r1);
        System.out.println("Difference: " + r2);
        System.out.println("Product: " + r3);
        System.out.println("Quotient: " + r4);
        System.out.println("Power: " + r5);
	}
}
