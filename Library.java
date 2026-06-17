package vu.courseworkone;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public Book searchBookByTitle(String title) {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public boolean lendBook(String isbn,
                            String memberId) {

        Book book = null;
        Member member = null;

        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                book = b;
            }
        }

        for (Member m : members) {
            if (m.getMemberId().equals(memberId)) {
                member = m;
            }
        }

        if (book == null || member == null) {
            return false;
        }

        if (!book.isAvailable()) {
            System.out.println(
                    "Rejected: Book already on loan.");
            return false;
        }

        Loan loan = new Loan(
                book,
                member,
                "17/06/2026",
                "01/07/2026");

        member.addLoan(loan);
        book.setAvailable(false);

        return true;
    }

    public boolean returnBook(String isbn) {

        for (Member member : members) {

            ArrayList<Loan> copy =
                    new ArrayList<>(member.getLoans());

            for (Loan loan : copy) {

                if (loan.getBook()
                        .getIsbn()
                        .equals(isbn)) {

                    loan.getBook()
                            .setAvailable(true);

                    member.removeLoan(loan);

                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {

        String result = "\nBOOKS\n";

        for (Book b : books) {
            result += b + "\n";
        }

        result += "\nMEMBERS\n";

        for (Member m : members) {
            result += m + "\n";
        }

        return result;
    }
}