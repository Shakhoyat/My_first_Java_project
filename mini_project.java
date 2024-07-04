
//Game about guessing the random number and trying to guess it in n turns
import java.util.Scanner;

public class mini_project {
    public static void main(String[] args) {
        int my_num = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int user_num = 0;
        do {
            System.out.println("Guess my number");
            user_num = sc.nextInt();

            if (user_num == my_num) {
                System.out.println("OH MY GOSH .....CORRECT GUESS");
                break;
            } else if (user_num > my_num) {
                System.out.println("Your Number is too  bigger");
            } else {
                System.out.println("Your Number is too small");
            }
        } while (user_num >= 0);

        System.out.print("My Number was = ");
        System.out.println(my_num);

    }

}
