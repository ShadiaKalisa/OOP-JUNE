package vu.courseworkone;

public class CourseWorkOne {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(
                "101",
                "Java Programming",
                "James Gosling");

        Book b2 = new Book(
                "102",
                "Database Systems",
                "Elmasri");

        Book b3 = new Book(
                "103",
                "Computer Networks");

        Member m1 = new Member(
                "M001",
                "Mark");

        Member m2 = new Member(
                "M002",
                "Mellisa");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.registerMember(m1);
        library.registerMember(m2);

        System.out.println("BEFORE");
        System.out.println(library);

        library.lendBook("101", "M001");

        // Rejected loan
        library.lendBook("101", "M002");

        library.lendBook("102", "M002");

        library.returnBook("101");

        System.out.println("\nAFTER");
        System.out.println(library);
    }
}
