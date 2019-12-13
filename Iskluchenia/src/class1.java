import java.util.Scanner;
public class class1 {
	public static void main (String [] args){
		try {
		int c = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите 2 числа: ");
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		a = a / c;
		}
		catch (ArithmeticException e) {
			System.out.println("Делить на ноль - нельзя");
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("Делить на ноль - нельзя");
		}
	}
}
//ArrayStoreException ArithmeticException