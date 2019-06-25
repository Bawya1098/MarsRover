public class Rover {
    private int xPosition;
    private int yPosition;
    private String direction;

    public Rover(int xPosition, int yPosition, String direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }


    public void moveForward(int xMax, int yMax) {
        switch (direction) {
            case "north":
                yPosition = yPosition + 1;
                if (yPosition > yMax) {
                    System.out.println("limit exceeded");
                }
                break;
            case "south":
                yPosition = yPosition - 1;
                if (yPosition<0) {
                    System.out.println("Under limit exceeded");
                }
                break;
            case "east":
                xPosition = xPosition + 1;
                if (xPosition > xMax) {
                    System.out.println("limit exceeded");
                }
                break;
            case "west":
                xPosition = xPosition - 1;
                if (xPosition <0) {
                    System.out.println("Under limit exceeded");
                }
                break;
        }
    }

    void display() {
        System.out.println("xPosition :" + xPosition + "\n" + "yPosition : " + yPosition + "\n" + "direction : " + direction);
    }

}
