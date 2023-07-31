public class Demo5 {
    public static void main(String[] args) {
        String col1 = "\033[36;5m"; 
        String col2 = "\033[32;5m"; 
        String col3 = "\033[33;5m"; 
        String col4 = "\033[34;5m"; 
        final String resetColor = "\033[30;0m"; 
        
        System.out.printf("%s978%2$s-%s3%2$s-%s16%2$s-%s1484100%2$s\n",col1,resetColor,col2,col3,col4);
    }
}
