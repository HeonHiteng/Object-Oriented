
public class FatGramCalculator {

	public String food;
	private double totalCal;
    public double fat;
	public double calFat;
	public double percentCal;
	
	public FatGramCalculator() {	
	}
	
	public FatGramCalculator(String food,double totalCal,double fat) {
		this.food=food;
		this.totalCal=totalCal;
		this.fat=fat;
	}
	
	public double getTotalCal() {
		return totalCal;	
	}
	
	public void setTotalCal(double totalCal) {
		this.totalCal=totalCal;
	}
	
	public double getCalFat(double fat){
		calFat = fat*9;
		return calFat;
	}
	
	public double getPercentCal(double calFat,double totalCal){
		percentCal = (calFat/totalCal)*100;
		return percentCal;
	}
	
	public String toString() {
		if (getCalFat(fat) > getTotalCal()) {
			return "Input is invalid.";
		} else if (getCalFat(fat) < (0.3 * getTotalCal())) {
			return "The food is low in fat.";
		} else {
			return "The food is high in fat.";
		}
	}
}
