package morris.designpattern.builder;

public class TextBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    public void makeTitle(String title) {
        buffer.append("=========================\n");
        buffer.append("[" + title + "]\n");
    }

    public void makeString(String str) {
        buffer.append("* " + str + "\n");
    }

    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; ++i) {
            buffer.append(("  ·" + items[i] + "\n"));
        }
    }

    public void close() {
        buffer.append("=========================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
