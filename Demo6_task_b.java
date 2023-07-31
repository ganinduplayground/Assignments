public class Demo6_task_b {
   public static void main(String[] args) {

    final String resetColor = "\033[30;0m"; 
    final String setColor = "\033[35;5m"; 
    final String borderColor = "\033[33;5m"; 
    final String txtColor = "\033[36;5m"; 



     System.out.printf("%s+--------------------+-------+%s\n",borderColor,resetColor);
     System.out.printf("%1$s| %2$sNAME               %1$s|%2$s  AGE  %1$s|\n", borderColor, txtColor);
     System.out.printf("%s+--------------------+-------+%s\n",borderColor,resetColor);
     System.out.printf("%1$s| %2$sALICE              %1$s|%3$s  24   %1$s|\n", borderColor, resetColor, setColor);
     System.out.printf("%1$s| %2$sBOB                %1$s|%3$s  39   %1$s|\n", borderColor, resetColor, setColor);
     System.out.printf("%s+--------------------+-------+%s\n",borderColor,resetColor);
   }
}
