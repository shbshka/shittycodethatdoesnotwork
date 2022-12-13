public class ElevatorAlligator {
    private int currentFloor = 1;
    private final int maxFloor;
    private final int minFloor;

    public ElevatorAlligator(int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
            currentFloor -= 1;
    }

    public void moveUp() {
        currentFloor += 1;
    }

    public void move (int floor) {
        if (currentFloor == floor) {
            System.out.println();
        } else if (currentFloor > floor && currentFloor + (floor - currentFloor) > maxFloor) {
            System.out.println("Cannot move up");
        } else if (currentFloor < floor && currentFloor - (currentFloor - floor) < minFloor) {
            System.out.println("Cannot move down");
        } else if (currentFloor < floor) { //подъем на этаж, если он выше
            while (currentFloor < floor) { //не работает с числами от 10 и выше и с отрицательными - почему?
                moveUp();
                System.out.println(currentFloor);
                }
            } else {
            while (currentFloor > floor) {
                moveDown();
                System.out.println(currentFloor);
            }
        }
    }
}