package morris.designpattern.factory.b.factory;

public class GenericShapeFactory {

    public <T> T getClass(Class<? extends T> clazz) {
        T obj = null;

        try {
            obj = (T)Class.forName(clazz.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
