package examples.interfaceStaticMethod;


public class MyDataImpl implements MyData {

    public static void main(String args[]) {
        MyDataImpl obj = new MyDataImpl();
        obj.print("");
        obj.isNull("abc");
        // 1. What will print ?
        // 2. What will print if you overwrite print in this class
        // 3. What will print if isNull is removed from MyData interface ?
        // 4. What will print if isNull is removed from MyDataImp class ?
        // 5. What if we add @Override annotation to the isNull() method ?
    }

    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }
}