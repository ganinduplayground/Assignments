public class Demo6_task_d {
    public static void main(String[] args) {
        double priceApp = 0.99;
        double priceOra = 1.49;

        final String white = "\033[30;0m"; 
        final String whiteBold = "\033[37;1m"; 
        final String borderColor = "\033[33;5m"; 
        final String purple = "\033[35;5m"; 
        final String green = "\033[32;5m";
        final String blue =  "\033[36;5m";

        System.out.printf("%s+-------------+------------+------------+%s\n",borderColor, white);
        System.out.printf("%1$s|%2$s ITEM        %1$s|%2$s QUANTITY   %1$s|%2$s PRICE      %1$s|%3$s\n", borderColor, whiteBold,white);
        System.out.printf("%s+-------------+------------+------------+%s\n",borderColor, white);
        System.out.printf("%1$s|%2$s Apples      %1$s|%5$s          5 %1$s|%3$s    $%6$s%4$.2f%1$s   |\n", borderColor, white,green ,priceApp,blue,purple);
        System.out.printf("%1$s|%2$s Oranges     %1$s|%5$s         10 %1$s|%3$s    $%6$s%4$.2f%1$s   |\n", borderColor, white,green ,priceOra,blue,purple);
        System.out.printf("%s+-------------+------------+------------+%s\n",borderColor, white);
    }
}
