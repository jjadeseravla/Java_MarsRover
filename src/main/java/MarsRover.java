public class MarsRover {
    private String direction;
    private int X;
    private int Y;

    public MarsRover(String direction, int X, int Y) {
        this.direction = direction;
        this.X = 0;
        this.Y = 0;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public String rotateRight() {
        switch (direction) {
            case "North":
                return "East";
            case "East":
                return "South";
            case "South":
                return "West";
            case "West":
                return "North";
            default:
                return "null";
        }
    }
}
