package BankImpl;

import Bank.DebitInterest;
import Bank.LoanAcc;

public class PersonalLoanAcc implements LoanAcc, DebitInterest {

	public PersonalLoanAcc() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Created Account : " + PersonalLoanAcc.personalLoan);
	}

	@Override
	public void calcInt() {
		// TODO Auto-generated method stub
		System.out.println("Calculate Interest : " + PersonalLoanAcc.personalLoanAcc + "%");

	}

	@Override
	public void deductMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Deduct monthly interest");

	}

	@Override
	public void deductHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Deduct half yearly interest");

	}

	@Override
	public void deductAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Deduct yearly interest");

	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Repay Principal");

	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("Pay Interest");

	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Pay partial Principal");

	}

}
