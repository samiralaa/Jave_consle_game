class Book {
    private String title;
    private String books[];
    private int id;
    private boolean isAvailable = true;

    public Book(String title, int id, boolean isAvailable, String books) {

        this.title = title;
        this.id = id;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have borrowed the book: " + title);
            isAvailable = false;
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void saveBooks(String[] books) {
        this.books = books;
        for (String book : books) {
            System.out.println(book);
        }

    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void returnBook() {
        if (!isAvailable) {
            System.out.println("You have returned the book: " + title);
            isAvailable = true;
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    public static void main(String[] args) {
        String[] library = { "Java", "Python", "C++", "JavaScript", "Ruby" };
        Book p = new Book("Backend basic", 1, true, "Java");
        p.saveBooks(new String[] { "Java", "Python", "C++" });
        p.borrowBook();
        p.returnBook();
        p.saveBooks(library);

    }
}
