package CMRIT.Navya;

import CMRIT.Navya.Sweet;

public class Gift {
	private Sweet[] s1=new Sweet[4];
	Gift(Sweet s[]){
		for(int i=0;i<4;i++) {
			this.s1[i]=s[i];
		}
	}
	void sort() {
		Sweet temp;
		for(int i =0;i<4;i++) {
			for(int j=i;j<4;j++) {
				if (s1[i].getweightOfSweet()>s1[j].getweightOfSweet()){
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
	}
	void getDisplay() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("             The gifts are sorted based on weight                        ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("S.No"+"\t"+"Name"+"\t\t"+"Weight"+"\t\t"+"Sugar content"+"\t"+"Cost");
		System.out.println("---------------------------------------------------------------------");
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"\t"+s1[i].nameOfSweet+"\t\t"+s1[i].weightOfSweet+"gm\t\t"+s1[i].sugarContentOfSweet+"g\t\t"+s1[i].costOfSweet+"rs");
		}
		System.out.println("---------------------------------------------------------------------");
	}


}
