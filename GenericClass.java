public class GenericClass {
    public static void main(String[] args) {
        System.out.println(getGenericClass(3));
    }

    //only support reflection from inherit hierarchy, not support generic parameter or return 
    private static <T> String getGenericClass(T t) {
        return String.class.toString();
    }
}
