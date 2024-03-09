import java.util.Scanner;

class Program{
    public static void main (String args[]){
        testCargo(1,5,3, 10, "", true, "", true);

    }
    public static void testElevator ( int minFloor, int maxFloor) {
        Elevator elevator = new Elevator(minFloor, maxFloor);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
    }
    }
    public static void testCargo ( int W, int H, int L, int M, String dA, boolean cT, String rN, boolean iFr ) {
        infoCargo Cargo = new infoCargo(  W,  H,  L,  M,  dA, cT, rN, iFr );
        infoCargo newMass = Cargo.changeMass(  M+10);
        System.out.println( Cargo == newMass);
    }

}
class Elevator {
    int currentFloor;
    int minFloor;
    int maxFloor;

    public Elevator(int minF, int maxF) {
        minFloor = minF;
        maxFloor = maxF;
        currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    private void moveDown() {
        currentFloor = currentFloor - 1;
    }

     private void moveUp() {
        currentFloor = currentFloor + 1;

    }

    private boolean testRealFloor(int floor) {
        if (floor < minFloor || floor > maxFloor)
            return false;
        else return true;
    }

    public void move(int floor) {
        if (testRealFloor(floor)) {
            if (getCurrentFloor() < floor) {
                while (getCurrentFloor() < floor) {
                    moveUp();
                    System.out.println(getCurrentFloor());
                }

            } else {
                while (getCurrentFloor() > floor) {
                    moveDown();
                    System.out.println(getCurrentFloor());
                }
            }


        }
        else System.out.println(" Информация об ошибке");

    }
}



