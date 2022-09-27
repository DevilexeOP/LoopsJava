import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This chapter is based on While Loops in Java");

        Scanner sc = new Scanner(System.in);
        try {

            int a = sc.nextInt();
            while (a <= 3) {
                System.out.println(a);
                a++;
            }

            // Quick Quiz => Write a program to print natural numbers from 100 to 200
            int b = 100;
            while (b <= 200) {
                System.out.println(b);
                b++;
            }

        } finally {
            sc.close();
        }
    }
}
