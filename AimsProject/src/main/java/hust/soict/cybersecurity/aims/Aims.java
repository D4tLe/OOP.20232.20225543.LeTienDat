package hust.soict.cybersecurity.aims;

import hust.soict.cybersecurity.aims.cart.Cart;
import hust.soict.cybersecurity.aims.exception.PlayerException;
import hust.soict.cybersecurity.aims.media.DigitalVideoDisc;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Aims {

    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King", "Animation", "Roger Aller", -87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addMedia(dvd3);
        try {
            dvd1.play();
        } catch (PlayerException e) {
            e.printStackTrace();
            String message = "Error: Media length is non-negative";
            JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        anOrder.print();
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalcost());

    }
}
