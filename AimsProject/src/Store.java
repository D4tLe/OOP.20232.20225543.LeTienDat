import java.util.ArrayList;

public class Store {
	private ArrayList<DigitalVideoDisc> itemsInStore;
	
	public Store() {
		this.itemsInStore = new ArrayList<>();
	}
	
	public void addDVD(DigitalVideoDisc... dvd) {
		for (DigitalVideoDisc d: dvd) {
			itemsInStore.add(d);
		}
		System.out.println("DVDs has been added");
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		for (int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i).equals(dvd)) {
				itemsInStore.remove(i);
				System.out.println("The disc has been remove");
				return;
			}
		}
		System.out.println("The disc does not exist");
	}
	
	public void printStore() {
		System.out.println("***********************Store***********************\nOrdered Items:");
		for (DigitalVideoDisc d: itemsInStore) {
			System.out.println(d.toString());
		}
		System.out.println("***************************************************");
	}
}
