import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (-1), 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) '#', 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, 10, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (byte) 1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) '#', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (short) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, 100, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (short) 10, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        java.lang.String str3 = TriangleClass.angleClass(10, (-1), 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (-1), 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        java.lang.Double double3 = TriangleClass.area(100, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        java.lang.Double double3 = TriangleClass.area(10, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        java.lang.String str3 = TriangleClass.angleClass(0, 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) '#', (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        java.lang.Double double3 = TriangleClass.area(100, (int) (short) 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        java.lang.Double double3 = TriangleClass.area(0, (int) (short) 0, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        java.lang.Double double3 = TriangleClass.area(10, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        java.lang.Double double3 = TriangleClass.area(10, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) '#', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (-1), (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        java.lang.Double double3 = TriangleClass.area(1, (-1), (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        java.lang.String str3 = TriangleClass.angleClass((-1), 100, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        java.lang.Double double3 = TriangleClass.area(1, (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        java.lang.Double double3 = TriangleClass.area((int) '#', 1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) 'a', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (byte) 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) '#', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, 0, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (-1), (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        java.lang.String str3 = TriangleClass.sideClass(0, 10, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) 'a', (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) '4', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, 1, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        java.lang.String str3 = TriangleClass.sideClass(0, 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (byte) 1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) '#', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, 1, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        java.lang.Double double3 = TriangleClass.area((int) '#', 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) '4', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) '4', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        java.lang.Double double3 = TriangleClass.area((int) '#', 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        java.lang.String str3 = TriangleClass.angleClass(10, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 100, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        java.lang.String str3 = TriangleClass.sideClass(1, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, 100, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (short) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) 'a', 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (short) 1, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (-1), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (byte) 10, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        java.lang.Double double3 = TriangleClass.area((int) ' ', 1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) '4', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) 'a', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        java.lang.Double double3 = TriangleClass.area((int) 'a', 0, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        java.lang.Double double3 = TriangleClass.area(100, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        java.lang.Double double3 = TriangleClass.area((-1), (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, 1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        java.lang.Double double3 = TriangleClass.area(10, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        java.lang.Double double3 = TriangleClass.area(0, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (byte) -1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 100, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (short) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        java.lang.Double double3 = TriangleClass.area((-1), 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (-1), 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, 100, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 1, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        java.lang.Double double3 = TriangleClass.area(0, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        java.lang.Double double3 = TriangleClass.area((-1), 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        java.lang.String str3 = TriangleClass.sideClass(100, 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        java.lang.Double double3 = TriangleClass.area(1, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) '4', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        java.lang.String str3 = TriangleClass.angleClass(0, 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) ' ', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        java.lang.Double double3 = TriangleClass.area(10, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        java.lang.Double double3 = TriangleClass.area(1, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) '4', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) -1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) (short) 0, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        java.lang.Double double3 = TriangleClass.area(1, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (short) 1, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        java.lang.String str3 = TriangleClass.angleClass(100, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) '4', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', 1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (short) 100, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (byte) 100, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) '#', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        java.lang.Double double3 = TriangleClass.area(0, 0, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        java.lang.Double double3 = TriangleClass.area(10, (int) 'a', (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        java.lang.Double double3 = TriangleClass.area(0, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (-1), 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) (short) 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) 'a', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) ' ', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (byte) 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        java.lang.Double double3 = TriangleClass.area((int) '#', 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        java.lang.Double double3 = TriangleClass.area(1, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) '#', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) '4', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (-1), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " right-angle" + "'", str3, " right-angle");
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        java.lang.String str3 = TriangleClass.angleClass(100, 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        java.lang.Double double3 = TriangleClass.area(1, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) '4', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        java.lang.String str3 = TriangleClass.sideClass(0, 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        java.lang.String str3 = TriangleClass.angleClass((-1), 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        java.lang.Double double3 = TriangleClass.area((int) '#', 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) ' ', (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        java.lang.Double double3 = TriangleClass.area(1, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        java.lang.String str3 = TriangleClass.angleClass((-1), (-1), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        java.lang.Double double3 = TriangleClass.area(0, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "equilateral" + "'", str3, "equilateral");
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        java.lang.String str3 = TriangleClass.angleClass(10, 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        java.lang.String str3 = TriangleClass.sideClass(0, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (-1), (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (-1), 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        java.lang.String str3 = TriangleClass.sideClass(100, 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 1, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (-1), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (short) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (byte) 10, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, 0, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, 1, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        java.lang.String str3 = TriangleClass.angleClass((-1), 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) 'a', (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (-1), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, 10, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) '4', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (-1), (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        java.lang.Double double3 = TriangleClass.area((int) 'a', 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) '4', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', 0, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) (short) 100, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, 10, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) 'a', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        java.lang.Double double3 = TriangleClass.area(100, 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (short) 10, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        java.lang.String str3 = TriangleClass.sideClass(0, (-1), (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (-1), 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        java.lang.Double double3 = TriangleClass.area(100, (int) ' ', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, 0, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        java.lang.String str3 = TriangleClass.sideClass(10, 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) '4', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (short) 1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        java.lang.String str3 = TriangleClass.angleClass((-1), 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) '#', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        java.lang.String str3 = TriangleClass.angleClass(1, (-1), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " right-angle" + "'", str3, " right-angle");
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (-1), (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        java.lang.Double double3 = TriangleClass.area(0, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        java.lang.Double double3 = TriangleClass.area(10, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        java.lang.Double double3 = TriangleClass.area(1, (int) (short) 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) '#', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) ' ', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) 'a', (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) '#', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        java.lang.Double double3 = TriangleClass.area(100, (int) ' ', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', 0, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        java.lang.Double double3 = TriangleClass.area((-1), 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) '4', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        java.lang.Double double3 = TriangleClass.area(0, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) '#', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }
}

