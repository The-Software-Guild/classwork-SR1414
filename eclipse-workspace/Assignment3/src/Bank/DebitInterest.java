package Bank;

public interface DebitInterest extends Interest {

	public void deductMonthlyInt();

	public void deductHalfYrlyInt();

	public void deductAnnualInt();

}
