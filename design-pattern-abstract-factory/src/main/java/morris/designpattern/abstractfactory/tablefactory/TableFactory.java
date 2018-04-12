package morris.designpattern.abstractfactory.tablefactory;

import morris.designpattern.abstractfactory.factory.Factory;
import morris.designpattern.abstractfactory.factory.Link;
import morris.designpattern.abstractfactory.factory.Page;
import morris.designpattern.abstractfactory.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
