import java.util.ArrayList;
import java.util.Collections;


public class movies implements Comparable<Movies>{
	String movieName;
	double price;

	public movies(String movieName,double price){
		this.movies=movieName;
		this.price=price;
	}
	@Override
	public String toString(){
		return "movie movieName:"+this.movieName+"Price:"+this.price;

	}
	public static void main(String[] args) {
		ArrayList<Movies>movies=new ArrayList<>();
		movies.add(new Movies("kgf",432.5));
		movies.add(new Movies("saiyara",432.5));
		movies.add(new Movies("coolie",432.5));
		movies.add(new Movies("damm",432.5));

		Collections.sort(movies);
		System.out.println(movies);
	}

	public int compareTo(movies o){
		if(this.price==o.price){
			return 0;

		}
		else if(this.price<o.price){
			return -1;
		}
		else{
			return -1;
		}
	}
}

		
	




