import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        java.lang.String str3 = TriangleClass.angleClass(0, (-1), 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) '4', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (-1), 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        java.lang.String str3 = TriangleClass.sideClass(100, 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (short) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, 1, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        java.lang.Double double3 = TriangleClass.area(0, 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        java.lang.Double double3 = TriangleClass.area(10, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "equilateral" + "'", str3, "equilateral");
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) (byte) 0, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) ' ', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (-1), (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        java.lang.Double double3 = TriangleClass.area(10, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (-1), 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (-1), 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) '#', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) (byte) -1, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) '4', (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        java.lang.Double double3 = TriangleClass.area(0, 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        java.lang.String str3 = TriangleClass.sideClass(10, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (-1), (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) '#', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        java.lang.Double double3 = TriangleClass.area(100, (int) '#', (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        java.lang.String str3 = TriangleClass.sideClass((-1), 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) '4', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) 'a', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        java.lang.Double double3 = TriangleClass.area(10, 100, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        java.lang.Double double3 = TriangleClass.area((int) '4', 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (short) -1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (-1), 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (int) 'a', 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) ' ', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) 'a', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) '#', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, 1, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) '4', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        java.lang.Double double3 = TriangleClass.area(100, 1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (short) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        java.lang.String str3 = TriangleClass.sideClass(10, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', 100, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (-1), (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) 'a', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14663");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14664");
        java.lang.Double double3 = TriangleClass.area(1, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14665");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 0, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14666");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14667");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14668");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (byte) 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test14669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14669");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14670");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (-1), (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14671");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) '#', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14672");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14673");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14674");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14675");
        java.lang.String str3 = TriangleClass.sideClass(1, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14676");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14677");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14678");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) '4', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14679");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14680");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14681");
        java.lang.String str3 = TriangleClass.sideClass(100, (-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14682");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test14683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14683");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (byte) 100, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14684");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, 10, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14685");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14686");
        java.lang.Double double3 = TriangleClass.area(0, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14687");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14688");
        java.lang.Double double3 = TriangleClass.area((int) '#', 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14689");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14690");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14691");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14692");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14693");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14694");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14695");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (-1), (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14696");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14697");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14698");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (short) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14699");
        java.lang.Double double3 = TriangleClass.area((int) ' ', 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14700");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14701");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14702");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14703");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) '4', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14704");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14705");
        java.lang.Double double3 = TriangleClass.area(10, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14706");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14707");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14708");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) ' ', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14709");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14710");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14711");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14712");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14713");
        java.lang.Double double3 = TriangleClass.area(10, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14714");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14715");
        java.lang.Double double3 = TriangleClass.area(0, 10, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14716");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14717");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14718");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (-1), 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14719");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14720");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (byte) 1, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14721");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14722");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14723");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14724");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14725");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14726");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 10, (int) '4', 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14727");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14728");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14729");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14730");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14731");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14732");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14733");
        java.lang.String str3 = TriangleClass.angleClass(100, 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14734");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14735");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14736");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14737");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14738");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14739");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14740");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14741");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14742");
        java.lang.String str3 = TriangleClass.sideClass(10, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14743");
        java.lang.String str3 = TriangleClass.sideClass(100, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14744");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14745");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14746");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14747");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14748");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14749");
        java.lang.Double double3 = TriangleClass.area((-1), (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14750");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14751");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14752");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14753");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14754");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14755");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14756");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (-1), (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14757");
        java.lang.String str3 = TriangleClass.angleClass(10, (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14758");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14759");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14760");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, 1, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14761");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14762");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14763");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14764");
        java.lang.String str3 = TriangleClass.sideClass((int) 'a', (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14765");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14766");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14767");
        java.lang.String str3 = TriangleClass.angleClass(1, (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14768");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (-1), 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14769");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14770");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14771");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14772");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 10, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14773");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14774");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14775");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14776");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14777");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14778");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14779");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14780");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14781");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14782");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14783");
        java.lang.String str3 = TriangleClass.sideClass(0, 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14784");
        java.lang.Double double3 = TriangleClass.area(100, 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14785");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14786");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14787");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14788");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) '4', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14789");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) '4', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14790");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, 0, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14791");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14792");
        java.lang.String str3 = TriangleClass.angleClass(0, (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14793");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14794");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14795");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test14796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14796");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14797");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14798");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (-1), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14799");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14800");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, 10, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14801");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14802");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14803");
        java.lang.Double double3 = TriangleClass.area((int) ' ', 10, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14804");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14805");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14806");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14807");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14808");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) ' ', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14809");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 100, (int) 'a', 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14810");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " right-angle" + "'", str3, " right-angle");
    }

    @Test
    public void test14811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14811");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14812");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14813");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14814");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14815");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14816");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14817");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14818");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14819");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14820");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (byte) 100, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14821");
        java.lang.String str3 = TriangleClass.angleClass(1, (int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14822");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14823");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 0, (int) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14824");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14825");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14826");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14827");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14828");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14829");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14830");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14831");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14832");
        java.lang.Double double3 = TriangleClass.area(0, (int) (byte) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14833");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) 'a', 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14834");
        java.lang.Double double3 = TriangleClass.area(100, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14835");
        java.lang.Double double3 = TriangleClass.area((int) (short) 100, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14836");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) (byte) -1, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14837");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14838");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14839");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14840");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14841");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) '4', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14842");
        java.lang.Boolean boolean3 = TriangleClass.possible(1, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14843");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14844");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14845");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14846");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14847");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14848");
        java.lang.Double double3 = TriangleClass.area(1, (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14849");
        java.lang.String str3 = TriangleClass.angleClass((int) 'a', 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14850");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14851");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14852");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (-1), 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14853");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14854");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14855");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14856");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14857");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14858");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14859");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14860");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14861");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14862");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14863");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14864");
        java.lang.Double double3 = TriangleClass.area(1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14865");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) -1, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14866");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (byte) 100, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14867");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14868");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14869");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14870");
        java.lang.Double double3 = TriangleClass.area((int) (short) 0, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14871");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14872");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14873");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14874");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14875");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14876");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) -1, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14877");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14878");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, 10, (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14879");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14880");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14881");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14882");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14883");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14884");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14885");
        java.lang.String str3 = TriangleClass.angleClass(100, (int) 'a', (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14886");
        java.lang.String str3 = TriangleClass.angleClass((int) '4', (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14887");
        java.lang.String str3 = TriangleClass.sideClass((int) '4', (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14888");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14889");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14890");
        java.lang.Double double3 = TriangleClass.area(10, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14891");
        java.lang.Double double3 = TriangleClass.area(0, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14892");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14893");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14894");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14895");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) (short) -1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14896");
        java.lang.String str3 = TriangleClass.sideClass(0, (int) (short) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14897");
        java.lang.Double double3 = TriangleClass.area(1, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14898");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14899");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) '#', (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14900");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14901");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) '#', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14902");
        java.lang.Double double3 = TriangleClass.area((int) (short) 10, (int) (short) 0, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14903");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14904");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14905");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14906");
        java.lang.Double double3 = TriangleClass.area(100, 1, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14907");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, (int) '4', (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14908");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (-1), 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14909");
        java.lang.Double double3 = TriangleClass.area(1, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14910");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (short) 1, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14911");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 1, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14912");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (-1), (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14913");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14914");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) '4', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14915");
        java.lang.Double double3 = TriangleClass.area(1, 10, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14916");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 100, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14917");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14918");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14919");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 10, (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14920");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) -1, (-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14921");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14922");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 10, (int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14923");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (short) 100, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14924");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 1, 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14925");
        java.lang.Double double3 = TriangleClass.area((int) (byte) 0, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14926");
        java.lang.Double double3 = TriangleClass.area(10, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14927");
        java.lang.Double double3 = TriangleClass.area((int) ' ', (int) '4', (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14928");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14929");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14930");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14931");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14932");
        java.lang.Double double3 = TriangleClass.area(10, 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14933");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, 0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " right-angle" + "'", str3, " right-angle");
    }

    @Test
    public void test14934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14934");
        java.lang.String str3 = TriangleClass.angleClass((int) ' ', (int) '#', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14935");
        java.lang.Boolean boolean3 = TriangleClass.possible(10, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14936");
        java.lang.String str3 = TriangleClass.angleClass((-1), (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14937");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14938");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 1, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14939");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14940");
        java.lang.String str3 = TriangleClass.angleClass(0, 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14941");
        java.lang.String str3 = TriangleClass.angleClass(100, 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14942");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 100, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14943");
        java.lang.Double double3 = TriangleClass.area((int) (short) 1, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14944");
        java.lang.Double double3 = TriangleClass.area(100, 10, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14945");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14946");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14947");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) '4', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14948");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 1, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14949");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14950");
        java.lang.String str3 = TriangleClass.sideClass((int) '#', (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14951");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '4', (-1), (-1));
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14952");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14953");
        java.lang.String str3 = TriangleClass.angleClass((int) '#', (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14954");
        java.lang.String str3 = TriangleClass.sideClass(0, 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14955");
        java.lang.Double double3 = TriangleClass.area((int) 'a', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14956");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 0, (int) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14957");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14958");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 100, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14959");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14960");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 1, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14961");
        java.lang.Double double3 = TriangleClass.area(10, 100, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14962");
        java.lang.Double double3 = TriangleClass.area((int) (byte) -1, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14963");
        java.lang.Double double3 = TriangleClass.area((int) '4', (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14964");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 0, (int) '4', (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14965");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 10, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14966");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14967");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14968");
        java.lang.Boolean boolean3 = TriangleClass.possible(0, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14969");
        java.lang.Boolean boolean3 = TriangleClass.possible(100, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14970");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14971");
        java.lang.Double double3 = TriangleClass.area((-1), 0, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14972");
        java.lang.Double double3 = TriangleClass.area((int) '#', (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14973");
        java.lang.Double double3 = TriangleClass.area(10, (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14974");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) '#', (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14975");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14976");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14977");
        java.lang.String str3 = TriangleClass.angleClass(100, 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14978");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) 1, 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14979");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (-1), 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "acute-angle" + "'", str3, "acute-angle");
    }

    @Test
    public void test14980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14980");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 0, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14981");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "right-angle" + "'", str3, "right-angle");
    }

    @Test
    public void test14982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14982");
        java.lang.String str3 = TriangleClass.sideClass((int) ' ', (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14983");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) 'a', (-1), 0);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14984");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 100, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14985");
        java.lang.Double double3 = TriangleClass.area(0, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14986");
        java.lang.Double double3 = TriangleClass.area((-1), (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14987");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) -1, (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14988");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 0, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14989");
        java.lang.Boolean boolean3 = TriangleClass.possible((-1), (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14990");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 100, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14991");
        java.lang.String str3 = TriangleClass.sideClass((int) (byte) 0, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scalene" + "'", str3, "scalene");
    }

    @Test
    public void test14992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14992");
        java.lang.String str3 = TriangleClass.sideClass((-1), (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "equilateral" + "'", str3, "equilateral");
    }

    @Test
    public void test14993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14993");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) ' ', (int) ' ', (int) '4');
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test14994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14994");
        java.lang.Double double3 = TriangleClass.area((int) (short) -1, 10, 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test14995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14995");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) -1, 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14996");
        java.lang.String str3 = TriangleClass.angleClass((int) (byte) 100, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test14997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14997");
        java.lang.String str3 = TriangleClass.sideClass((int) (short) 10, (-1), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "isosceles" + "'", str3, "isosceles");
    }

    @Test
    public void test14998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14998");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (byte) 10, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }

    @Test
    public void test14999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14999");
        java.lang.String str3 = TriangleClass.angleClass((int) (short) -1, (int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "obtuse-angle" + "'", str3, "obtuse-angle");
    }

    @Test
    public void test15000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test15000");
        java.lang.Boolean boolean3 = TriangleClass.possible((int) (short) 1, 0, 1);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + false + "'", boolean3, false);
    }
}

