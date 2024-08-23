package week4.Day2;

public class Fibonacciseries {

	public static void main(String[] args) {
		int n=8;
		int num1 =0, num2=1;
		System.out.println("fibonacci Series:"+num1+" "+num2);
for (int i=2; i<n; i++) {
	int num3 = num1 + num2;
System.out.println(""+num3);
num1 = num2;
num2 = num3;

}
	}

}
