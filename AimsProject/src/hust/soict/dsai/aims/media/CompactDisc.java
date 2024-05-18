package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc() {}

    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, float cost) {
        super(title, cost);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }

    public CompactDisc(String title, String category, String director, float cost, int length) {
        super(title, category, director, length, cost);
    }

    public CompactDisc(String title, String category, String director, String artist, int length, float cost) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }
    
    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists");
            return;
        }
        tracks.add(track);
        System.out.println("Track has been added");
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track has been removed");
            return;
        }
        System.out.println("Track not found");
    }

    @Override
    public int getLength() {
        int len = 0;
        for (Track track : tracks) {
            len += track.getLength();
        }
        return len;
    }

    @Override
    public void play() {
        System.out.println("CD artist: " + this.artist);
        System.out.println("Total length: " + this.getLength());
        for (Track element : tracks) {
            System.out.println("Playing track: " + element.getTitle());
            System.out.println("Track length: " + element.getLength());
        }
    }
    
    @Override
    public String toString() {
        return "Title: " + this.getTitle() + " - " + "Category: " + this.getCategory()
                + " - " + "Director: " + this.getDirector() + " - " + "Artist: " + this.getArtist() 
                + " - " + "Length: " + this.getLength() + " - " + "Cost:" + this.getCost();
    }
}
