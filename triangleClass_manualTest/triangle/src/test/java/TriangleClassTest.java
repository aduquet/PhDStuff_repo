
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Optional;

public class TriangleClassTest {
//    Map<Integer, Map<String, String>> map = new HashMap<>();

    @Test
    public final  void testSideClass() {
        assertNull(TriangleClass.sideClass(0,1,1));
    }

    @Test
    public final  void testSideClass2() {
        assertNull(TriangleClass.sideClass(1, 2, 3));
    }

    @Test
    public final  void area1() {
        assertNull(TriangleClass.area(1, 2, 3));
    }



//    @Test
//    public final  void testSideClassMR1() {
//        assertEquals(TriangleClass.sideClass(0,1,1),TriangleClass.sideClass(1,0,1));
//        assertEquals(TriangleClass.sideClass(0,1,1), TriangleClass.sideClass(1,1,0));
//    }
//
//    @Test
//    public final  void testSideClass2MR1() {
//        assertEquals(TriangleClass.sideClass(1, 2, 3), TriangleClass.sideClass(2, 3, 1));
//        assertEquals(TriangleClass.sideClass(1, 2, 3), TriangleClass.sideClass(3, 2, 0));
//    }
//
//    @Test
//    public final  void area1_MR2() {
//        assertEquals(TriangleClass.area(1, 2, 3), TriangleClass.area(2, 3, 1));
//        assertEquals(TriangleClass.area(5, 4, 3), TriangleClass.area(3, 4, 5));
//    }
//
//    @Test
//    public final  void area2_MR3() {
//
//        Double a = TriangleClass.area(5, 4, 3);
//        Double b = TriangleClass.area(10, 8, 6);
//
//        assertTrue(a < b );
//    }

}
