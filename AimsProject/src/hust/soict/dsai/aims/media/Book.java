package hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {

    private List<String> authors = new ArrayList<>();

    public Book() {
    }

    public Book(String title) {
        super(title);
    }

    public Book(String title, float cost) {
        super(title, cost);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Book(String title, int id, String category, float cost, List<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return authors;
    }
    
    public String authorsToString() {
        StringBuilder aus = new StringBuilder("");
        for (String author: getAuthors()) {
            aus.append(author);
        }
        return aus.toString();
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author's name already exists");
            return;
        }
        authors.add(authorName);
        System.out.println("Author's name has been added");
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author's name has been removed");
            return;
        }
        System.out.println("Author's name not found");
    }
    
    @Override
    public String toString() {
        return "Title: " + this.getTitle() + " - " + "Category: " + this.getCategory()
                + "Authors: " + this.authorsToString()
                + " - " + "Cost:" + this.getCost();
    }
}
