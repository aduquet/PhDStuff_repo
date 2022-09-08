import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        java.lang.String str3 = TriangleClass.sideClass(100, 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        java.lang.Double double3 = TriangleClass.area((int) '4', 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (short) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        java.lang.Double double3 = TriangleClass.area(1, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        java.lang.String str3 = TriangleClass.sideClass(100, 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (-1), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, 10, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 10, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) (short) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        java.lang.Double double3 = TriangleClass.area(100, 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) '4', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        java.lang.String str3 = TriangleClass.sideClass((-1), 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) 'a', (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        java.lang.String str3 = TriangleClass.angleClass(0, 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        java.lang.Double double3 = TriangleClass.area(0, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        java.lang.Double double3 = TriangleClass.area((int) 'a', 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) '#', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (-1), 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        java.lang.String str3 = TriangleClass.sideClass((-1), 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) '#', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        java.lang.Double double3 = TriangleClass.area((int) ' ', 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) '#', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (byte) 100, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) '#', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        java.lang.String str3 = TriangleClass.sideClass(100, 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16086");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16087");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16088");
        java.lang.String str3 = TriangleClass.sideClass(10, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16089");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16090");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16091");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test16092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16092");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16093");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test16094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16094");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16095");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16096");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16097");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) '#', (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16098");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) 'a', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16099");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) '#', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16100");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16101");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16102");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16103");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16104");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16105");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16106");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16107");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16108");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (short) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16109");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16110");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16111");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16112");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) '#', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16113");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16114");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16115");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16116");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16117");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16118");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) '#', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16119");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16120");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16121");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16122");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16123");
        java.lang.String str3 = TriangleClass.sideClass(10, 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16124");
        java.lang.Double double3 = TriangleClass.area(10, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16125");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16126");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16127");
        java.lang.String str3 = TriangleClass.sideClass(1, (-1), 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16128");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16129");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (short) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16130");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16131");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (-1), 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16132");
        java.lang.String str3 = TriangleClass.angleClass(100, 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16133");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16134");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16135");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test16136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16136");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16137");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16138");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16139");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16140");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (-1), 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16141");
        java.lang.Double double3 = TriangleClass.area((int) ' ', 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16142");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test16143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16143");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16144");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16145");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16146");
        java.lang.Double double3 = TriangleClass.area(0, (int) '#', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16147");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16148");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16149");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16150");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16151");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16152");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16153");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16154");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16155");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16156");
        java.lang.Double double3 = TriangleClass.area(10, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16157");
        java.lang.String str3 = TriangleClass.angleClass(0, 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16158");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16159");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16160");
        java.lang.Double double3 = TriangleClass.area(1, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16161");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16162");
        java.lang.Double double3 = TriangleClass.area(1, (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16163");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16164");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16165");
        java.lang.String str3 = TriangleClass.sideClass(10, 10, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16166");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16167");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16168");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16169");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (short) 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16170");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16171");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16172");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16173");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16174");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16175");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16176");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) '4', 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16177");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16178");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (short) 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16179");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16180");
        java.lang.Double double3 = TriangleClass.area(1, 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16181");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16182");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16183");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, 10, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16184");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16185");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16186");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) '4', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16187");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (byte) 10, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16188");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16189");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16190");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16191");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16192");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16193");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16194");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16195");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16196");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16197");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16198");
        java.lang.Double double3 = TriangleClass.area(100, 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16199");
        java.lang.String str3 = TriangleClass.angleClass((-1), 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16200");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16201");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16202");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16203");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) 'a', (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16204");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16205");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16206");
        java.lang.Double double3 = TriangleClass.area((int) ' ', 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16207");
        java.lang.Double double3 = TriangleClass.area(10, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16208");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16209");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16210");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) '#', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16211");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16212");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16213");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16214");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) ' ', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16215");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16216");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16217");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16218");
        java.lang.Double double3 = TriangleClass.area((-1), (int) '4', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16219");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (byte) -1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16220");
        java.lang.Double double3 = TriangleClass.area(1, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16221");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) '4', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16222");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16223");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16224");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16225");
        java.lang.String str3 = TriangleClass.sideClass(10, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16226");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16227");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16228");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16229");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16230");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16231");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) '4', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test16232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16232");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) '#', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16233");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16234");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16235");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16236");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "equilateral" + "'", str3, "equilateral");
    }

    @Test
    public void test16237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16237");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16238");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16239");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16240");
        java.lang.Double double3 = TriangleClass.area(100, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16241");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16242");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) 'a', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16243");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16244");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, 1, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16245");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16246");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (short) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16247");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16248");
        java.lang.String str3 = TriangleClass.angleClass(100, 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16249");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16250");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test16251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16251");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16252");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16253");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16254");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16255");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16256");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) '#', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16257");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16258");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16259");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) ' ', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16260");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16261");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16262");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16263");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16264");
        java.lang.Double double3 = TriangleClass.area(10, (int) (short) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16265");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16266");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) '4', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16267");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) 'a', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16268");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16269");
        java.lang.Double double3 = TriangleClass.area(100, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16270");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) ' ', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16271");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16272");
        java.lang.Double double3 = TriangleClass.area((int) '4', 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16273");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16274");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16275");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16276");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (byte) -1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16277");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16278");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (-1), (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16279");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16280");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16281");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16282");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16283");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16284");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16285");
        java.lang.Double double3 = TriangleClass.area(1, (-1), (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16286");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16287");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (byte) 100, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16288");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16289");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16290");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16291");
        java.lang.Double double3 = TriangleClass.area(0, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16292");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16293");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test16294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16294");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) '#', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16295");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) (short) 10, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16296");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16297");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16298");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16299");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16300");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16301");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16302");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16303");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) '4', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16304");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16305");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', 10, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16306");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16307");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16308");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (-1), 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16309");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16310");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16311");
        java.lang.String str3 = TriangleClass.angleClass((-1), (-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16312");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16313");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16314");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16315");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16316");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16317");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16318");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16319");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (-1), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16320");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16321");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) '4', 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16322");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16323");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16324");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16325");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, 0, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16326");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16327");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16328");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) '#', 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16329");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16330");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16331");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16332");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16333");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16334");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16335");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) '4', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16336");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (byte) 100, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16337");
        java.lang.String str3 = TriangleClass.angleClass(1, 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16338");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) 'a', (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16339");
        java.lang.String str3 = TriangleClass.sideClass(100, (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16340");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16341");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test16342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16342");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16343");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16344");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16345");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16346");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16347");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16348");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) 'a', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16349");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16350");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16351");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16352");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16353");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (short) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16354");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16355");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16356");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16357");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16358");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) '4', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16359");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16360");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16361");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16362");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) '#', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16363");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16364");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16365");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16366");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16367");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16368");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) -1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "equilateral" + "'", str3, "equilateral");
    }

    @Test
    public void test16369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16369");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16370");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16371");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16372");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test16373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16373");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16374");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test16375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16375");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) '#', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test16376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16376");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16377");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16378");
        java.lang.Double double3 = TriangleClass.area(100, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test16379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16379");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16380");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test16381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16381");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16382");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test16383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16383");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }
}

