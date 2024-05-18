package hust.soict.dsai.aims.media;

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
    public void play() {
        if (length > 0) {
            System.out.println("Playing track: " + title);
            System.out.println("Track length: " + length);
            return;
        }
        System.out.println("The track " + title + " cannot be played");
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
