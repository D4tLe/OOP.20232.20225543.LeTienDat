package lab02;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
			
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= 20) {
			System.out.println("The cart is almost full");
		} else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("The disc has been added");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (disc.equals(itemsOrdered[i])) {
				for (int j = i + 1; j < qtyOrdered; j++) {
					itemsOrdered[j - 1] = itemsOrdered[j];
				}
				qtyOrdered = qtyOrdered - 1;
				itemsOrdered[qtyOrdered] = null;
				System.out.println("The disc has been remove");
				return;
			}
		}
		System.out.println("The disc was not found");
	}
	
	public float totalCost() {
		float cost = 0.0f;
		for (int i = 0; i < qtyOrdered; i++) {
			cost += itemsOrdered[i].getCost();
		}
		
		return cost;
	}
}
