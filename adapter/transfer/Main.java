package adapter.transfer;
import adapter.transfer.Banner;
import adapter.transfer.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello world");
        p.printWeak();
        p.printStrong();
    }
}