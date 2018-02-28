package pkgCore;
import org.apache.poi.ss.formula.functions.Finance;
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
		this.intrestRate = intrestRate;
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
	
	public double monthlyPayment()
	{
		return Finance.pmt(intrestRate/12, loanLen, totalPrice-downPay);
	}
	
	public double totalIntrestPay()
	{
		return (loanLen*monthlyPayment()) + (totalPrice-downPay);	
		
	}
	
}
