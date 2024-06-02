package hust.soict.cybersecurity.test.cart;

import hust.soict.cybersecurity.aims.cart.Cart;
import hust.soict.cybersecurity.aims.media.Book;
import hust.soict.cybersecurity.aims.media.DigitalVideoDisc;

public class CartTest {
    
    public Cart createCart() {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King", "Animation", "Roger Aller", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addMedia(dvd3);
        
        Book book1 = new Book("Optimization");
        cart.addMedia(book1);
        
        return cart;
    }
        

    /*public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King", "Animation", "Roger Aller", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addMedia(dvd3);

        cart.print();
        cart.searchId(1);
        cart.searchId(4);
        cart.searchTitle("Lion King");
        cart.searchTitle("Doraemon");
    }*/
}
