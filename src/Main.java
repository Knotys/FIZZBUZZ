public class Main {

    public static void main(String[] args) {

        int num = 100;
        System.out.println("Čísla od 1 do "+num);
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}