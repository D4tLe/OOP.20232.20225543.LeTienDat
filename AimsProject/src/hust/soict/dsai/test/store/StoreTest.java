package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King","Animation","Roger Aller",87, 19.95f);
        store.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        store.addDVD(dvd2, dvd3);
        
        store.removeDVD(dvd2);
        
        store.printStore();
	}
}
