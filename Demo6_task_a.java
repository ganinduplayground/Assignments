public class Demo6_task_a {
    public static void main(String[] args) {
        String pMark = "%";
        System.out.printf("%s[   5%s%s0%s  ]%s\n", "\033[41;5m","\033[30;0m","\033[42;5m",pMark,"\033[30;0m"  );
    }
}
