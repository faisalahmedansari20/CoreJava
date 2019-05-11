import java.util.HashMap;

class Movies {
	private String name, actor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getReleaseYr() {
		return releaseYr;
	}

	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;
	}

	private int releaseYr;
}

public class HashMapDemoJava {

	public static void main(String[] args) {

		Movies m = new Movies();
		m.setActor("Akshay");
		m.setName("Thank You");
		m.setReleaseYr(2011);

		Movies m1 = new Movies();
		m1.setActor("Akshay");
		m1.setName("Khiladi");
		m1.setReleaseYr(1993);

		Movies m2 = new Movies();
		m2.setActor("Akshay");
		m2.setName("Taskvir");
		m2.setReleaseYr(2010);

		Movies m3 = new Movies();
		m3.setActor("Akshay");
		m3.setName("Taskvir");
		m3.setReleaseYr(2010);

		HashMap<Movies, String> map = new HashMap<Movies, String>();
		map.put(m, "ThankYou");
		map.put(m1, "Khiladi");
		map.put(m2, "Tasvir");
		map.put(m3, "Duplicate Tasvir");

		//Iterate over HashMap
		for (Movies mm : map.keySet()) {
			System.out.println(map.get(mm).toString());
		}

		Movies m4 = new Movies();
		m4.setActor("Akshay");
		m4.setName("Taskvir");
		m4.setReleaseYr(2010);

		map.put(m4,"Duplicate Tasvir");

/* We are trying to retrieve m2, by creating object m4 with exact values as of m2, However Hashcode method is not implemented and that why we are not able to get Object m2 */
		if(map.get(m4) == null ){
			System.out.println("----------------");
			System.out.println("Object not found");
			System.out.println("----------------");
		}else{
			System.out.println(map.get(m4).toString());
		}
	}
}
