package week1.day2;

public class IsPrime {
	   //divisible by itself and 1
		public static void main(String[] args) {
			int num =20;
			boolean bPrime = true;
			for (int i = 2; i <num-1; i++) {
				if (num%i==0) {//4%2==0
					System.out.println("Is not a Prime number");
					bPrime=false;
					break;
				}
			}
			if(bPrime) {
				System.out.println("Is a Prime number");
			}
		}

	}
