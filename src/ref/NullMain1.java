package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data); // null
        data = new Data();
        System.out.println("2. data = " + data); // ref.Data@7291c168f
        data = null;
        System.out.println("3. data = " + data); // null
    }
}
