package S302.S302_n2ex1;

public class Shop
{
	private String name;
	private PaymentManager paymentManager;

	public Shop(String name, PaymentManager paymentManager)
	{
		this.name = name;
		this.paymentManager = paymentManager;
	}

	public String getName()
	{
		return name;
	}
	
	public PaymentManager getPaymentManager()
	{
		return paymentManager;
	}
	
	public void setPaymentManager(PaymentManager paymentManager)
	{
		this.paymentManager = paymentManager;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void transaction(int quantity)
	{
		String method = paymentManager.payment();
		System.out.println("La botiga " + name + " ha venut productes per valor de "
				+ quantity + " euros, i tal quantitat s'ha pagat amb " + method);
	}
		
}
