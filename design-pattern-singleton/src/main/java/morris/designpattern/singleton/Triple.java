package morris.designpattern.singleton;

public class Triple {

    private int id;

    private Triple(int id) {
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }

    private static Triple[] triples = new Triple[] {
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };

    public static Triple getInstance(int id) {
        return triples[id];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 9; ++i) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
    }

}
