class StringParser {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = Integer.parseInt("non-int");
        } catch (Exception e) {
        }
        System.out.println("number is " + number);
    }
}