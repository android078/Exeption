package HW_2;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Main9 {
    public static void main(String[] args) {
        try{
            emptyStringCheck();
        } catch (IllegalArgumentException e) {
            e.getMessage();

        }
    }

    private static void emptyStringCheck() {
        String string;

        System.out.println("Введите строку");
        try (Scanner scan = new Scanner(System.in)) {
            string = scan.nextLine();
        }
        if(string.isEmpty()){
            //throw new IllegalArgumentException("Пустую строку нельзя вводить");
            System.out.println("Пустую строку нельзя вводить");
            
        } else {
            System.out.println("Все в порядке");
        }

    }
}
