package BankImpl;

import Bank.CreditInterest;
import Bank.DepositAcc;

public class SavingsAcc implements DepositAcc, CreditInterest {
	
	

	public SavingsAcc() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Created Account : " + SavingsAcc.savings);
		

	}

	@Override
	public void calcInt() {
		// TODO Auto-generated method stub
		System.out.println("Calculate Interest : " + SavingsAcc.intPerSavingAcc + "%");

	}

	@Override
	public void addMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Add monthly interest");

	}

	@Override
	public void addHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Add half yearly interest");

	}

	@Override
	public void addAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Add yearly interest");

	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw from savings account");

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit into savings account");

	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Get Balance");

	}

}
