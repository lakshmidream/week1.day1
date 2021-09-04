package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		int range =num/2;
		boolean prime =false;
		for (int i = 2; i <=range ; i++) {
			if (num % i == 0) {
				System.out.println("The Number" + num + "is  NOT a Prime Number");
				prime = true;
				break;
			}
		}
			if (prime==false) {
			System.out.println("The Number " + num + " is a Prime Number");
		}
	}


}
