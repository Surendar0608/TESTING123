package miniProjectCoreJava;

import java.util.Scanner;

class BankAccount{
	private String Name;
	private String Ac_No;
	private String Ph_No;
	private double Balance;
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public String getAc_No(){
		return Ac_No;
	}
	public void setAc_No(String Ac_No){
		this.Ac_No = Ac_No;
	}
	public String getPh_No() {
		return Ph_No;
	}
	public void setPh_No(String Ph_No){
		this.Ph_No = Ph_No;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double Balance){
		this.Balance = Balance;
	}
	BankAccount(String Name, String Ac_No, String Ph_No, double Balance){
		this.Name=Name;
		this.Ac_No=Ac_No;
		this.Ph_No=Ph_No;
		this.Balance=Balance;
	}
	Scanner sc = new Scanner(System.in);
	public void viewAccountDetails(){    //View the Account Details...
		System.out.println("Account Details:");
		System.out.println("Name : "+Name);
		System.out.println("Account Number : "+Ac_No);
		System.out.println("Phone Number : "+Ph_No);
		System.out.println("Balance : "+Balance);
	}
	public void depositAmount(){       //Deposit the Amount...
		double D_Amount;
		System.out.println("Enter Deposit Amount:");
		D_Amount=sc.nextDouble();
		Balance+=D_Amount;
		System.out.println("Deposited Successfully...,Your current balance is "+Balance);
	}
	public void withdrawAmount(){     //Withdraw Amount...
		double W_Amount;
		System.out.println("Enter Withdraw Amount:");
		W_Amount=sc.nextDouble();
		if(Balance>=W_Amount){
			Balance-=W_Amount;
			System.out.println("Withdraw Successfully...,Your current balance is "+Balance);
		}
		else{
			System.out.println("Withdraw Unsuccessfull... "+Balance+" is left");
		}
	}
}

public class SimpleBankingApplication {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("Swetha.U", "ABC170254", "9876543210", 5000.00);
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("1.Display Account Details \n2.Deposit the Amount \n3.Withdraw the Amount \n4.Exit");
		do {
			System.out.println("Enter Your Choice:");
			ch = sc.nextInt();
			switch(ch){
			case 1:
				account.viewAccountDetails();
				break;
			case 2:
				account.depositAmount();
				break;
			case 3:
				account.withdrawAmount();
				break;
			case 4:
				System.out.println("See you soon...");
				break;
			}
		}while(ch<4);
	}
}
