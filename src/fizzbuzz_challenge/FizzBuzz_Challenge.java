package fizzbuzz_challenge;

public class FizzBuzz_Challenge {

    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i < 101; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("FizzBuzz, ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
