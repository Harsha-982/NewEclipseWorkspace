package cart;

import java.util.ArrayList;
import java.util.Collection;

public class storage {
	ArrayList<storage> listOfItems=new ArrayList<storage>();
	private String Item; 
	public void addItem(Collection<? extends storage> name) {
		listOfItems.addAll(name);
	}
	public void removeItem(String name) {
		listOfItems.remove(name);
	}
	public String getItem() {
		return Item;
	}
	public ArrayList<storage> getCart(){
		return listOfItems;
	}
	
}
