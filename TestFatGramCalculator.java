
public class TestFatGramCalculator {
	public static void main(String[] args) {
		
		
		//Create food
		FatGramCalculator food1 = new FatGramCalculator("Crunchy Peanut",539.7,32.22);
		FatGramCalculator food2 = new FatGramCalculator("Muruku",111.0,7.00);
		FatGramCalculator food3 = new FatGramCalculator("Food A",211.0,7.00);
		FatGramCalculator food4 = new FatGramCalculator("Nasi lemak",644.0,383.0);
				
		System.out.println("The percentage of calories from fat for Crunchy Peanut is " +  food1.getPercentCal(food1.getCalFat(32.22), food1.getTotalCal()));
		System.out.println(food1.toString());
		System.out.println("The percentage of calories from fat for Muruku is " + food2.getPercentCal(food2.getCalFat(7.00), food2.getTotalCal()));
		System.out.println(food2.toString());
		System.out.println("The percentage of calories from fat for Food A is " + food3.getPercentCal(food3.getCalFat(7.00), food3.getTotalCal()));
		System.out.println(food3.toString());
		System.out.println("The percentage of calories from fat for Nasi Lemak is " + food4.getPercentCal(food4.getCalFat(83.0), food4.getTotalCal()));
		System.out.println(food4.toString());
		}
	}