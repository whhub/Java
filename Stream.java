import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Stream {
    public static void main(String[] args) {
        ArrayList<String> strings = null;
        System.out.println(strings.stream().collect(Collectors.toList()));
    }
}