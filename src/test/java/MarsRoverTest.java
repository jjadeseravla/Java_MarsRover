import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MarsRoverTest {

    //private Direction direction;
    private MarsRover marsRover;

    @Before
    public void setUp() {
        marsRover = new MarsRover("North", 0, 0);
    }

    @Test
    public void marsRoverCanChangeDirection() {
        //direction = new Direction("North");
        //marsRover = new MarsRover(direction, 0, 0);
        //marsRover = new MarsRover("North", 0, 0);
        assertEquals(marsRover.getX(), 0);
        assertEquals(marsRover.getY(), 0);
        assertEquals(marsRover.getDirection(), "North");
    }

    @Test
    public void canRotateRightFromNorth() {
        assertEquals("East", marsRover.rotateRight());
    }

    @Test
    public void canRotateRightFromEast() {
        marsRover = new MarsRover("East", 0, 0);
        assertEquals("South", marsRover.rotateRight());
    }

    @Test
    public void canRotateRightFromSouth() {
        marsRover = new MarsRover("South", 0, 0);
        assertEquals("West", marsRover.rotateRight());
    }

    @Test
    public void canRotateRightFromWest() {
        marsRover = new MarsRover("West", 0, 0);
        assertEquals("North", marsRover.rotateRight());
    }

    @Test
    public void canRotate180DegreesToTheRight() {
        marsRover.rotateRight();
        assertEquals("South", marsRover.rotateRight());
    }

    @Test
    public void canRotateLeftFromNorth() {
        assertEquals("West", marsRover.rotateLeft());
    }

    @Test
    public void canRotateLeftFromWest() {
        marsRover = new MarsRover("South", 0, 0);
        assertEquals("East", marsRover.rotateLeft());
    }

    @Test
    public void canRotate270DegreesToTheLeft() {
        marsRover.rotateLeft();
        marsRover.rotateLeft();
        assertEquals("East", marsRover.rotateLeft());
    }
}
