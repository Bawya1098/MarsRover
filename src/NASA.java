import java.util.Scanner;

public class NASA {
    String getCommand() {
        return "LMLMLMLMM";
    }

    public static void main(String[] args) {
        NASA nasa = new NASA();
        Direction direction = new Direction();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Maximum constrains: ");
        String[] constrains = scanner.nextLine().split(" ");
        int xMax = Integer.parseInt(constrains[0]);
        int yMax = Integer.parseInt(constrains[1]);
        System.out.print("Enter Rover position and direction :");
        String[] userInput = scanner.nextLine().split(" ");
        int xPosition = Integer.parseInt(userInput[0]);
        int yPosition = Integer.parseInt(userInput[1]);
        String d = userInput[2];
        Rover rover = new Rover(xPosition, yPosition, d);
        String roverDirection = rover.getDirection();
        String command = nasa.getCommand();
        char[] commandArray = command.toCharArray();
        String direct;
        for (char c : commandArray) {
            if (c == 'L') {
                direct = direction.moveLeft(roverDirection);
                rover.setDirection(direct);
                roverDirection = rover.getDirection();
                rover.display();
            } else if (c == 'R') {
                direct = direction.moveRight(roverDirection);
                rover.setDirection(direct);
                roverDirection = rover.getDirection();
                rover.display();
            } else if (c == 'M') {
                rover.moveForward(xMax, yMax);
                rover.display();
            }
        }
        System.out.println("Final Position: ");
        rover.display();
    }
}


