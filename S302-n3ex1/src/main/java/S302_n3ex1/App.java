package S302_n3ex1;

public class App 
{
    public static void main( String[] args )
    {
    	ItemList list = new ItemList();
    	list.addItem(new Item("portàtil", 789.99f));
    	list.addItem(new Item("ratolí", 15.99f));
    	list.addItem(new Item("SSD", 58.99f));
    	
    	list.showConvertedPrices(new DollarConverter());
    	list.showConvertedPrices(new PoundConverter());
    }
}
