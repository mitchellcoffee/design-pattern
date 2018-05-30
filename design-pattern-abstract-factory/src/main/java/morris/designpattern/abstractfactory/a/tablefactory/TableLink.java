package morris.designpattern.abstractfactory.a.tablefactory;

import morris.designpattern.abstractfactory.a.factory.Link;

public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
