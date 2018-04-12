package morris.designpattern.abstractfactory;

import morris.designpattern.abstractfactory.factory.Factory;
import morris.designpattern.abstractfactory.factory.Link;
import morris.designpattern.abstractfactory.factory.Page;
import morris.designpattern.abstractfactory.factory.Tray;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example: java Main listfactory.ListFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");
        Link yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jpYahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link google = factory.createLink("Google", "http://www.google.com/");
        Link baidu = factory.createLink("Baidu", "http://www.baidu.com/");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);
        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(yahoo);
        trayYahoo.add(jpYahoo);
        Tray traySearch = factory.createTray("搜索");
        traySearch.add(trayYahoo);
        traySearch.add(google);
        traySearch.add(baidu);

        Page page = factory.createPage("LinkPage", "作者");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
