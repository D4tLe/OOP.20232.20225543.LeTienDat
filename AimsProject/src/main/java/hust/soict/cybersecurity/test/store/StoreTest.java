package hust.soict.cybersecurity.test.store;

import hust.soict.cybersecurity.aims.media.DigitalVideoDisc;
import hust.soict.cybersecurity.aims.store.Store;

public class StoreTest {

    public StoreTest() {
    }

    public Store createStore() {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King", "Animation", "Roger Aller", 87, 19.95f);
        store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin2", "Animation", 19.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladin3", "Animation", 20.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin4", "Animation", 20.99f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Aladin5", "Animation", 20.99f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Aladin6", "Animation", 20.99f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Aladin7", "Animation", 20.99f);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Aladin8", "Animation", 20.99f);

        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);
        store.addMedia(dvd6);
        store.addMedia(dvd7);
        store.addMedia(dvd8);
        store.addMedia(dvd9);
        store.addMedia(dvd10);

        return store;
    }

    /*public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King", "Animation", "Roger Aller", 87, 19.95f);
        store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        store.removeMedia(dvd2);

        store.print();
    }*/
}
