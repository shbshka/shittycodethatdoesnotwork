import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ElevatorAlligator elevator = new ElevatorAlligator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}