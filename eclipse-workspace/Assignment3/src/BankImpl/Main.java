package BankImpl;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAcc savingAcc = new SavingsAcc();
		FDAcc fixedDepositAcc = new FDAcc();
		PersonalLoanAcc personalLoanAcc = new PersonalLoanAcc();
		HousingLoanAcc housingLoanAcc = new HousingLoanAcc();
		
		
		System.out.println("---------------------------------------\n");
		savingAcc.createAcc();
		savingAcc.calcInt();
		savingAcc.addMonthlyInt();
		savingAcc.addHalfYrlyInt();
		savingAcc.addAnnualInt();
		savingAcc.withdraw();
		savingAcc.deposit();
		savingAcc.getBalance();
		System.out.println("---------------------------------------\n");
		fixedDepositAcc.createAcc();
		fixedDepositAcc.calcInt();
		fixedDepositAcc.addMonthlyInt();
		fixedDepositAcc.addHalfYrlyInt();
		fixedDepositAcc.addAnnualInt();
		fixedDepositAcc.withdraw();
		fixedDepositAcc.deposit();
		fixedDepositAcc.getBalance();
		System.out.println("---------------------------------------\n");
		personalLoanAcc.createAcc();
		personalLoanAcc.calcInt();
		personalLoanAcc.deductMonthlyInt();
		personalLoanAcc.deductHalfYrlyInt();
		personalLoanAcc.deductAnnualInt();
		personalLoanAcc.repayPrincipal();
		personalLoanAcc.payInterest();
		personalLoanAcc.payPartialPrincipal();
		System.out.println("---------------------------------------\n");
		housingLoanAcc.createAcc();
		housingLoanAcc.calcInt();
		housingLoanAcc.deductMonthlyInt();
		housingLoanAcc.deductHalfYrlyInt();
		housingLoanAcc.deductAnnualInt();
		housingLoanAcc.repayPrincipal();
		housingLoanAcc.payInterest();
		housingLoanAcc.payPartialPrincipal();
		System.out.println("---------------------------------------\n");
		

	}

}
