package CMRIT.Navya;

import CMRIT.Navya.Chocolate;
import CMRIT.Navya.Cookies;
import CMRIT.Navya.Gift;
import CMRIT.Navya.Sweet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate s1=new Chocolate("Perk",7.9,100,50);
		Chocolate s2=new Chocolate("Milky",15.5,200,45);
		Cookies c1=new Cookies("Chunk",31.2,112,120);
		Cookies c2=new Cookies("Unibic",13.2,58,100);
		Sweet []s=new Sweet[4];
		s[0]=s1;
		s[1]=s2;
		s[2]=c1;
		s[3]=c2;
		Gift g=new Gift(s);
		g.sort();
		g.getDisplay();

	}

}
