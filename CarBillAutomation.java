// A Car dealer wants to automate the billing process of cars based on the car selected.
// Java Code:
package carproject;
import java.util.*;
public class CarBillAutomation {
		private static int carcost, ccost, discount = 0, insurance_cost = 0, additional_cost = 0, rto_charges = 113990, tcs_charges = 11000;
		private static float value;
		private static String name;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Car Number - Car Model - Price");
		System.out.println("1-Polo Trendline - 8.70 lakh");
		System.out.println("2-Polo Highline - 10.09 lakh");
		System.out.println("3-Virtus Trendline - 11.05 lakh");
		System.out.println("4-Virtus Highline - 13.08 lakh");
		System.out.println("5-Taigun Trendline - 14.89 lakh");
		System.out.println("6-Taigun Highline - 15.42 lakh");
		System.out.println("7-Taigun Topline - 17.71 lakh");
		System.out.print("Enter car number you want to buy : ");
		int option = sc.nextInt();
		switch(option) {
			case 1:
				System.out.println("Selected car model : Polo Trendline"); 
				name = "Polo Trendline";
				ccost = carcost = 870000;
				break;
			case 2:
				System.out.println("Selected car model : Polo Highline");				
				ccost = carcost = 1009000;
				name = "Polo Highline";
				break;
			case 3:
				System.out.println("Selected car model : Virtus Trendline");
				ccost = carcost = 1105000;
				name = "Virtus Trendline";
				break;
			case 4:
				System.out.println("Selected car model : Virtus Highline");
				ccost = carcost = 1308000;
				name = "Virtus Highline";
				break;
			case 5:
				System.out.println("Selected car model : Taigun Trendline");
				ccost = carcost = 1489000;
				name = "Taigun Trendline";
				break;
			case 6:
				System.out.println("Selected car model : Taigun Highline");
				ccost = carcost = 1542000;
				name = "Taigun Highline";
				break;
			case 7:
				System.out.println("Selected car model : Taigun Topline");
				ccost = carcost = 1771000;
				name = "Taigun Topline";
				break;
			default:
				System.out.println("Enter valid option");
		}
		System.out.print("Do you need insurance : ");
		String insurance = sc.next();
		System.out.print("Do you need Additional Accessories : ");
		String additional = sc.next();
		if(insurance.equals("yes") || additional.equals("yes")) {
			System.out.print("Dealer Discount : ");
			String input = sc.next();
			if(input.contains("%")) {
				discount = Integer.parseInt(input.substring(0,input.length() - 1));
				value = (float)discount / 100;
				discount = (int) (value * carcost);
				if(discount > 30000) {
					System.out.println("Maximum discount to be applied should not cross 30,000");
					discount = 30000;
				}
			}else {
				discount = Integer.parseInt(input);
				if(discount > 30000) {
					System.out.println("Maximum discount to be applied should not cross 30,000");
					discount = 30000;
				}
			}
		}else {
			System.out.println("Dealer discount : 0");
		}
		if(insurance.equals("yes")&& additional.equals("yes")) {
			insurance_cost = 47300;
			additional_cost = 15000;
			carcost = carcost + insurance_cost + additional_cost + tcs_charges + rto_charges;
		}else if(insurance.equals("yes")) {
			insurance_cost = 47300;
			carcost = carcost + insurance_cost + tcs_charges + rto_charges;
		}else if(additional.equals("yes")) {
			additional_cost = 15000;
			carcost = carcost + additional_cost + tcs_charges + rto_charges;
		}else {
			carcost = carcost + tcs_charges + rto_charges;
		}
		System.out.println("Total cost " + (carcost - discount) + "(" + name + " " + ccost + " + " + rto_charges + "(RTO) + " + insurance_cost + "(Insurance) + " + tcs_charges + "(TCS) + " + additional_cost + "(Additional Accessories) - " + discount + "(Dealer discount))");	
	}
}
