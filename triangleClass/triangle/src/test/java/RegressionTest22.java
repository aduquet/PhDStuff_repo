import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        java.lang.Double double3 = TriangleClass.area(10, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) '4', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (byte) 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) '#', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, 100, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) '#', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) '4', 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, 100, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (-1), 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        java.lang.Double double3 = TriangleClass.area(100, 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) 'a', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (byte) 10, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        java.lang.Double double3 = TriangleClass.area(1, 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        java.lang.Double double3 = TriangleClass.area((-1), (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) '#', 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        java.lang.String str3 = TriangleClass.angleClass(10, 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        java.lang.Double double3 = TriangleClass.area((int) '4', 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) '#', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (-1), 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        java.lang.Double double3 = TriangleClass.area(10, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) -1, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        java.lang.Double double3 = TriangleClass.area(10, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        java.lang.String str3 = TriangleClass.sideClass(100, 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) '4', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        java.lang.String str3 = TriangleClass.sideClass(0, (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) 'a', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        java.lang.String str3 = TriangleClass.angleClass(100, 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        java.lang.String str3 = TriangleClass.sideClass(1, 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (byte) 1, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', 100, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        java.lang.Double double3 = TriangleClass.area(0, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (short) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        java.lang.Double double3 = TriangleClass.area(100, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, 1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (short) 1, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        java.lang.Double double3 = TriangleClass.area((-1), 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        java.lang.String str3 = TriangleClass.angleClass(0, 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        java.lang.Double double3 = TriangleClass.area(100, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        java.lang.Double double3 = TriangleClass.area((int) ' ', 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        java.lang.Double double3 = TriangleClass.area(100, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        java.lang.String str3 = TriangleClass.sideClass(0, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) '4', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        java.lang.Double double3 = TriangleClass.area(0, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        java.lang.Double double3 = TriangleClass.area((int) '#', 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        java.lang.Double double3 = TriangleClass.area(1, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        java.lang.Double double3 = TriangleClass.area(1, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        java.lang.Double double3 = TriangleClass.area(0, (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (-1), (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, 1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        java.lang.Double double3 = TriangleClass.area(1, 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        java.lang.Double double3 = TriangleClass.area(0, 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (-1), 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) '4', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (short) 10, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) '4', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (short) 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        java.lang.Double double3 = TriangleClass.area(0, 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) '4', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) 'a', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) '#', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        java.lang.Double double3 = TriangleClass.area(1, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) 'a', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (short) 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) '#', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        java.lang.String str3 = TriangleClass.angleClass((-1), 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) '#', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        java.lang.Double double3 = TriangleClass.area((int) '#', 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        java.lang.String str3 = TriangleClass.angleClass(100, 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (-1), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) (short) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        java.lang.String str3 = TriangleClass.sideClass(10, (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) ' ', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) '#', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        java.lang.Double double3 = TriangleClass.area(10, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        java.lang.Double double3 = TriangleClass.area((int) ' ', 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (short) 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (short) 100, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) '#', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', 100, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        java.lang.Double double3 = TriangleClass.area(1, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), 100, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        java.lang.Double double3 = TriangleClass.area(10, 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (short) 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        java.lang.String str3 = TriangleClass.sideClass(0, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (short) 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (-1), 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        java.lang.Double double3 = TriangleClass.area((-1), 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', 100, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) '#', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 100, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) '#', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (short) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        java.lang.Double double3 = TriangleClass.area((-1), 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        java.lang.Double double3 = TriangleClass.area(0, (int) ' ', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        java.lang.String str3 = TriangleClass.sideClass(0, (-1), (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        java.lang.Double double3 = TriangleClass.area(1, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        java.lang.Double double3 = TriangleClass.area((int) ' ', 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) '4', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) '#', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        java.lang.String str3 = TriangleClass.sideClass(10, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        java.lang.Double double3 = TriangleClass.area(100, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (-1), 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) 10, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (-1), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) '4', (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        java.lang.String str3 = TriangleClass.angleClass(1, 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) '4', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        java.lang.Double double3 = TriangleClass.area((-1), (int) ' ', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (short) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        java.lang.Double double3 = TriangleClass.area(10, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (-1), 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        java.lang.Double double3 = TriangleClass.area((-1), (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (-1), 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) '4', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        java.lang.String str3 = TriangleClass.sideClass(10, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) 'a', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (short) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (short) 1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (byte) 1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        java.lang.Double double3 = TriangleClass.area((-1), (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) ' ', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        java.lang.Double double3 = TriangleClass.area(100, 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) '4', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        java.lang.Double double3 = TriangleClass.area(10, (int) (short) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) '4', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) 'a', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        java.lang.String str3 = TriangleClass.sideClass(10, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) '4', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (short) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }
}

