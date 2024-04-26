public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDisc = 0;
	private int id;
	
	public DigitalVideoDisc(String title) {
		this.title = title;
		nbDigitalVideoDisc += 1;
		id = nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		this(title);
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title, category, cost);
		this.director = director;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this(title, category, director, cost);
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public int getId() {
		return id;
	}

	public boolean isMatch(String title) {
		if (this.title == title) {
			return true;
		}
		return false;
	}

	public boolean isMatch(int id) {
		if (this.id == id) {
			return true;
		}
		return false;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean equals(DigitalVideoDisc disc) {
		if (this.title != null && !this.title.equals(disc.title)) {
			return false;
		}
		
		if (this.category != null && !this.category.equals(disc.category)) {
			return false;
		}

		if (this.director != null && !this.director.equals(disc.director)) {
			return false;
		}
		
		if (this.length != disc.length) {
			return false;
		}
		
		if (this.cost != disc.cost) {
			return false;
		}
		
		return true;
	}

	public String toString() {
		String info = String.format("%d. DVD - %s - %s - %s - %d: %.2f$", id, title, category, director, length, cost);
		return info;
	}
}

