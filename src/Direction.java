public class Direction {
    String[] directions = {"west", "north", "east", "south"};

    public String moveLeft(String roverDirection) {
        String updatedDirection = "";
        for (int i = 0; i < directions.length; i++) {
            if (roverDirection.equalsIgnoreCase(directions[i])) {
                int index = i - 1;
                if (index < 0) {
                    updatedDirection = directions[3];
                } else {
                    updatedDirection = directions[index];
                }
            }
        }
        return updatedDirection;
    }

    public String moveRight(String roverDirection) {
        String updatedDirection = "";
        for (int i = 0; i < directions.length; i++) {
            if (roverDirection.equalsIgnoreCase(directions[i])) {
                int index = i + 1;
                if (index >= directions.length) {
                    updatedDirection = directions[0];
                } else {
                    updatedDirection = directions[index];
                }

            }
        }
        return updatedDirection;
    }
}

