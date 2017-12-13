import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");
        String n = scanner.nextLine();
        char a = n.charAt(0);
        char b = n.charAt(1);
        char c = n.charAt(2);
        int first = Character.getNumericValue(a);
        int second = Character.getNumericValue(b);
        int last = Character.getNumericValue(c);
        int result = first + second + last;
        System.out.println("Сумма трех чисел равна = " + result);

    }
}
