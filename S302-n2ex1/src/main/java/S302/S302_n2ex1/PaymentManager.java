package S302.S302_n2ex1;

public class PaymentManager
{
	private Callback callback = () -> {
		return Input.readString("Introdueix la forma de pagament");
	};
	
	public String payment(int quantity)
	{
		return callback.method();
	}

	public Callback getCallback()
	{
		return callback;
	}
}
