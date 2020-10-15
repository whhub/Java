import java.util.Arrays;
import java.util.List;
class StringList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world");
        String empty=null;
        System.out.println(strings.contains(empty));
    }
}