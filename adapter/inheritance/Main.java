package adapter.inheritance;
import adapter.inheritance.Banner;
import adapter.inheritance.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello world");
        p.printWeak();
        p.printStrong();
    }
}