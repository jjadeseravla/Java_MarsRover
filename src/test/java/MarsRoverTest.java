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
    public void cannotRotateIfNotACompassPoint() {
        marsRover = new MarsRover("asdhbsdfjsadks", 0, 0);
        assertEquals("null", marsRover.rotateRight());
    }

    @Test
    public void canRotate180Degrees() {
        marsRover.rotateRight();
        assertEquals("South", marsRover.rotateRight());
    }
}
