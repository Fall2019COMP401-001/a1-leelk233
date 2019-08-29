package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		
		String[] first_names = new String[count];
		
		String[] last_names = new String[count];
		
		int[] items_bought = new int[count];
		
		double[] sum = new double[count];
				
		for(int i = 0; i<count; i++) {
			first_names[i] = scan.next();
			last_names[i] = scan.next();
			items_bought[i] = scan.nextInt();
				for (int n = 0; n<items_bought[i]; n++) {
					double numbers_bought = scan.nextInt();
					String name_item = scan.next();
					double price_item = scan.nextDouble();
					sum[i] = sum [i] + (numbers_bought * price_item);

				}
		}
		

		scan.close();
		
		for (int i=0; i<count; i++) {
			System.out.println(first_names[i].charAt(0) + ". " + last_names[i] + (": ") + sum[i]);
		}
		
		// System.out.println(values);
		// System.out.println(count);
		// String s1 = "Smith Test";
		// System.out.println((s1.toUpperCase()).charAt(0) + ". " + s1.substring(6) + (": "));
	}
}
// System.out.println(first_names[i] + last_names[i] + items_bought[i]);
// int[] numbers_bought = new int[items_bought[i]];
// String[] name_item = new String[items_bought[i]];
// double[] price_item = new double[items_bought[i]];
// System.out.println(numbers_bought[n] + name_item[n] + price_item[n]);