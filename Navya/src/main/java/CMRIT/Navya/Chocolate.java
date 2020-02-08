package CMRIT.Navya;

public class Chocolate extends Sweet {
	Chocolate(String nameOfChocolate,double sugarContentOfCholoate,int weightOfChocolate,int costOfChocolate){
		this.nameOfSweet=nameOfChocolate;
		this.sugarContentOfSweet=sugarContentOfCholoate;
		this.weightOfSweet=weightOfChocolate;
		this.costOfSweet=costOfChocolate;
	}
	public int getweightOfSweet() {
		return weightOfSweet;
	}
}
