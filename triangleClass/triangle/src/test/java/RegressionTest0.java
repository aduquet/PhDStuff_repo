import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) 'a', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 1, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) '#', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (short) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        TriangleClass triangleClass0 = new TriangleClass();
        java.lang.Class<?> wildcardClass1 = triangleClass0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.Double double3 = TriangleClass.area(0, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (short) 1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) '#', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) (short) 1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "equilateral" + "'", str3, "equilateral");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) '4', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) '#', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) '#', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) (short) 1, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (short) 1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) '#', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.String str3 = TriangleClass.angleClass(100, 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), 0, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (byte) 1, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (byte) 100, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (byte) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.lang.String str3 = TriangleClass.angleClass(0, (-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) '#', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.String str3 = TriangleClass.sideClass(10, 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.lang.Double double3 = TriangleClass.area(1, 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) '4', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (short) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.lang.Double double3 = TriangleClass.area((int) '#', 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 10, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.lang.String str3 = TriangleClass.angleClass(0, (-1), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.lang.String str3 = TriangleClass.angleClass(1, (-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.Double double3 = TriangleClass.area(100, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.lang.String str3 = TriangleClass.angleClass((-1), 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (-1), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (-1), 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.lang.String str3 = TriangleClass.sideClass(100, 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (short) 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.lang.String str3 = TriangleClass.sideClass(10, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) 1, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) (short) -1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (-1), 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.Double double3 = TriangleClass.area(100, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.lang.String str3 = TriangleClass.angleClass(10, (-1), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (-1), 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " right-angle" + "'", str3, " right-angle");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) '4', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (-1), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.lang.Double double3 = TriangleClass.area(100, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (-1), 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.lang.Double double3 = TriangleClass.area(0, (int) ' ', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) 1, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.lang.String str3 = TriangleClass.sideClass(100, 1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) '#', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, 0, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.lang.Double double3 = TriangleClass.area(100, 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        java.lang.Double double3 = TriangleClass.area((int) ' ', 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " right-angle" + "'", str3, " right-angle");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) (short) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.lang.String str3 = TriangleClass.sideClass(0, 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (short) 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (short) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.lang.Double double3 = TriangleClass.area((int) '#', 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.lang.String str3 = TriangleClass.sideClass((-1), (-1), (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "equilateral" + "'", str3, "equilateral");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (-1), 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) ' ', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (byte) 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.String str3 = TriangleClass.sideClass(0, 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.lang.Double double3 = TriangleClass.area(0, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.lang.Double double3 = TriangleClass.area(0, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (short) 1, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.lang.Double double3 = TriangleClass.area(1, 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.lang.String str3 = TriangleClass.sideClass((-1), 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) (short) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.lang.String str3 = TriangleClass.angleClass(0, 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (byte) 1, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.lang.String str3 = TriangleClass.sideClass(10, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.lang.Double double3 = TriangleClass.area(0, (int) (short) 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) '4', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) '#', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) '4', 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) ' ', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (byte) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.lang.Double double3 = TriangleClass.area(1, (-1), (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.lang.Double double3 = TriangleClass.area((int) '#', 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (short) 100, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, 0, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) '4', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (-1), 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', 10, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.lang.Double double3 = TriangleClass.area(10, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) 'a', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (byte) 1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) '4', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) ' ', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) '4', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.lang.Double double3 = TriangleClass.area(0, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.lang.Double double3 = TriangleClass.area(0, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.lang.String str3 = TriangleClass.angleClass(0, 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.lang.String str3 = TriangleClass.angleClass((-1), (-1), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        java.lang.String str3 = TriangleClass.sideClass(100, 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.lang.Double double3 = TriangleClass.area((int) '4', 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, 1, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) '#', (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) 100, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.lang.Double double3 = TriangleClass.area(0, 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) '4', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (-1), 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.lang.Double double3 = TriangleClass.area(0, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.lang.String str3 = TriangleClass.sideClass(10, 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, 1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.lang.String str3 = TriangleClass.sideClass((-1), 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.lang.String str3 = TriangleClass.sideClass(0, 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) ' ', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) (short) -1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, 100, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) '4', 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) '4', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.lang.Double double3 = TriangleClass.area(100, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, 1, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (short) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) 'a', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.lang.Double double3 = TriangleClass.area(1, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) 'a', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 0, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (short) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) '#', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.lang.Double double3 = TriangleClass.area(10, 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) '#', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 1, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.lang.Double double3 = TriangleClass.area((int) 'a', 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.lang.String str3 = TriangleClass.angleClass(0, (-1), (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) '4', (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (-1), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.String str3 = TriangleClass.sideClass(0, 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.lang.Double double3 = TriangleClass.area(0, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.lang.Double double3 = TriangleClass.area(0, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (short) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }
}

