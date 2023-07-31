public class Demo6_task_c {
    public static void main(String[] args) {
        int popLA = 3966936;
        int popNY = 8336817;

        final String white = "\033[30;0m"; 
        final String whiteBold = "\033[37;1m"; 
        final String borderColor = "\033[33;5m"; 
        final String purple = "\033[35;5m"; 
        final String green = "\033[32;5m"; 

        System.out.printf("%s+-------------+------------+------------+%s\n",borderColor, white);
        System.out.printf("%1$s|%2$s CITY        %1$s|%2$s STATE      %1$s|%2$s POPULATION %1$s|%3$s\n", borderColor, whiteBold,white);
        System.out.printf("%s+-------------+------------+------------+%s\n",borderColor, white);
        System.out.printf("%1$s|%2$s Los Angeles %1$s|%2$s California %1$s|%3$s%4$, 12d%1$s|\n", borderColor, white,purple ,popLA);
        System.out.printf("%1$s|%5$s New %2$sYork    %1$s|%5$s New %2$sYork   %1$s|%3$s%4$, 12d%1$s|\n", borderColor, white,purple ,popNY,green);
        System.out.printf("%s+-------------+------------+------------+%s\n",borderColor, white);
    }
}
