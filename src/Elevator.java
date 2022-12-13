import java.lang.Math;

public class Elevator {
    private int currentFloor = 1;
    private final int maxFloor;
    private final int minFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public boolean moveDown() {
        if (currentFloor - 1 >= minFloor) {
            currentFloor -= 1;
            System.out.println("Current floor - " + currentFloor);
            return true;
        } else {
            System.out.println("Error: cannot move down"); //вывод ошибки в консоль
            return false;
        }
    }

    public boolean moveUp() {
        if (currentFloor + 1 <= maxFloor) {
            currentFloor += 1;
            System.out.println("Current floor - " + currentFloor);
            return true;
        } else {
            System.out.println("Error: cannot move up");
            return false;
        }
    }

    public void move(int floor) {
        if (currentFloor == floor) {
            System.out.println();
        } else if (currentFloor > floor && currentFloor + (floor - currentFloor) > maxFloor) {
            System.out.println("Cannot move up");
        } else if (currentFloor < floor && currentFloor - (currentFloor - floor) < minFloor) {
            System.out.println("Cannot move down");
        } else if (currentFloor < floor) {
            while (currentFloor < floor) { //не работает с числами от 10 и выше и с отрицательными - почему?
                moveUp();
                if (!moveUp()) {
                    break;
                }
            }
        } else {
            while (currentFloor > floor) {
                moveDown();
                if (!moveDown()) {
                    break;
                }
            }
        }
    }
}
