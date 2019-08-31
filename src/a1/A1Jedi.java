package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();

		String[] item_name = new String[count];
		double[] item_price = new double[count];
		int[] item_amount_bought = new int[count];
		int[] amount_customers_that_bought = new int[count];
		boolean[] norepeat = new boolean[count];
		
		
		for (int i = 0; i<count; i++) {
			item_name[i] = scan.next();
			item_price[i] = scan.nextDouble();
		}
		
		int count2 = scan.nextInt();
		double[] sum = new double[count2];
		String[] first_name = new String[count2];
		String[] last_name = new String[count2];
		int[] amount_bought = new int[count2];
		for (int i = 0; i<count2; i++) {
			first_name[i] = scan.next();
			last_name[i] = scan.next();
			amount_bought[i] = scan.nextInt();
			for (int n = 0; n < amount_bought[i]; n++) {	
				int[] amount_item_bought = new int[amount_bought[i]];
				String[] item_bought = new String[amount_bought[i]];
				amount_item_bought[n] = scan.nextInt();
				item_bought[n] = scan.next();
				for (int j = 0; j < count; j++) {
					if (item_bought[n].equals(item_name[j])) {
						item_name[j] = item_bought[n];
						item_amount_bought[j] = item_amount_bought[j] + amount_item_bought[n];
						if (!norepeat[j]) {
							amount_customers_that_bought[j] = amount_customers_that_bought[j] + 1;
							norepeat[j] = true;
						}
					}

					

				}
				
		}
			for (int n = 0; n < norepeat.length; n++) {
				norepeat[n] = false;
			}
	}

		scan.close();
		for (int i = 0; i<count; i++) {
			System.out.println(customers(amount_customers_that_bought[i]) + " customers bought " + zero(item_amount_bought[i]) + item_name[i]);
		}
	}
	public static String customers(int a) {
		if (a == 0) {
			return "No";
		} else {
			return "" + a;
		}
	}
	public static String zero(int a) {
		if (a == 0) {
			return "";
		} else {
			return a + " ";
		}
	}
}
