import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class InputManager {

    private static Scanner scanner = new Scanner(System.in); // static bo metoda poniżej statyczna

    public static String getOperation() {
        System.out.println("Podaj znak operacji matematycznej, którą chcesz wykonać");
        return scanner.next();

       // JOptionPane.showInputDialog("Podaj znak operacji matematycznej, którą chcesz wykonać");
    }

    public static String getNumber() {
        System.out.println("Podaj liczbę dla której chcesz wykonac działanie");

        return scanner.next();

    }
}
