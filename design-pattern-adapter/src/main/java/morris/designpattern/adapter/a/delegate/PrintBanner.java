package morris.designpattern.adapter.a.delegate;

import morris.designpattern.adapter.a.Banner;

public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
