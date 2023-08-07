package HomeWork2;

import java.util.Scanner;

public class Task4 {
     public static void main(String[] args) {
        input();
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку:");
        String numberIn = sc.nextLine();
        sc.close();
        try{
            if (numberIn.equals("")){ 
            throw new RuntimeException();
        }
        }
        catch(Exception e){
            System.out.println("Введена пустая строка");
        }
    
    }
}
