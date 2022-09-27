public class breakContinue {
    public static void main(String[] args) {
        System.out.println("This chapter is based on break Continue in Java");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            System.out.println("----------------");
            if (i == 6) {
                System.out.println("bye");
                break;
            }
        }

        for (int a = 1; a <= 5; a++) {
            if (a == 3) {
                System.out.println("Yea");
                continue;
            }
            System.out.println(a);
            System.out.println("Continued");
        }

        float h = 1.0f;
        do {
            h++;
            if(h==7.5){
                System.out.println("I am 7.5");
                continue;
            }
            System.out.println(h*2.5f);
            System.out.println("I am a float");
        } while (h < 10);
    }
}
