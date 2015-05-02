package examples.interfaceStaticMethod;
 
public interface MyData {
 
    default void print(String str) {
    	// isNull from the interface will be called and not of subclass
        if (!isNull(str))
            System.out.println("MyData Print::" + str);
    }
 
    static boolean isNull(String str) {
        System.out.println("Interface Null Check");
 
        return str == null ? true : "".equals(str) ? true : false;
    }
}