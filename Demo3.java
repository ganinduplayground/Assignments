public class Demo3 {
    public static void main(String[] args) {
        int tNumber1 = 123;
        int tNumber2 = 456;
        int tNumber3 = 7890;
        final String bold = "\033[33;7m";
        final String reset = "\033[30;0m";  

        System.out.printf("%s(%s)%s %s-%s\n", bold,tNumber1,reset,tNumber2,tNumber3);

    }
}
