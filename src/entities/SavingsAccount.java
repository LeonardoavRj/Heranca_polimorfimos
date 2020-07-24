package entities;

public class SavingsAccount extends Account{

	private Double interstRate;
	
	public SavingsAccount() {
		super(); 
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interstRate) {
		super(number, holder, balance);
		this.interstRate = interstRate;
	}

	public Double getInterstRate() {
		return interstRate;
	}

	public void setInterstRate(Double interstRate) {
		this.interstRate = interstRate;
	}
	public void updatebalance() {
		balance += balance * interstRate;
	}
	@Override
	public void wihtdraw(double amont) {
		balance -= amont;
	}
}
