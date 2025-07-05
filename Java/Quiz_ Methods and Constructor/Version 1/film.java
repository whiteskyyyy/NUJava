
public class film {
	
	//attributes
	String Title, Title1, Title2;
	String Director, Director1, Director2;
	String Genre, Genre1, Genre2;

	public film(){
		Title = "Her (2013)";
		Director = "Spike Jonze";
		Genre = "Romance";

		Title1 = "500 Days of Summer (2009)";
		Director1 = "Marc Webb";
		Genre1 = "Indie Film";

		Title2 = "The Perks of Being a Wallflower (2012)";
		Director2 = "Stephen Chbosky";
		Genre2 = "Coming-of-age story";
	}


}
class brtooo{
	public static void main(String[] args) {

		clearScreen();

		film f1 = new film ();
		film f2 = new film ();
		film f3 = new film ();

		System.out.print("\n=======================\n");
		System.out.print("First Film");
		System.out.print("\n-----------------------");
		System.out.println("\nTitle: " + f1.Title);
		System.out.println("Director: " + f1.Director);
		System.out.println("Genre: " + f1.Genre);

		System.out.print("\nSecond Film");
		System.out.print("\n-----------------------");
		System.out.println("\nTitle: " + f2.Title1);
		System.out.println("Director: " + f2.Director1);
		System.out.println("Genre: " + f2.Genre1);

		
		System.out.print("\nThird Film");
		System.out.print("\n-----------------------");
		System.out.println("\nTitle: " + f3.Title2);
		System.out.println("Director: " + f3.Director2);
		System.out.println("Genre: " + f3.Genre2);
		System.out.print("=======================\n");
		System.out.println();
	}
    //code for clearscreen//
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}

