import java.util.Scanner;
import java.util.Random;

public class Man {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random rand = new Random();
                int x = rand.nextInt(10);
                System.out.println(x);
                System.out.println("Вам понравилось это число?");

                String a = scanner.nextLine();
                if (a == "yes")
                        System.out.println("отлично");
                else if (a == "нет")
                        System.out.println("печально");
                else
                        System.out.println("Вы ввели: " + a);
                System.out.println("разговаривать научись мудень");
        }
}