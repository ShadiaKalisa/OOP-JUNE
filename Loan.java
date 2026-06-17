package vu.courseworkone;

public class Loan {

    private Book book;
    private Member member;
    private String borrowDate;
    private String dueDate;

    public Loan(Book book, Member member,
                String borrowDate, String dueDate) {

        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    @Override
    public String toString() {
        return book.getTitle() +
               " borrowed by " +
               member.getName();
    }
}
