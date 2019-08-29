package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		double average = 0;

		String[] item_name = new String[count];
		double[] item_price = new double[count];
		
		for (int i = 0; i<count; i++) {
			item_name[i] = scan.next();
			item_price[i] = scan.nextDouble();
		}
		
		int count2 = scan.nextInt();
		double[] sum = new double[count2];
		String[] first_name = new String[count];
		String[] last_name = new String[count];
		int[] amount_bought = new int[count];
		for (int i = 0; i<count2; i++) {
			first_name[i] = scan.next();
			last_name[i] = scan.next();
			amount_bought[i] = scan.nextInt();
			for (int n = 0; n < amount_bought[i]; n++) {
				double amount_item_bought = scan.nextDouble();
				String item_bought = scan.next();
				for (int j = 0; j<item_name.length; j++) {
					if (item_name[j].equals(item_bought)) {
						sum[i] = sum[i] + (item_price[j] * amount_item_bought);
						average = average + (item_price[j] * amount_item_bought);
						break;
					}
				}
		}
	}
		scan.close();
		System.out.println(min(sum));
		System.out.println(sum.length);
		System.out.println("Biggest: " + first_name[max(sum)] + " " + last_name[max(sum)] + " (" + String.format("%.2f", sum[max(sum)]) + ")");
		System.out.println("Smallest: " + first_name[min(sum)] + " " + last_name[min(sum)] + " (" + String.format("%.2f", sum[min(sum)]) + ")");
		System.out.println("Average: " + String.format("%.2f", (average / count2)));
	}
		public static int min(double[] a) {
			int min = 0;
			for (int i = 1; i<a.length; i++) {

				if (a[i] < a[min]) {
					min = i;
				}
			}
			return min;
		}
		public static int max(double[] a) {
			int max = 0;
			for (int i = 1; i<a.length; i++) {
				if (a[i] > a[max]) {
					max = i;
				}
			}
			return max;
		}

}
	
/*
6
Apple 0.25
Banana 0.75
Milk 3.15
Orange 1.25
Salami 2.50
Sponge 1.15
3 
Carrie Brownstein 3 2 Banana 1 Orange 2 Milk
Corin Tucker 2 3 Banana 2 Sponge
Janet Weiss 1 5 Salami

*/