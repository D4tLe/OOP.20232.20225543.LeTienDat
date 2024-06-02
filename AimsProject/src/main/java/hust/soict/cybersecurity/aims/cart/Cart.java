package hust.soict.cybersecurity.aims.cart;

import hust.soict.cybersecurity.aims.media.DigitalVideoDisc;
import hust.soict.cybersecurity.aims.media.Media;
import hust.soict.cybersecurity.aims.media.Book;
import hust.soict.cybersecurity.aims.media.CompactDisc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    private ObservableList<Media> itemsFiltered = FXCollections.observableArrayList();
    
    public static int getMaxNumbersOrdered() {
        return MAX_NUMBERS_ORDERED;
    }

    public ObservableList<Media> getItemsOrdered() {
        return this.itemsOrdered;
    }
    
    public ObservableList<Media> getItemsFiltered() {
        return this.itemsFiltered;
    }


    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            if (itemsOrdered.contains(media)) {
                System.out.println("The media " + media.getTitle() + " is already in cart");
            } else {
                media.setId(itemsOrdered.size() + 1);
                itemsOrdered.add(media);
                System.out.println("Successfully added " + media.getTitle() + " to cart");
            }
        } else {
            System.out.println("Cart is already full");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            for (int i = itemsOrdered.indexOf(media) + 1; i < itemsOrdered.size(); i++) {
                itemsOrdered.get(i).setId(i);
            }
            itemsOrdered.remove(media);
            System.out.println("Successfully removed " + media.getTitle() + " from cart");
        } else {
            System.out.println("The media " + media.getTitle() + " is not in cart");
        }
    }

    public float totalcost() {
        float cost = 0;
        for (Media element : itemsOrdered) {
            cost += element.getCost();
        }
        return cost;
    }

    public void searchId(int id) {
        itemsFiltered.clear();
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                if (media instanceof DigitalVideoDisc) {
                    DigitalVideoDisc dvd = (DigitalVideoDisc) media;
                    itemsFiltered.add(media);
                    return;
                } else if (media instanceof CompactDisc) {
                    CompactDisc cd = (CompactDisc) media;
                    itemsFiltered.add(media);
                    return;
                } else if (media instanceof Book) {
                    Book b = (Book) media;
                    itemsFiltered.add(media);
                    return;
                }
            }
        }
        System.out.println("No match is found");
    }

    public void searchTitle(String title) {
        itemsFiltered.clear();
        for (Media media : itemsOrdered) {
            if (media.getTitle().contains(title)) {
                if (media instanceof DigitalVideoDisc) {
                    DigitalVideoDisc dvd = (DigitalVideoDisc) media;
                    itemsFiltered.add(media);
                } else if (media instanceof CompactDisc) {
                    CompactDisc cd = (CompactDisc) media;
                    itemsFiltered.add(media);
                } else if (media instanceof Book) {
                    Book b = (Book) media;
                    itemsFiltered.add(media);
                }
            }
        }
        System.out.println("No match is found");
    }

    public void print() {
        System.out.println("*************CART*************");
        System.out.println("Ordered Items:");
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
        System.out.println("Total cost: " + this.totalcost());
        System.out.println("******************************");
    }

}
