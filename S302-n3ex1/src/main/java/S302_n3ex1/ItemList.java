package S302_n3ex1;

import java.util.ArrayList;

public class ItemList
{
	private ArrayList<Item> list = new ArrayList<Item>();

	public ArrayList<Item> getList()
	{
		return list;
	}
	
	public void addItem(Item item)
	{
		list.add(item);
	}
	
	public void showConvertedPrices(Converter converter)
	{
		list.forEach(i -> System.out.println(i.getName() + " " + converter.convertPrice(i.getPrice())));
	}
	
	
}
