package pkgCore;

public class CarStats
{
	// Attributes
	private double totalPrice, downPay, intrestRate;
	private int loanLen;
	
	//Methods
	public CarStats(double totalPrice, double downPay, double intrestRate, int loanLen)
	{
		super();
		this.totalPrice = totalPrice;
		this.downPay = downPay;
		this.intrestRate = intrestRate/100 + 1;
		this.loanLen = loanLen;
	}

	public double getTotalPrice()
	{
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	public double getDownPay()
	{
		return downPay;
	}

	public void setDownPay(double downPay)
	{
		this.downPay = downPay;
	}

	public double getIntrestRate()
	{
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate)
	{
		this.intrestRate = intrestRate;
	}

	public int getLoanLen()
	{
		return loanLen;
	}

	public void setLoanLen(int loanLen)
	{
		this.loanLen = loanLen;
	}
	
	public double getPrincipal()
	{
		return totalPrice - downPay;
	}
	
	public double monthlyPayment()
	{
		return ((getPrincipal()) * intrestRate) / loanLen;
	}
	
	public double totalIntrestPay()
	{
		return getPrincipal() * intrestRate - getPrincipal();
	}
	
}
