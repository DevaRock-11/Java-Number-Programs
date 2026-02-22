package numberPrograms;

import java.util.Scanner;

public class NumPrograms {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("----------Number Programs----------\n");
		System.out.println("1. Factorial\n2. Fibonacci\n3. ReverseNumber\n4. PalindromeNumber\n5. PrimeNumber\n");
		System.out.println("6. SpyNumber\n7. NeonNumber\n8. PerfectNumber\n9. XylemOrPhloem\n10. HappyNumber\n");
		System.out.println("11. StrongNumber\n12. ArmStrongNumber\n13. MagicNumber\n14. DissoriumNumber\n0. Exit\n");
		boolean exit = true;
		int num=0;
		while(exit) {
			System.out.print("\nEnter Choice Here -> ");
			int choice = scan.nextInt();
			
			if(choice != 0) {
			System.out.print("\nEnter Positive Numbers based on choice -> ");
			 num=scan.nextInt();
			}
		switch(choice) {
		
		case 0: exit = false;break;
		case 1: getFactorialValue(num);break;
		case 2: getFibonacciValue(num);break;
		case 3: getReverseNumber(num);break;
		case 4: checkPalindromeNumber(num);break;
		case 5: checkPrimeNumber(num);break;
		case 6: checkSpyNumber(num);break;
		case 7: checkNeonNumber(num);break;
		case 8: checkPerfectNumber(num);break;
		case 9: checkXylemOrPhloem(num);break;
		case 10: checkHappyNumber(num);break;
		case 11: checkStrong(num);break;
		case 12: checkArmStrongNumber(num);break;
		case 13: checkMagicNumber(num);break;
		case 14: checkDissoriumNumber(num);break;
		
		default: System.out.println("Invalid Choice");
		}
		System.out.println("-----------------------------");
		}
	}

	public static void getFactorialValue(int n) {

		// 2! - 1*2 =2
		// 3! - 1*2*3=6 etc...
		int temp = n;
		long fact = 1;
		for (int i = 1; i <= temp; i++) {

			fact = fact * i;
		}

		System.out.println("Factorial value of " + n + " is " + fact);

	}

	public static void getFibonacciValue(int n) {

		// fibonacci numbers 0 1 1 2 3 5 etc...
		int n1 = 0, n2 = 1;

		for (int i = 1; i <= n; i++) {
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
		System.out.println("Fibonacci value of " + n + " is " + n1);

	}
	public static void getReverseNumber(int n) {
		// 12345 -> reverse - 54321
		int temp =n;
		int rev=0;
		
		while(temp > 0) {
			
			int rem=temp%10; //get last digit
			rev=rev*10+rem; // reverse the value
			temp=temp/10; //remove last digit
		}
		System.out.println("Reversed Number "+rev);
	}
	public static void checkPalindromeNumber(int n) {
		
		int temp=n;
		int rev=0;
		
		while(temp != 0) {
			int rem= temp%10; // get last digit
			rev = rev*10+rem; // reverse the value
			temp /= 10; //remove last digit		
		}		
		if(n == rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static void checkPrimeNumber(int n) {
		
		// a prime number can ony be divided by itself and 1 without leaving a remainder. 2,3,5,7,11...
		int count = 0;

		for (int i = 2; i <= n; i++) {

			if (n % i == 0)
				count++;
		}
		if (count == 1)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");

	}

	public static void checkSpyNumber(int n) {

		// 1124 - sum of the number 1 + 1 + 2 + 4 = 8
		// product the number 1 * 1 * 2 * 4 = 8 [ if sum and product are same, it is
		// SpyNumber]
		int rem = 0;
		int sum = 0;
		int product = 1;

		while (n > 0) {
			rem = n % 10;
			sum = sum + rem;
			product = product * rem;
			n /= 10;
		}
		if (sum == product)
			System.out.println("Spy Number");
		else
			System.out.println("Not a Spy Number");
	}

	public static void checkNeonNumber(int n) {

		// 9 - 9^2= 81 -> 8 + 1 = 9
		// square of the number , then sum its digits if sum equals original it is Neon
		// Number

		int rem = 0;
		int sum = 0;
		int square = n * n;

		while (square > 0) {
			rem = square % 10;
			sum = sum + rem;
			square /= 10;
		}
		if (n == sum)
			System.out.println("It is a Neon Number");
		else
			System.out.println("It is not a Neon Number");
	}

	public static void checkPerfectNumber(int n) {

		// 28 - 1 + 2 + 4 + 7 + 14 = 28 [sum of all factors is same as give number then
		// it is Perfect]
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		if (n == sum)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");
	}

	public static void checkXylemOrPhloem(int n) {

		// 12225 - 1+5(extreme digit) = 2+2+2(mean digit)
		int temp = n;
		int extreme = 0;
		int mean = 0;

		while (temp > 0) {

			if (temp == n || temp < 10) {// to add 1st digit and last digit
				extreme = extreme + temp % 10;
			} else {
				mean = mean + temp % 10; // to add inbetween digits
			}
			temp = temp / 10;
		}

		if (extreme == mean)
			System.out.println("Xylem");
		else
			System.out.println("Phloem");
	}

	public static void checkHappyNumber(int n) {

		/*
		 * 320- 3^2 + 2^2 + 0^2 =13 || 13- 1^2 + 3^2 =10 || 10- 1^2 + 0^2 =1 || finally
		 * we get 1 so it is a Happy Number
		 */
		int temp = n;
		while (temp != 1 && temp != 4) {

			int sum = 0;
			while (temp > 0) {

				int rem = temp % 10;
				sum += rem * rem;
				temp /= 10;
			}
			temp = sum;
		}
		if (temp == 1)
			System.out.println("Happy Number");
		else
			System.out.println("Sad Number");

	}

	public static void checkStrong(int n) {

		// 145 - 1! + 4! + 5! = 145 so it is a strong numberc
		int temp = n, sum = 0;
		while (temp > 0) {

			int rem = temp % 10, fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;
			temp /= 10;
		}
		if (sum == n)
			System.out.println("Strong Number");
		else
			System.out.println("Not Strong Number");
	}

	public static void checkArmStrongNumber(int n) {

		// sum of its digits powered by the digit count and compare it to the original
		// number
		// 153 - 1^3 + 5^3 + 3^3 = 153
		int temp1 = n;
		int temp2 = n;
		int sum = 0, numLength = 0;

		while (temp1 > 0) {

			numLength++;
			temp1 /= 10; // or temp1 = temp1/10
		}

		while (temp2 > 0) {

			int rem = temp2 % 10;
			int power = 1;

			for (int i = 1; i <= numLength; i++) {

				power = power * rem;
			}
			sum = sum + power;
			temp2 /= 10;
		}
		if (sum == n)
			System.out.println("ArmStrong Number");
		else
			System.out.println("Not ArmStrong Number");

	}

	public static void checkMagicNumber(int n) {

		// 1792 - 1+7+9+2 = 19
		// 19 - 1 + 9 = 10
		// 10 - 1 + 0 = 1 [until a single digit is reached. if that is a 1, it is magic
		// number.
		int temp = n;

		while (temp > 9) {

			int sum = 0;
			while (temp > 0) {

				int rem = temp % 10;
				sum = sum + rem;
				temp /= 10;
			}
			temp = sum;
		}
		if (temp == 1)
			System.out.println("Magic Number");
		else
			System.out.println("Not Magic Number");
	}

	public static void checkDissoriumNumber(int n) {

		// 135 - 1^1 + 3^2 + 5^3 = 135
		// 89 - 8^1 + 9^2 = 89
		int temp1 = n, temp2 = n, sum = 0, count = 0;

		while (temp1 > 0) {
			count++;
			temp1 /= 10;
		}

		while (temp2 > 0) {

			int rem = temp2 % 10;
			int fact = 1;

			for (int i = 1; i <= count; i++) {
				fact = fact * rem;
			}
			count--;
			sum = sum + fact;
			temp2 /= 10;
		}
		if (sum == n)
			System.out.println("Dissorium Number");
		else
			System.out.println("Not Dissorium Number");
	}

}
