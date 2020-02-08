package adapter.transfer;
import adapter.transfer.Banner;
import adapter.transfer.Print;

public class PrintBanner extends Print {
    private Banner banner;
    
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    
    public void printWeak() {
        banner.showWithParen();
    }
    
    public void printStrong() {
        banner.showWithAster();
    }
}