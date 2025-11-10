package equalsMethod;

import java.util.Objects;

public class Movie {
	
	String title;
	String director;
	int year;
	
	Movie(String title, String director, int year) {
		
		this.title = title;
		this.director = director;
		this.year = year;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(!(obj instanceof Movie)) return false;
		
		Movie m = (Movie) obj;
		
		return year == m.year && title.equals(m.title) && director.equals(m.director);
	}
	
	public int hashCode() {
		
		return Objects.hash(title, year, director);
	}

	public static void main(String[] args) {

		Movie m1 = new Movie("Inception", "Nolan", 2010);
		Movie m2 = new Movie("Inception", "Nolan", 2010);
		
		System.out.println(m1.equals(m2));
	}

}
