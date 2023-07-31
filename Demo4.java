public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int min = 59;
        int sec = 59;
        final String resetColor = "\033[30;0m"; 
        String col1 = "\033[31;5m"; 
        String col2 = "\033[32;5m"; 
        String col3 = "\033[33;5m"; 
        String col4 = "\033[34;5m"; 
        String col5 = "\033[35;5m"; 
        String col6 = "\033[36;5m"; 

        System.out.printf("%s12%s/%s28%2$s/%s2023%2$s %s23%2$s:%s59%2$s:%s59%2$s\n", col1,resetColor,col2,col3,col4,col5,col6 );
    }
}
