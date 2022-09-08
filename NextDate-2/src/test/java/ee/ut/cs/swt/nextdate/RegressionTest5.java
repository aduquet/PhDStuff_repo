import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 100, 10);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 10, (int) (short) 100);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(1, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) 'a', 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) ' ', 1);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) '#', (int) (byte) 100);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) ' ', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) 'a', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 1, (int) ' ');
        java.lang.String str11 = nextDate3.run(1, (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run(10, (int) (byte) 1, (int) (short) -1);
        java.lang.String str19 = nextDate3.run((int) (short) -1, 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 10, (int) '4');
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) ' ', 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, (int) '4');
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) ' ', 0, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, 1, 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '4', 0);
        java.lang.String str11 = nextDate3.run(0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '4', (-1));
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (-1), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 100, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((-1), 0, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (short) 0, 10, (int) (short) 1);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 0);
        java.lang.String str19 = nextDate3.run((int) (short) -1, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (-1), 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) '#', 0);
        java.lang.String str11 = nextDate3.run(100, (int) 'a', 1);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) '4', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '#', 0);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 0, 10);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 0, (int) 'a');
        java.lang.String str7 = nextDate3.run(100, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '4', (int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '#', (int) (short) 10);
        java.lang.String str7 = nextDate3.run(10, 100, (int) '#');
        java.lang.String str11 = nextDate3.run((-1), 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, 1);
        java.lang.String str7 = nextDate3.run(1, (int) (short) 10, (int) 'a');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 0, (int) '4');
        java.lang.String str7 = nextDate3.run((-1), (int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, 0);
        java.lang.String str7 = nextDate3.run(1, (int) 'a', (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (short) 0, (int) ' ');
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (short) 100, (int) (short) 10);
        java.lang.String str19 = nextDate3.run(10, 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 0, 0);
        java.lang.String str7 = nextDate3.run(1, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '4', 0);
        java.lang.String str7 = nextDate3.run(0, (-1), 10);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) 10, (int) (byte) -1);
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 1, (int) (byte) 100);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 0, (int) 'a');
        java.lang.String str7 = nextDate3.run(10, (int) (short) 10, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 100, 1, 1);
        java.lang.String str31 = nextDate3.run((int) (short) 1, 1, (-1));
        java.lang.Class<?> wildcardClass32 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 100, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 10, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, 1);
        java.lang.String str7 = nextDate3.run((int) '4', 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) '4', (int) 'a', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, (-1));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) -1, (int) '#');
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) ' ', 0, (int) (short) 0);
        java.lang.String str19 = nextDate3.run((int) 'a', 0, 1);
        java.lang.String str23 = nextDate3.run((int) ' ', 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 100, 1);
        java.lang.String str7 = nextDate3.run(0, 100, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) ' ', 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 10, 100);
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 10, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) ' ', (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 100, 100);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) '#', 0);
        java.lang.String str11 = nextDate3.run(100, (int) 'a', 1);
        java.lang.String str15 = nextDate3.run((int) (byte) -1, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 100, 10);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 10, (int) (short) 10);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 100, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 10, 10);
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (int) (short) 1, (int) (byte) 100);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, (int) (byte) 100, (int) ' ');
        java.lang.String str27 = nextDate3.run((int) (short) 0, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) 'a', (int) ' ', 100);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 10, 10);
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (int) (short) 1, (int) (byte) 100);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 100, (int) (short) -1);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 1, (int) '#');
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 100, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 0, (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((-1), 1, 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 10, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 10, 1);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 100, 0);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run(10, 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 10, (int) '4');
        java.lang.String str11 = nextDate3.run((int) (short) 100, (-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 1, (-1));
        java.lang.String str11 = nextDate3.run((int) (byte) -1, 0, (int) '4');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) '#', 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) -1, (int) (byte) 100);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 1);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 100, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) '#');
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(10, 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (int) (short) 1, (int) (short) -1);
        java.lang.String str19 = nextDate3.run((int) (short) 0, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '4', 0);
        java.lang.String str7 = nextDate3.run(0, (-1), 10);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) 10, (int) (byte) -1);
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', 1);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, (int) '#');
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) 'a', 100, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 100, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) ' ', 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) (short) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 100, 1);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 100, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) -1, 1, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 0, 100);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((int) (short) -1, (int) 'a', (-1));
        java.lang.String str23 = nextDate3.run((-1), (-1), (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) 'a', (int) (short) 1);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) ' ', 0, (int) (short) 0);
        java.lang.String str19 = nextDate3.run((int) 'a', 0, 1);
        java.lang.String str23 = nextDate3.run((int) ' ', 1, (int) (byte) -1);
        java.lang.String str27 = nextDate3.run((int) (byte) 1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '4', (int) (short) -1);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) -1, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) '#', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) -1, (-1));
        java.lang.String str7 = nextDate3.run(100, (int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 1, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '#', 0);
        java.lang.String str7 = nextDate3.run(1, (int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) '4');
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 10, (int) 'a');
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) -1, 10);
        java.lang.String str11 = nextDate3.run(10, 0, 0);
        java.lang.String str15 = nextDate3.run(10, (int) (byte) 10, 1);
        java.lang.String str19 = nextDate3.run(100, 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) ' ', (int) '4');
        java.lang.String str7 = nextDate3.run((int) '#', 100, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) ' ', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) -1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '4', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) 'a', (int) '4');
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 10, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) 'a', 1);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) 'a');
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 100, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) 'a', 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 10, 0);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 100, (-1));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 10, (int) (byte) 100);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (short) 0, 1);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) 'a', 100);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 0, 1);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(100, (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) -1, (int) 'a');
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (byte) 100, 1);
        java.lang.String str19 = nextDate3.run(10, (int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) '#', 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 0, 100);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 100, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 0, (-1));
        java.lang.String str11 = nextDate3.run((int) (short) -1, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (-1), 1);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 1, 0);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) ' ', 1);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, 0);
        java.lang.String str11 = nextDate3.run((int) 'a', 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) -1, (int) (short) 0, (-1));
        java.lang.String str19 = nextDate3.run(100, 10, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) (short) 0, (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run(0, 100, (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 0, 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) '#', (int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) (short) 1);
        java.lang.String str11 = nextDate3.run(1, 0, (int) '#');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (int) (short) 0);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 100, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, 10);
        java.lang.String str7 = nextDate3.run(0, 1, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, 1, (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (-1), (int) (short) 100);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) '4');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (-1), (int) '4');
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 10, (int) (byte) -1);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '#', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) '4');
        java.lang.String str11 = nextDate3.run(0, 100, (int) (short) 10);
        java.lang.String str15 = nextDate3.run((-1), (int) (byte) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) -1, 0);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '#', 10);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 1, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, 10, (int) 'a');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 100, 10);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(10, 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(1, 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) 'a', 0, (int) (short) 0);
        java.lang.String str19 = nextDate3.run((int) '4', 10, (int) (byte) 100);
        java.lang.String str23 = nextDate3.run((int) (byte) -1, (int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 10, (int) (short) 10);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '4', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 1, 10);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) ' ', (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (short) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 10, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) ' ', (int) (short) 1);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 0, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run(10, (-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '4', (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 1, (int) (short) 10);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 10, (int) (short) -1);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run(10, (int) (short) 0, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((-1), (int) '#', (int) '#');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 10, (int) '4');
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) ' ', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 1, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 10, 100);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) (short) 1);
        java.lang.String str11 = nextDate3.run(1, 0, (int) '#');
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (byte) -1, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) (byte) 10, (int) 'a', (-1));
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (int) '#');
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 10, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 10, (int) (byte) 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 0, (int) (short) 10, (int) (byte) 0);
        java.lang.String str23 = nextDate3.run((int) (byte) 100, (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 100, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, 1);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 1, (-1));
        java.lang.String str11 = nextDate3.run((int) (short) 100, 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, (int) (byte) 1);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 10, (-1));
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 10, (int) 'a');
        java.lang.String str7 = nextDate3.run(1, (int) '#', 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) -1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) 'a', (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((-1), 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 1, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) 'a', (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) -1, 10);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) 'a', (int) 'a');
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, 10);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 100, 10);
        java.lang.String str7 = nextDate3.run(10, 0, 10);
        java.lang.String str11 = nextDate3.run(1, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 10, 0);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(10, 10, (-1));
        java.lang.String str19 = nextDate3.run((int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str23 = nextDate3.run(100, (int) (short) -1, (int) '4');
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(0, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (short) 1, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) (byte) 10, (int) (byte) 1);
        java.lang.String str19 = nextDate3.run(0, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '4', 0);
        java.lang.String str7 = nextDate3.run(0, (-1), 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) -1, 1);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) '#', 0);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 100, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 10, 0);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) (short) 1, (int) (short) -1);
        java.lang.String str23 = nextDate3.run((-1), (int) (short) 0, 0);
        java.lang.String str27 = nextDate3.run((int) ' ', (int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass28 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '#', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(0, 0, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((-1), 1, 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 10, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 10, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) (byte) 10, (int) (short) 10, 10);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run(10, 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (-1), (int) '#');
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) ' ', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '4', 1);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) '4');
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 1, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) 'a', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 100, (int) '#');
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 100, (int) (short) 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '#', (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run(100, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (-1), (int) (byte) 1);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) '4', (int) (short) 10);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 10, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 0, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (int) (byte) -1);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) -1, (-1));
        java.lang.String str7 = nextDate3.run((int) 'a', 1, (int) ' ');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '#', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 1, 1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        java.lang.String str19 = nextDate3.run(0, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) 'a', 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (-1), 10);
        java.lang.String str19 = nextDate3.run(100, (int) (byte) 1, (int) (byte) 1);
        java.lang.String str23 = nextDate3.run((int) (short) 1, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 10, (int) '#');
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 100, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 0, 100);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (short) 1, (int) (byte) -1);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str11 = nextDate3.run(1, 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(10, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 10, (int) (short) -1);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 10, 10);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 100, 1, 1);
        java.lang.String str31 = nextDate3.run((int) (byte) -1, 100, (int) '#');
        java.lang.Class<?> wildcardClass32 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 100, 0);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) -1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '4', (int) (byte) 100);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, (int) (short) -1);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) -1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) ' ', (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (short) 0, (int) (byte) 10);
        java.lang.String str19 = nextDate3.run((int) (short) 100, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) 100, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) ' ', (int) (short) 10);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (-1), (int) (byte) 100);
        java.lang.String str19 = nextDate3.run((int) '#', (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 10, 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 10, (int) (byte) 10);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(1, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 100, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) 10, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) '#', (int) (byte) 10, 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (-1), (int) '4');
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 10, 1);
        java.lang.String str11 = nextDate3.run((int) '4', 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 10, (int) (byte) 1);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 1, (int) '4');
        java.lang.String str7 = nextDate3.run(1, (int) ' ', (-1));
        java.lang.String str11 = nextDate3.run(1, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(10, (int) 'a', (int) (short) 10);
        java.lang.String str11 = nextDate3.run(100, (int) (short) 100, (-1));
        java.lang.String str15 = nextDate3.run(1, 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 1, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 10, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) ' ', (int) '#');
        java.lang.String str11 = nextDate3.run(100, 10, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 100, (int) '4');
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 100, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 1, (-1));
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '4', (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 1, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) '4', 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) '#');
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(10, 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (int) (short) 1, (int) (short) -1);
        java.lang.String str19 = nextDate3.run((int) '#', (int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) 'a', (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) 'a', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run(10, (int) ' ', (int) (byte) -1);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, (int) (short) 100, (int) (short) 100);
        java.lang.String str27 = nextDate3.run((int) (short) -1, (int) '#', 1);
        java.lang.String str31 = nextDate3.run((int) (short) 1, (-1), (int) (short) -1);
        java.lang.String str35 = nextDate3.run(10, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "invalid Input Date" + "'", str35, "invalid Input Date");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (-1), 0);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) ' ', 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 10, (int) (short) -1);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) (short) 1);
        java.lang.String str11 = nextDate3.run(1, (int) (byte) 10, (int) (byte) -1);
        java.lang.String str15 = nextDate3.run(0, (int) '4', (int) (byte) 10);
        java.lang.String str19 = nextDate3.run(100, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 100, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (-1), 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) ' ', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run(0, 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 0, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (short) 10, (int) (short) 100);
        java.lang.String str15 = nextDate3.run(100, (int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 100, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((-1), (int) 'a', (int) (short) 1);
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) (byte) 10, (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 10, 1);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '4', (int) (byte) 1);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) 10, (int) (short) 0);
        java.lang.String str15 = nextDate3.run(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str19 = nextDate3.run((int) (short) 1, (int) (short) 1, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 0, 10);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 0, (int) '#');
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) 'a', (int) (byte) 1);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 100, 1, 1);
        java.lang.String str31 = nextDate3.run(0, (int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass32 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, (-1));
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 100, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (short) 1, 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((-1), 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, 10);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) 'a', 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((int) (byte) 0, 0, 10);
        java.lang.String str23 = nextDate3.run((int) (short) 0, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str27 = nextDate3.run((-1), (int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) 'a', (int) ' ', (int) (byte) 1);
        java.lang.String str23 = nextDate3.run((int) '#', (int) '4', (int) (short) 0);
        java.lang.String str27 = nextDate3.run((int) '4', (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 1, (int) (short) 0);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (-1), 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 1, (int) '4');
        java.lang.String str7 = nextDate3.run(1, (int) ' ', (-1));
        java.lang.String str11 = nextDate3.run((int) (short) 0, (-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((int) (byte) 0, 0, 10);
        java.lang.String str23 = nextDate3.run((int) (short) 0, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 0, (int) '#');
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run((int) (byte) 10, (int) '4', (int) (short) 10);
        java.lang.String str27 = nextDate3.run((int) '#', 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '#', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (-1), 0);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, 10, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 1, 1);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (-1), (int) '#');
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (short) 100);
        java.lang.String str23 = nextDate3.run((int) (short) 1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) 'a', 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) 'a', (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (-1), (int) (short) 100);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) ' ', 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) 'a', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) -1, (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 100, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 0, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) '4');
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 1, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) '4', (int) (short) 0, 100);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) '4');
        java.lang.String str11 = nextDate3.run(0, 100, (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 100, 100);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, (int) (short) -1);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) -1, (-1));
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) -1, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (short) 10, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) ' ', 0);
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 10, 100);
        java.lang.String str7 = nextDate3.run(100, 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 1, 10);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (-1), 1);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) -1, (-1));
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(100, 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, 0);
        java.lang.String str11 = nextDate3.run((int) 'a', 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((-1), (-1), 0);
        java.lang.String str27 = nextDate3.run(100, (int) (byte) 10, (int) '#');
        java.lang.String str31 = nextDate3.run((int) (short) 1, (int) (byte) 0, (int) '4');
        java.lang.String str35 = nextDate3.run(100, (int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "invalid Input Date" + "'", str35, "invalid Input Date");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 100, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (short) 1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) 'a', (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 10, (-1), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) -1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run((int) (byte) 10, (int) '4', (int) (short) 10);
        java.lang.String str27 = nextDate3.run((int) (short) 10, 0, (int) (byte) -1);
        java.lang.String str31 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 10, (int) 'a');
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(10, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) -1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) 'a', (int) '#');
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) ' ', (int) (short) 0);
        java.lang.String str19 = nextDate3.run(10, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, (-1), (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (short) 10, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) '#', (int) 'a', 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (-1), (int) '4');
        java.lang.String str11 = nextDate3.run((int) '4', (int) (short) 100, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) '4', (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) -1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (short) 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) ' ', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) 'a', (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (-1), 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) ' ');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 0, 100);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 10);
        java.lang.String str19 = nextDate3.run((int) (short) 10, (int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '#');
        java.lang.String str7 = nextDate3.run(100, (int) ' ', (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 10, (int) (short) 100);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(100, (int) ' ', (int) ' ');
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 0, 0);
        java.lang.String str19 = nextDate3.run((int) (short) 100, 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) '4');
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) '#', (int) '4');
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 10, (int) (byte) 100);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 1, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 10, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 1, 1, (int) '4');
        java.lang.String str11 = nextDate3.run((int) ' ', 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 10, (-1));
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) '#', (int) '#');
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 100, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 100, (int) (short) 1);
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (short) 10, (int) (byte) 100);
        java.lang.String str19 = nextDate3.run(0, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) ' ', (int) (short) 0);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '#', (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) '#', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) 10, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) 10, 10);
        java.lang.String str15 = nextDate3.run(0, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) -1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((-1), 0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (-1), (-1));
        java.lang.String str7 = nextDate3.run((int) (short) -1, 0, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, 1, (int) '4');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '#', 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (-1), (int) ' ');
        java.lang.String str11 = nextDate3.run((int) '#', 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, 0);
        java.lang.String str7 = nextDate3.run(100, (int) (short) -1, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) -1, 100);
        java.lang.String str15 = nextDate3.run((int) (short) -1, 0, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) (short) 1, (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) ' ', (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) 10, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (short) 10, 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (-1), (int) (short) 1);
        java.lang.String str11 = nextDate3.run(100, (int) (short) 100, (int) (short) 100);
        java.lang.String str15 = nextDate3.run(100, (int) (short) 100, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) '4', 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((-1), (int) (short) -1, 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, (int) ' ', (int) ' ');
        java.lang.String str23 = nextDate3.run((int) (byte) 0, (int) (short) 10, (int) (short) 10);
        java.lang.String str27 = nextDate3.run((int) '#', 10, (int) (byte) -1);
        java.lang.String str31 = nextDate3.run((int) (byte) 10, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass32 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 0, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 10, (int) (short) 1);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, (int) (short) 1);
        java.lang.String str11 = nextDate3.run(10, (int) (short) -1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (-1));
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(100, (int) ' ', (int) ' ');
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 0, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 1, 0);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 1, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 1, (int) 'a');
        java.lang.String str7 = nextDate3.run(100, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 0, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) -1, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, 0, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (short) 10, (int) '4');
        java.lang.String str19 = nextDate3.run((int) '#', (int) (short) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 10, (int) (byte) 0);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) 'a', (int) (byte) -1);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, 100);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 10, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(100, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) '4', (int) (short) -1);
        java.lang.String str19 = nextDate3.run((int) (byte) 0, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 100, (int) ' ');
        java.lang.String str7 = nextDate3.run(10, (int) '4', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, (int) (short) 100);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, 1);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '#', 1);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) 10, 0);
        java.lang.String str7 = nextDate3.run((-1), 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 10, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(10, (int) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) 'a', (int) ' ', 100);
        java.lang.String str23 = nextDate3.run((int) 'a', (int) (byte) 0, (int) (short) 1);
        java.lang.String str27 = nextDate3.run((-1), (-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 10, (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, 1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) '#', 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) ' ', (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '4', (int) (short) 0);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (-1));
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 1, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (byte) 1, 100);
        java.lang.String str15 = nextDate3.run((-1), (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) '#', 0, 0);
        java.lang.String str19 = nextDate3.run((int) (short) 1, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 0, 0);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) '4');
        java.lang.String str11 = nextDate3.run(0, 100, (int) (short) 10);
        java.lang.String str15 = nextDate3.run((-1), (int) (byte) 10, (int) (byte) 10);
        java.lang.String str19 = nextDate3.run((int) (short) 0, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 10, (-1));
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) '#', (int) '#');
        java.lang.String str7 = nextDate3.run(0, 0, (int) '4');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) -1, (int) (short) 10);
        java.lang.String str11 = nextDate3.run(1, 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 1, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 10, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (short) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) (byte) 0);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '4', (int) (short) 100);
        java.lang.String str7 = nextDate3.run(0, 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 100, 1);
        java.lang.String str7 = nextDate3.run(1, (int) '4', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) '4', (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) '4');
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 10, 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 0, (int) (short) -1);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(100, (int) '#', (int) (byte) -1);
        java.lang.String str15 = nextDate3.run((-1), (-1), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, 1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 1, (int) 'a');
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '4', (int) ' ');
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) -1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) '4', 0, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '#', (int) (short) -1);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, 100);
    }
}

