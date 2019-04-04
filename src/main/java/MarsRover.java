import java.util.ArrayList;

public class MarsRover {
    private String direction;
    private int X;
    private int Y;
    private String[] compassPoints = {"North", "East", "South", "West"};

    public MarsRover(int X, int Y) {
        this.direction = "North";
        this.X = 0;
        this.Y = 0;
    }

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
        int tempIndex = 0;
        int index = 0;

        for (int i = 0; i < compassPoints.length; i++) {
            if(direction.equals(compassPoints[i])) {
                tempIndex = i;
            }
        }
        int checkIndex = tempIndex + 1;
        if (checkIndex < compassPoints.length) {
             index = checkIndex;
        } else  {
            index = 0;
        }
            setDirection(compassPoints[index]);
        return getDirection();
    }
}
