
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Add some books at start
        books.add(new Book(1, "Java Programming", "James Gosling"));
        books.add(new Book(2, "Data Structures", "Lafore"));
        books.add(new Book(3, "Clean Code", "Robert Martin"));

        int choice;
        do {
            System.out.println("\n====== LIBRARY MANAGEMENT SYSTEM ======");
            System.out.println("1. Show All Books");
            System.out.println("2. Add New Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear

            if (choice == 1) {
                System.out.println("\n--- Book List ---");
                for (Book b : books) {
                    String status = b.isBorrowed ? "Borrowed" : "Available";
                    System.out.println(b.id + " | " + b.title + " by " + b.author + " - " + status);
                }
            } 
            else if (choice == 2) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt(); sc.nextLine();
                System.out.print("Enter Title: ");
                String title = sc.nextLine();
                System.out.print("Enter Author: ");
                String author = sc.nextLine();
                books.add(new Book(id, title, author));
                System.out.println("Book Added!");
            } 
            else if (choice == 3) {
                System.out.print("Enter Book ID to borrow: ");
                int id = sc.nextInt();
                for (Book b : books) {
                    if (b.id == id && !b.isBorrowed) {
                        b.isBorrowed = true;
                        System.out.println("You borrowed: " + b.title);
                    }
                }
            } 
            else if (choice == 4) {
                System.out.print("Enter Book ID to return: ");
                int id = sc.nextInt();
                for (Book b : books) {
                    if (b.id == id && b.isBorrowed) {
                        b.isBorrowed = false;
                        System.out.println("You returned: " + b.title);
                    }
                }
            }

        } while (choice != 0);

        System.out.println("Goodbye!");
        sc.close();
    }
}
	}

}
