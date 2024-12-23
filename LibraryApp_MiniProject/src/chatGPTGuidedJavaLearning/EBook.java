package chatGPTGuidedJavaLearning;

public class EBook extends Book {
    private int numberOfPages;

    public EBook(int id, String title, String author, int numberOfPages) {
        super(id, title, author);
        this.numberOfPages = numberOfPages;
    }

    public void download() {
        System.out.println("Downloading EBook: " + getTitle());
    }

    @Override
    public String toString() {
        return super.toString() + " (EBook, Pages: " + numberOfPages + ")";
    }
}
