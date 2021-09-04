package week1.day1;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int firstnum=0;
		int secnum=1;
		int range=8;
		int sum;
		
		System.out.println("Fibonacci Number is " + firstnum );
		for (int i = 1; i <=range; i++) {
		sum=firstnum + secnum;
		firstnum=secnum;
		secnum=	sum;
		System.out.println(sum + ",");
		
		}

	}

}
