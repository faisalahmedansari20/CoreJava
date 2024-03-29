
import java.util.HashMap;

class Movie
	{
	private String name, actor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	public String getActor() {
		return actor;

	public void setActor(String actor) {
		this.actor = actor;

	public int getReleaseYr() {
		return releaseYr;

	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;

	private int releaseYr;
}

public class HashMapDemo

	public static void main(String[] args) {

		Movie m = new Movie();
		m.setActor("Akshay");
		m.setName("Thank You");
		m.setReleaseYr(2011);

		Movie m1 = new Movie();
		m1.setActor("Akshay");
		m1.setName("Khiladi");
		m1.setReleaseYr(1993);

		Movie m2 = new Movie();
		m2.setActor("Akshay");
		m2.setName("Taskvir");
		m2.setReleaseYr(2010);

		Movie m3 = new Movie();
		m3.setActor("Akshay");
		m3.setName("Taskvir");
		m3.setReleaseYr(2010);

		HashMap<Movie, String> map = new HashMap<Movie, String>();
		map.put(m, "ThankYou");
		map.put(m1, "Khiladi");
		map.put(m2, "Tasvir");
		map.put(m3, "Duplicate Tasvir");
			
		//Iterate over HashMap
		for (Movie mm : map.keySet()) {
			System.out.println(map.get(mm).toString());
		}

		Movie m4 = new Movie();
		m4.setActor("Akshay");
		m4.setName("Taskvir");
		m4.setReleaseYr(2010);

/* We are trying to retrieve m2, by creating object m4 with exact values as of m2, However Hashcode method is not implemented and that why we are not able to get Object m2 */
		if(map.get(m4) == null ){
			System.out.println("----------------");
			System.out.println("Object not found");
		}else{
			System.out.println(map.get(m4).toString());
