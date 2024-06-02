package hust.soict.cybersecurity.aims.media;

import hust.soict.cybersecurity.aims.exception.PlayerException;

public class Track implements Playable {

    private String title;
    private int length;

    public Track() {
    }

    public Track(String title) {
        this.title = title;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() throws PlayerException {
        if (length > 0) {
            System.out.println("Playing track: " + title);
            System.out.println("Track length: " + length);
        } else {
            throw new PlayerException("ERROR: Track length is non-positive!");

        }

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Track) {
            Track track = (Track) obj;
            return (title.equals(track.getTitle()) && length == track.getLength());
        }
        return false;
    }
}
