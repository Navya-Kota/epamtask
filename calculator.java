package project1.Raviteja;

import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int confirm;
		Scanner sc = new Scanner(System.in);
		confirm=1;
		do{
			float operand1 = sc.nextInt();
			float operand2 = sc.nextInt();
			char choice = sc.nextLine().charAt(0);
		     switch(choice) {
		       case '+':
			     System.out.println(operand1+operand2);
			     break;
		       case '-': 
			     System.out.println(operand1-operand2);
			     break;
		       case '*':
			     System.out.println(operand1*operand2);
			     break;
		       case'/':
			     System.out.println(operand1/operand2);
			     break;
		}	
		     System.out.println("do you want to continue");
		     confirm=sc.nextInt();
		} while(confirm!=0);
		sc.close();
		System.out.println("calculator is turned off");

	}

}
