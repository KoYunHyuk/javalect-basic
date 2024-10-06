package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateFieil;

    public void publicMethod(){
        System.out.println("publicMethod 호출" + publicField);
    }
    void defaultMethod(){
        System.out.println("defaultMethod 호출" + defaultField);
    }
    private void privateMethod(){
        System.out.println("privateMethod 호출" + privateFieil);
    }
    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateFieil = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
