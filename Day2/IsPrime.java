package week4.Day2;

public class IsPrime {

	public static void main(String[] args) {
		int num=91;
		boolean flag = false;
		if (num==0||num==1) {
			flag = true;
		} for (int i = 2; i <num/2; i++) {
			if (num%i==0) {
				flag =true;
				break;
			}
		} 
		if (!flag)
		System.out.println(num+" "+"is a prime number");
		else
		System.out.println(num+" "+"is not a prime number");

	}

}
