package hust.soict.cybersecurity.aims.media;

import java.util.ArrayList;

public class PolymorphismTest {

    public static void main(String[] args) {
        ArrayList<Media> mediae = new ArrayList<>();

        Book book = new Book("Algebra");
        CompactDisc cd = new CompactDisc("Calculus");
        DigitalVideoDisc dvd = new DigitalVideoDisc("Doraemon");

        mediae.add(book);
        mediae.add(cd);
        mediae.add(dvd);

        for (Media element : mediae) {
            System.out.println(element.toString());
        }

    }
}
