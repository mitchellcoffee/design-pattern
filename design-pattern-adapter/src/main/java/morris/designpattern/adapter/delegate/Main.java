package morris.designpattern.adapter.delegate;

import morris.designpattern.adapter.Banner;

public class Main {

    public static final void main(String[] args) {

        Banner banner = new Banner("abc");

        Print p = new PrintBanner(banner);
        p.printWeak();
        p.printStrong();

    }

}
