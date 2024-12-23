package chatGPTGuidedJavaLearning;

public class PrintedBook extends Book {
    private int numberOfPages;
    private int stock;

    public PrintedBook(int id, String title, String author, int numberOfPages, int stock) {
        super(id, title, author);
        this.numberOfPages = numberOfPages;
        this.stock = stock;
    }

    public void checkStock() {
        System.out.println("Stock for \"" + getTitle() + "\": " + stock);
    }

    public void updateStock(int change) {
        stock += change;
        System.out.println("Stock updated. Current stock: " + stock);
    }

    @Override
    public String toString() {
        return super.toString() + " (PrintedBook, Pages: " + numberOfPages + ", Stock: " + stock + ")";
    }
}
