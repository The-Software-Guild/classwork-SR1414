package BankImpl;

import Bank.CreditInterest;
import Bank.DepositAcc;

public class FDAcc implements DepositAcc, CreditInterest {

	public FDAcc() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Created Account : " + FDAcc.fixed);

	}

	@Override
	public void calcInt() {
		// TODO Auto-generated method stub
		System.out.println("Calculate Interest : " + FDAcc.fixedDepositAcc + "%");

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
		System.out.println("Withdraw from account : " + FDAcc.fixed);

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit from account : " + FDAcc.fixed);

	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Get balance");

	}

}
