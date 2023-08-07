package HomeWork2;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        inputFlout();
    }

    private static void inputFlout() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число с запятой");
        String numberIn = sc.nextLine();
        try {
            float number = Float.parseFloat(numberIn);
            System.out.println(number);
        }
        catch (NumberFormatException e) {
            System.out.println("Не правильный ввод");
        }
        sc.close();
    }
}
