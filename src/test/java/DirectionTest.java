//import org.junit.Test;
//
//import static junit.framework.TestCase.assertEquals;
//
//public class DirectionTest {
//
//    @Test
//    public void canRotateRightFromNorth() {
//        Direction direction = new Direction("North");
//        assertEquals("East", direction.rotateRight());
//    }
//
//    @Test
//    public void canRotateRightFromEast() {
//        Direction direction = new Direction("East");
//        assertEquals("South", direction.rotateRight());
//    }
//
//    @Test
//    public void canRotateRightFromSouth() {
//        Direction direction = new Direction("South");
//        assertEquals("West", direction.rotateRight());
//    }
//
//    @Test
//    public void canRotateRightFromWest() {
//        Direction direction = new Direction("West");
//        assertEquals("North", direction.rotateRight());
//    }
//
//    @Test
//    public void cannotRotateIfNotACompassPoint() {
//        Direction direction = new Direction("adhbjfknsdgshls");
//        assertEquals("null", direction.rotateRight());
//    }
//}
