import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicStore {
	   public static void main(String[] args) {
		   
		   Scanner scanner = new Scanner(System.in);

		   Album album1 = null;
		   List<Song> taylorSongs = new ArrayList<>();
		   taylorSongs.add(new Song("Shake It Off", "Taylor Swift", album1, 3.39));
		   taylorSongs.add(new Song("Blank Space", "Taylor Swift", album1, 3.51));
		   taylorSongs.add(new Song("Bad Blood", "Taylor Swift", album1, 3.31));
		   taylorSongs.add(new Song("Wildest Dreams", "Taylor Swift", album1, 3.40));
		   album1 = new Album("1989", "Taylor Swift", "2014", taylorSongs,48);
		   
		    Album album2 = null;
		    List<Song> adeleSongs = new ArrayList<>();
		    adeleSongs.add(new Song("Rolling in the Deep", "Adele", album2, 3.48));
		    adeleSongs.add(new Song("Rumour Has It", "Adele", album2, 3.43));
		    adeleSongs.add(new Song("Turning Tables", "Adele", album2, 4.10));
		    adeleSongs.add(new Song("Don't You Remember", "Adele", album2, 4.03));
		    adeleSongs.add(new Song("Set Fire to the Rain", "Adele", album2, 4.01));
		    adeleSongs.add(new Song("He Won't Go", "Adele", album2, 4.38));
		    adeleSongs.add(new Song("Take It All", "Adele", album2, 3.48));
		    adeleSongs.add(new Song("I'll Be Waiting", "Adele", album2, 4.01));
		    adeleSongs.add(new Song("One and Only", "Adele", album2, 5.48));
		    adeleSongs.add(new Song("Lovesong", "Adele", album2, 5.16));
		    adeleSongs.add(new Song("Someone Like You", "Adele", album2, 4.45));
		    album2 = new Album("21", "Adele", "2011", adeleSongs,12);

		    Album album3 = null;
		    List<Song> coldplaySongs = new ArrayList<>();
		    coldplaySongs.add(new Song("Yellow", "Coldplay", album3, 4.29));
		    coldplaySongs.add(new Song("Clocks", "Coldplay", album3, 5.07));
		    coldplaySongs.add(new Song("Viva la Vida", "Coldplay", album3, 4.01));
		    coldplaySongs.add(new Song("Paradise", "Coldplay", album3, 4.37));
		    album3 = new Album("Viva la Vida or Death and All His Friends", "Coldplay", "2008", coldplaySongs,25);
		    

		    Cart cart = new Cart();
		    AlbumCollection albumCollection = new AlbumCollection();
		    while (true) {
		        System.out.println("1. Create Account");
		        System.out.println("2. Search for Album");
		        System.out.println("3. Add Item to Cart");
		        System.out.println("4. Purchase Items");
		        System.out.println("5. Exit");

		        int choice = scanner.nextInt();
		        scanner.nextLine();

		        switch (choice) {
		            case 1:
		                System.out.println("Enter First Name:");
		                String firstName = scanner.nextLine();

		                System.out.println("Enter Last Name:");
		                String lastName = scanner.nextLine();

		                System.out.println("Enter Username:");
		                String username = scanner.nextLine();

		                System.out.println("Enter Password:");
		                String password = scanner.nextLine();

		                user = new User(firstName, lastName, username, password);
		                System.out.println("Account created successfully!");
		                break;

		            case 2:
		                System.out.println("Enter album name:");
		                String albumName = scanner.nextLine();
		                Album album = albumCollection.searchAlbum(albumName);
		                if (album != null) {
		                    System.out.println(album);
		                } else {
		                    System.out.println("Album not found.");
		                }
		                break;

		            case 3:
		                if (user == null) {
		                    System.out.println("Please create an account first.");
		                    break;
		                }
		                System.out.println("Enter album name:");
		                albumName = scanner.nextLine();
		                album = albumCollection.searchAlbum(albumName);
		                if (album != null) {
		                    System.out.println("Enter quantity:");
		                    int quantity = scanner.nextInt();
		                    scanner.nextLine();

		                    CartItem cartItem = new CartItem(albumName, album.getPrice(), quantity);
		                    cart.addItem(cartItem);
		                    System.out.println("Item added to cart successfully!");
		                } else {
		                    System.out.println("Album not found.");
		                }
		                break;

		            case 4:
		                if (user == null) {
		                    System.out.println("Please create an account first.");
		                    break;
		                }
		                System.out.println("Purchase Items:");
		                cart.printCart();
		                System.out.println("Confirm Purchase? Y/N");
		                String confirm = scanner.nextLine();
		                if (confirm.equals("Y")) {
		                    System.out.println("Purchase successful!");
		                    cart = new Cart();
		                } else {
		                    System.out.println("Purchase cancel.");
		                }
		                break;

		            case 5:
		                System.out.println("Exit");
		                return;

		        }
		    }
		    
		    
		}

	   
	   
	   }

