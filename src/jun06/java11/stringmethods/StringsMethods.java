package jun06.java11.stringmethods;

public class StringsMethods {
    public static void main(String[] args) {

        System.out.println("Hello World");

        String test01 = " Oi ".repeat(2);
        System.out.println(test01);

        System.out.println(test01.isBlank());

        test01 = test01.strip();
        System.out.println(test01);

        test01 = "   ";
        System.out.println(test01.isBlank());
    }
}

