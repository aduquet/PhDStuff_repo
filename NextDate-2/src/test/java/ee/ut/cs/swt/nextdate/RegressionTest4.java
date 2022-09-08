import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '#', 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) 'a', (int) (short) 0);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 100, (int) '#');
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) '#', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) 'a', 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) 'a', 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) '4', (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 1, 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) (byte) -1, (int) '#', 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 1, 100);
        java.lang.String str7 = nextDate3.run((int) '#', (-1), (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', 10);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((-1), (int) (byte) 1, 0);
        java.lang.String str23 = nextDate3.run((int) (short) 0, (int) ' ', (int) '4');
        java.lang.String str27 = nextDate3.run((int) (short) 100, (int) (byte) -1, 0);
        java.lang.String str31 = nextDate3.run(0, (int) '#', (int) (byte) 1);
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (-1), (int) (byte) 100);
        java.lang.String str19 = nextDate3.run((int) (short) 0, (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (-1), 100);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (-1), (int) 'a');
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 10, 1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (-1), (int) (short) 0);
        java.lang.String str11 = nextDate3.run(1, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, 10);
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) 'a', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(10, (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run(100, (int) (short) 10, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) (byte) -1, (int) '4', (int) (short) 100);
        java.lang.String str23 = nextDate3.run((int) (byte) 10, (int) (byte) -1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) -1, 1);
        java.lang.String str7 = nextDate3.run(1, (int) (short) 10, (int) 'a');
        java.lang.String str11 = nextDate3.run(10, (int) (short) 10, (-1));
        java.lang.String str15 = nextDate3.run((int) '4', (int) (short) 10, (int) 'a');
        java.lang.String str19 = nextDate3.run(0, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) ' ', (int) '#');
        java.lang.String str7 = nextDate3.run((int) '#', (int) (short) -1, (int) '#');
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 10, 100);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) -1, 0);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 0, 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (-1), 100);
        java.lang.String str7 = nextDate3.run((int) ' ', 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '4', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) '#', 1, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) ' ', (int) '4');
        java.lang.String str15 = nextDate3.run(1, 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) 10, (int) '4');
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) -1, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (-1), (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '4', (int) (short) 10);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) '4', (int) '4', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, (int) (byte) 10);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 100, (int) 'a');
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 10, (int) '#');
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) '#', (int) '#');
        java.lang.String str7 = nextDate3.run(0, 0, (int) '4');
        java.lang.String str11 = nextDate3.run((int) (byte) 10, (int) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (-1));
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) -1, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, 10, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) -1, (int) 'a');
        java.lang.String str7 = nextDate3.run(100, (int) (byte) 0, (int) '#');
        java.lang.String str11 = nextDate3.run(0, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (short) 100, (int) 'a');
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) (short) 100, 0, (int) (byte) 1);
        java.lang.String str23 = nextDate3.run((-1), (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) 'a', 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 1, (int) (byte) 10);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) ' ', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (-1), (int) '#');
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '#', (int) 'a');
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 100, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 10, 10, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(10, 10, (-1));
        java.lang.String str19 = nextDate3.run((int) (short) 0, 10, (int) (byte) 1);
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 1, (int) (byte) 10);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, 100);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) ' ', (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) '#', (int) ' ', (int) 'a');
        java.lang.String str15 = nextDate3.run((int) (short) 10, 0, (int) '4');
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) -1, 0);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 0, 1);
        java.lang.String str11 = nextDate3.run((int) ' ', 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 10, 10);
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (int) (short) 1, (int) (byte) 100);
        java.lang.String str23 = nextDate3.run((int) (byte) 0, (int) (byte) 100, (int) ' ');
        java.lang.String str27 = nextDate3.run((int) (byte) 10, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '#', (int) (short) 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) 100, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 10, (int) ' ');
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(100, (int) ' ', (int) ' ');
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 0, 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) '#', (int) ' ', 100);
        java.lang.String str15 = nextDate3.run(0, 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) -1, 100);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '4', (int) (byte) 0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 10, 0);
        java.lang.String str19 = nextDate3.run(100, 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 100, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((-1), 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '#', (int) (short) 10);
        java.lang.String str7 = nextDate3.run(10, 100, (int) '#');
        java.lang.String str11 = nextDate3.run((int) (short) 0, (-1), (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) ' ', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) ' ', 10, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) 'a', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) 'a', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) '#', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) '4');
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 0, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) '#', 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 1, (-1));
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 0, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 100, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, (int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) '4');
        java.lang.String str11 = nextDate3.run(0, 100, (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) '#', (int) '#');
        java.lang.String str7 = nextDate3.run((-1), (int) (short) 100, (int) (short) 1);
        java.lang.String str11 = nextDate3.run(1, 10, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, 1);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, (int) (byte) 100);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, (int) (short) 10);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 1, 0);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) '4', (int) (byte) -1);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) -1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(0, (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 100, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((-1), 0, 0);
        java.lang.String str11 = nextDate3.run(1, (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 10, (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 1, 1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, 10, (-1));
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 10, (int) 'a');
        java.lang.String str11 = nextDate3.run((int) (short) 0, 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) ' ', (int) (byte) 10);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) ' ', 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (byte) 1);
        java.lang.String str15 = nextDate3.run(1, (int) ' ', 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, 10, (-1));
        java.lang.String str11 = nextDate3.run((int) (byte) 0, 10, (int) (short) 1);
        java.lang.String str15 = nextDate3.run(0, (-1), 10);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 0, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (-1), 1);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 100, 1);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 0, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 100, (int) '#');
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) 'a', 100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(10, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '#', (int) '4');
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 10, 0);
        java.lang.String str19 = nextDate3.run((int) '#', (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 10, 100);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run(0, (int) (short) -1, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 100, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '4', (-1), (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) '#', (int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '#', 0);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 10, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) ' ', 0, (int) 'a');
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) -1, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (-1), (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) 'a', (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) -1, 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 10, (int) '4');
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) ' ', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) -1, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 1, 100);
        java.lang.String str7 = nextDate3.run((int) ' ', (-1), (int) ' ');
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 0, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) -1, 10);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 10, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(10, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) -1, 1);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 0, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (byte) 1, (-1));
        java.lang.String str15 = nextDate3.run(0, (int) '#', (-1));
        java.lang.String str19 = nextDate3.run(0, 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 1, (-1));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 100, (int) '4');
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) -1, 10);
        java.lang.String str7 = nextDate3.run((int) ' ', 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run((int) ' ', (int) 'a', (int) '4');
        java.lang.String str23 = nextDate3.run((int) '4', (int) (short) 1, (int) ' ');
        java.lang.String str27 = nextDate3.run((int) (byte) 10, 100, (int) (short) 0);
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
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 1, (int) '#');
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 100, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) (short) 1, 100, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 100, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) -1, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 0, (int) (short) 0);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((int) (byte) 0, 0, 10);
        java.lang.String str23 = nextDate3.run((int) (short) 1, (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 10, 10, (int) '#');
        java.lang.String str19 = nextDate3.run((int) (short) 100, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) ' ', (int) (byte) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (short) -1, (-1));
        java.lang.String str15 = nextDate3.run((int) (short) 0, (int) ' ', (int) ' ');
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (int) (short) 1, (-1));
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) 10, (int) (short) -1);
        java.lang.String str27 = nextDate3.run((int) (short) 100, (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 0, (int) (short) 0);
        java.lang.String str7 = nextDate3.run(1, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) (byte) 10, (-1), (int) (short) 0);
        java.lang.String str23 = nextDate3.run((int) ' ', 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (short) 100, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 10, 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 10, (-1));
        java.lang.String str7 = nextDate3.run(10, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((-1), (int) '4', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 1, 0);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', 10);
        java.lang.String str7 = nextDate3.run((int) 'a', 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, (int) 'a');
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 10, (int) (byte) 100);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 1, (int) (byte) 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, (int) (short) 1);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 1, 1, 0);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (short) 100, 1);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) -1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) ' ', (int) (byte) 10);
        java.lang.String str15 = nextDate3.run(0, (int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) -1, 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (-1), (int) ' ');
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((-1), (-1), 0);
        java.lang.String str27 = nextDate3.run(10, 0, (int) (short) 0);
        java.lang.String str31 = nextDate3.run((int) (byte) 0, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str27 = nextDate3.run((int) (short) 0, 0, (int) (short) 0);
        java.lang.String str31 = nextDate3.run(100, (int) (byte) 10, (int) (byte) 100);
        java.lang.String str35 = nextDate3.run((int) '#', (int) ' ', (int) '#');
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
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((-1), 0, 100);
        java.lang.String str11 = nextDate3.run(1, (-1), (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) '4', (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) (short) -1, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '4', 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, (int) (byte) 10);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '4', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (-1), (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) '4', (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (-1), (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, (int) (short) 10);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 0, 1);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, (int) '4');
        java.lang.String str7 = nextDate3.run((int) '#', (int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 10, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (byte) 100, 0, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 10, (int) (short) 1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '4', 0);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 10, 10);
        java.lang.String str11 = nextDate3.run(0, (-1), (-1));
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) ' ', (int) (byte) 100);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) ' ', (int) ' ');
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, 10);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '#');
        java.lang.String str7 = nextDate3.run(100, (int) ' ', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) '#', (int) (short) 0);
        java.lang.String str15 = nextDate3.run(10, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str19 = nextDate3.run((int) (short) 10, (int) '#', (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, 10);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 0, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(1, 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run(1, (int) (short) 0, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) -1, (int) 'a');
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '4', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) ' ', (int) (short) 1);
        java.lang.String str11 = nextDate3.run(0, (int) 'a', 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) ' ', (int) '#', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, 10);
        java.lang.String str7 = nextDate3.run(0, 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) 'a', 100);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) '4', 100);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 10, (int) 'a');
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 1, 100);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 100, 1);
        java.lang.String str7 = nextDate3.run(0, 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) -1, (-1));
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (-1), 10);
        java.lang.String str7 = nextDate3.run(0, (int) (byte) 100, 100);
        java.lang.String str11 = nextDate3.run(0, (int) 'a', (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) '4', (int) (short) 1);
        java.lang.String str11 = nextDate3.run(1, (int) (byte) 10, (int) (byte) -1);
        java.lang.String str15 = nextDate3.run(0, (int) '4', (int) (byte) 10);
        java.lang.String str19 = nextDate3.run(0, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 0, (int) '#');
        java.lang.String str7 = nextDate3.run((int) '4', (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) 10, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(0, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) ' ', (int) '4');
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) -1, (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) (short) 10, 100);
        java.lang.String str19 = nextDate3.run((-1), (int) (byte) 10, (int) (short) 1);
        java.lang.String str23 = nextDate3.run((int) (short) 10, (int) '4', (int) ' ');
        java.lang.String str27 = nextDate3.run(10, (-1), 100);
        java.lang.String str31 = nextDate3.run((int) 'a', (int) (short) -1, 0);
        java.lang.String str35 = nextDate3.run((int) (byte) -1, (int) 'a', (int) (short) 100);
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
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (-1), (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) ' ', (-1), 10);
        java.lang.String str11 = nextDate3.run((int) (short) 1, 1, (int) (byte) 100);
        java.lang.String str15 = nextDate3.run((int) (short) 100, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 0, 0);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, 10, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 10, 100);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '#', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) 'a', (int) '#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (short) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (-1), (int) (byte) -1);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 10, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(0, (int) (short) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 10, (int) (short) 10);
        java.lang.String str7 = nextDate3.run(100, (int) ' ', 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 1, 10);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) -1, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, 0, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 100, (int) '#');
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, 0);
        java.lang.String str11 = nextDate3.run(1, (-1), (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 1, (-1));
        java.lang.String str7 = nextDate3.run(0, (int) '#', 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) 'a', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 1, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) 0, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 0, 1);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) -1, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str27 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 1);
        java.lang.String str31 = nextDate3.run((int) (byte) 1, 0, (int) (short) 1);
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
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) '#', 0, 0);
        java.lang.String str19 = nextDate3.run(100, (int) ' ', (int) (short) 0);
        java.lang.String str23 = nextDate3.run((int) (byte) 10, (int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '4', 100);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) 'a', (int) (short) 1);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, 10, (int) '4');
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', 10);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) -1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) 0, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 10, 1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (-1), (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 100, 10);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 1, (-1));
        java.lang.String str7 = nextDate3.run((int) ' ', (int) 'a', (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '#', 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run(0, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 0, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 1, (-1));
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (short) 100, 100);
        java.lang.String str19 = nextDate3.run((int) 'a', 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (-1), 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (-1), 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '#', (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) -1, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(10, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 100, 10);
        java.lang.String str7 = nextDate3.run((-1), 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(1, 1, (int) ' ');
        java.lang.String str15 = nextDate3.run(100, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 100, (-1));
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) 'a', 1);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) -1, 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) -1, 0);
        java.lang.String str7 = nextDate3.run(100, 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 1, (int) (short) 0);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 100, 10);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 100, (int) '#');
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (short) -1, (-1));
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 10, (int) '#');
        java.lang.String str15 = nextDate3.run(1, (int) (byte) -1, (int) (byte) 1);
        java.lang.String str19 = nextDate3.run((int) (byte) -1, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) '4', (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) ' ', (int) (byte) 1);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 1, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((-1), (int) '#', (int) '#');
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) '4', (int) (short) 1);
        java.lang.String str7 = nextDate3.run(10, (int) (byte) 0, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (-1), (int) 'a');
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (-1), (int) 'a');
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) 'a', 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 0, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 0, (int) (short) 1);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) ' ', (int) '4');
        java.lang.String str7 = nextDate3.run(0, 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run(0, 0, (int) (byte) 1);
        java.lang.String str27 = nextDate3.run((-1), (int) (short) -1, 0);
        java.lang.String str31 = nextDate3.run(10, (int) ' ', (int) (byte) 10);
        java.lang.String str35 = nextDate3.run((int) (byte) 10, 100, 0);
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
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) '#');
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) '4', (int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 1, 100);
        java.lang.String str11 = nextDate3.run(100, (-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) 'a', 1);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '4', (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 0, (int) '4');
        java.lang.String str11 = nextDate3.run((int) '4', 0, (-1));
        java.lang.String str15 = nextDate3.run((int) '4', (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 1, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 1, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 1, (int) '#');
        java.lang.String str7 = nextDate3.run(100, (int) '4', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (-1), (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 1, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '#', 0);
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (short) 1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) '#', 1);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 100, 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 100, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) '4', (int) '4', 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 10, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', 0, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (-1), 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '#');
        java.lang.String str7 = nextDate3.run(100, (int) ' ', (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 10, 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) -1, (int) 'a');
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 1, (int) (short) 100);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, 1);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) '#', 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (byte) 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 1, 0);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) 'a', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 1, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) 'a', 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) (byte) 10);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 10, 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) '4', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 0, (int) 'a', (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) 'a', 10, 1);
        java.lang.String str15 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) '4', 1);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) ' ', (int) (short) -1);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (-1), 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 0, 100);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) ' ', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '#', (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) '#', 10, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) 0, (int) ' ');
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 1, 100);
        java.lang.String str7 = nextDate3.run(100, (int) (short) -1, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(10, (int) (byte) -1, (int) '#');
        java.lang.String str15 = nextDate3.run(100, (int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 10, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 10, (int) (byte) 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (int) (short) -1, (int) ' ');
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) ' ', (int) (byte) 10, 10);
        java.lang.String str19 = nextDate3.run((int) '#', 1, 0);
        java.lang.String str23 = nextDate3.run((int) (short) -1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) (byte) 1);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 0, (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, 1);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) (byte) 10, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run(1, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str11 = nextDate3.run((-1), (int) '#', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (-1), (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (short) 100, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 0, (int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 0, (int) (short) 100);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 0, 0);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 100, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (short) 0, (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run(0, (-1), (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 10, 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) -1, (int) 'a');
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (short) 1, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 100, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '4', (int) (byte) 10);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) '4', (int) '#');
        java.lang.String str7 = nextDate3.run((int) 'a', (int) 'a', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 100, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (short) 100, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (short) -1, 100, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 0, (int) (byte) -1);
        java.lang.String str7 = nextDate3.run(10, (int) (short) 0, (int) '#');
        java.lang.String str11 = nextDate3.run((int) '#', (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 0, (int) (short) 100);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) (short) 1, (-1), (int) (byte) 100);
        java.lang.String str19 = nextDate3.run((int) (byte) 0, 0, (int) (byte) -1);
        java.lang.String str23 = nextDate3.run((int) (short) -1, 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 10, (int) 'a');
        java.lang.String str7 = nextDate3.run(0, (int) '4', (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) ' ', (int) (byte) 100);
        java.lang.String str7 = nextDate3.run(0, 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) ' ', 0);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, (int) '#');
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, 0, (int) ' ');
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 1, (-1));
        java.lang.String str15 = nextDate3.run(1, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) (short) -1, 0);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(0, 0, (int) (short) 100);
        java.lang.String str11 = nextDate3.run(1, 10, (-1));
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 10, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run(0, 100, (int) (short) 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 1, 100);
        java.lang.String str7 = nextDate3.run(0, (-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (short) 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, 100, (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) '#', (int) ' ');
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) 1, (int) '#');
        java.lang.String str11 = nextDate3.run((int) (byte) -1, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) 'a', (int) 'a');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 1, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) ' ', 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) 'a', (int) (short) 0);
        java.lang.String str7 = nextDate3.run(0, 0, 10);
        java.lang.String str11 = nextDate3.run((int) '4', 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) '4');
        java.lang.String str11 = nextDate3.run((-1), 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, 100, 10);
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run(100, 100, (int) 'a');
        java.lang.String str23 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str27 = nextDate3.run((int) ' ', (int) ' ', (int) (short) 1);
        java.lang.String str31 = nextDate3.run((int) (short) -1, (-1), (int) (byte) 0);
        java.lang.String str35 = nextDate3.run((int) '#', 0, (int) (short) 100);
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
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) 10, (int) '4');
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) 'a', (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (short) 10);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (short) 1, (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) (short) 10, 100, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (short) 1, 1);
        java.lang.String str7 = nextDate3.run(0, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) '#', 100, 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (short) 1);
        java.lang.String str19 = nextDate3.run((int) (byte) 10, (-1), (int) (short) 0);
        java.lang.String str23 = nextDate3.run(1, 10, (int) ' ');
        java.lang.String str27 = nextDate3.run((-1), 0, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '4', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, (int) 'a');
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 1, 0);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 100, 1, 1);
        java.lang.String str31 = nextDate3.run((int) (short) 1, 1, (-1));
        java.lang.String str35 = nextDate3.run((int) (byte) 1, (int) (short) -1, (int) (short) 100);
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
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', 0, 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, 1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) ' ', (int) '4');
        java.lang.String str7 = nextDate3.run((int) '4', 100, (int) '#');
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, 0, (int) (byte) 0);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) ' ', (int) '4');
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) (byte) -1, 1);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (byte) -1, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (-1), (int) ' ');
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (short) 0, 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 0, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (short) -1, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 10, 100);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, 10, (int) (byte) 0);
        java.lang.String str19 = nextDate3.run((int) (byte) 100, (int) (short) -1, (int) ' ');
        java.lang.String str23 = nextDate3.run((int) (short) 10, (int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) -1, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((-1), (int) 'a', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) (byte) 0, (int) 'a');
        java.lang.String str15 = nextDate3.run(1, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (-1), (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((-1), 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (short) 10, 0);
        java.lang.String str7 = nextDate3.run((int) (short) 0, 0, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) (short) 1, (int) ' ');
        java.lang.String str15 = nextDate3.run((int) (byte) 0, (int) (byte) 1, 1);
        java.lang.String str19 = nextDate3.run((int) (byte) 10, 10, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, (int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 1, 0);
        java.lang.String str7 = nextDate3.run((int) 'a', 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (short) 1, (int) '#');
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (short) -1, 1);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 10, (int) 'a');
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run(100, 0, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 10, (int) (short) 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) -1, (int) (short) 100);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) ' ', 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((-1), (int) (byte) 0, 1);
        java.lang.String str15 = nextDate3.run((int) (byte) 10, (-1), 10);
        java.lang.String str19 = nextDate3.run(10, (int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass20 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) '4', 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) 'a', (-1));
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 0, (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 0, 100);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (short) 0, (int) '4');
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((int) (short) 100, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) '#', (-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(1, 100, (int) (short) 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) (short) -1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run(0, (int) ' ', (int) (byte) 10);
        java.lang.String str15 = nextDate3.run(0, (int) ' ', (int) (short) -1);
        java.lang.String str19 = nextDate3.run((int) (byte) 1, 1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) '#', 100);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 100, 0);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) -1, 0);
        java.lang.String str7 = nextDate3.run((int) ' ', 10, (int) (short) 1);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) (short) 10, (int) 'a');
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) '#', (int) (short) 10);
        java.lang.String str19 = nextDate3.run((int) (byte) -1, (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, 100, 100);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) (byte) 10, (int) 'a');
        java.lang.String str15 = nextDate3.run((int) ' ', (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 100, (int) ' ');
        java.lang.String str7 = nextDate3.run(100, 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (short) -1, 1);
        java.lang.String str7 = nextDate3.run(0, 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) '#', 100);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) ' ', 10);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, 0, (int) (byte) 100);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, (int) '#');
        java.lang.String str7 = nextDate3.run((int) '4', (int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) '#', (int) (byte) 0);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) (byte) -1, 10);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 100, (int) ' ');
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 1, 10);
        java.lang.String str7 = nextDate3.run(1, 10, (int) (byte) 100);
        java.lang.String str11 = nextDate3.run((int) (short) 1, (int) 'a', (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (short) 10, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) 1, (int) (short) 1);
        java.lang.String str7 = nextDate3.run((int) '#', 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) ' ', 1);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, 1);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) -1, (int) (byte) -1);
        java.lang.String str11 = nextDate3.run((int) (byte) -1, (int) (byte) 10, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, 0, (int) (byte) 10);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) ' ', (int) (byte) 0, (int) (short) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (short) 100, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 100, (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, 100, (int) (byte) 100);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (int) (short) 100);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) (short) -1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run(1, (int) (byte) -1, (int) 'a');
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 100, (int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '4', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) 10, 0, 10);
        java.lang.String str11 = nextDate3.run((int) (short) 0, (int) (short) -1, (int) (byte) 10);
        java.lang.String str15 = nextDate3.run((int) (short) 1, 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, 0, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 10, 0, 0);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) ' ', (int) '4');
        java.lang.String str7 = nextDate3.run((int) '#', 100, (int) (short) 0);
        java.lang.String str11 = nextDate3.run(10, 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run(0, (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '4', (int) ' ');
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (-1), (int) ' ');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 1, (int) 'a', 100);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '#', (int) '4');
        java.lang.String str7 = nextDate3.run((int) (short) 1, (int) 'a', (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) 0, 1);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, (int) (byte) 1, (int) (short) -1);
        java.lang.String str11 = nextDate3.run((int) (short) 10, (int) (byte) -1, 0);
        java.lang.String str15 = nextDate3.run((int) 'a', (int) 'a', 0);
        java.lang.Class<?> wildcardClass16 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, (int) (byte) 100);
        java.lang.String str7 = nextDate3.run((int) (short) 100, 100, 0);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) 'a', (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) 100, (int) '#', (int) (short) 100);
        java.lang.String str11 = nextDate3.run((int) (byte) 100, (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) 'a', (int) '4');
        java.lang.String str7 = nextDate3.run(100, 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', 1, 10);
        java.lang.String str7 = nextDate3.run((int) '4', (int) 'a', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 10, 100);
        java.lang.String str7 = nextDate3.run(0, 10, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) 'a', (int) (short) 10);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) '#', (int) (byte) -1);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) ' ', (int) (byte) 0);
        java.lang.String str11 = nextDate3.run((int) '4', (int) 'a', (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '#', (int) (short) 1, 1);
        java.lang.String str7 = nextDate3.run((int) '4', (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 0, (int) '#', 10);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 0, (-1));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) '#', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run(10, (int) (byte) 100, (int) (byte) 1);
        java.lang.String str11 = nextDate3.run(10, (int) (short) 100, (int) (short) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, (int) 'a', (-1));
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (int) '#', (int) (byte) 10);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 100, 1);
        java.lang.String str15 = nextDate3.run((int) '#', (int) (byte) 0, (int) 'a');
        java.lang.String str19 = nextDate3.run((int) '4', (int) ' ', (int) (short) -1);
        java.lang.String str23 = nextDate3.run((-1), (int) '4', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 10, (int) (byte) 10, 1);
        java.lang.String str7 = nextDate3.run(1, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 100, (int) (byte) -1, (int) ' ');
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) '#', 0);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, (int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, (int) (short) 10, (int) ' ');
        java.lang.String str7 = nextDate3.run((int) (byte) 0, (int) (byte) 1, (int) (byte) 0);
        java.lang.String str11 = nextDate3.run(0, (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) -1, 100, (int) (short) -1);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(0, (int) (byte) 10, 10);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(10, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass4 = nextDate3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) 100, 0, 0);
        java.lang.String str7 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) (byte) 10);
        java.lang.String str11 = nextDate3.run(0, (int) (byte) 1, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run(100, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 0, (int) (short) -1);
        java.lang.String str7 = nextDate3.run((int) (short) -1, 10, 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), 0, (int) '4');
        java.lang.String str7 = nextDate3.run(0, (int) '#', 0);
        java.lang.String str11 = nextDate3.run((int) (byte) 1, (int) (byte) 10, (int) (short) 0);
        java.lang.String str15 = nextDate3.run(0, (int) (short) 0, (int) (short) 100);
        java.lang.String str19 = nextDate3.run((int) (short) 10, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, (int) '4', (int) (short) 100);
        java.lang.String str7 = nextDate3.run((int) (byte) -1, (-1), (int) '4');
        java.lang.String str11 = nextDate3.run(100, (int) (short) 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run((int) (byte) 1, (int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 0, 1, (int) (byte) 1);
        java.lang.String str7 = nextDate3.run((int) (short) 10, (int) '#', (int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 0, (int) (short) 100);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) 'a', (int) (short) 1, 0);
        java.lang.String str7 = nextDate3.run(0, 0, 0);
        java.lang.String str11 = nextDate3.run((int) ' ', (int) 'a', (int) 'a');
        java.lang.String str15 = nextDate3.run((-1), (int) ' ', (int) (byte) -1);
        java.lang.String str19 = nextDate3.run(1, (int) (byte) 100, 0);
        java.lang.String str23 = nextDate3.run((int) '4', (-1), (int) (short) 1);
        java.lang.String str27 = nextDate3.run((int) (short) 1, (int) '#', 0);
        java.lang.String str31 = nextDate3.run((int) '4', 0, 100);
        java.lang.String str35 = nextDate3.run((int) (byte) 1, (int) (byte) 100, (int) ' ');
        java.lang.String str39 = nextDate3.run((int) (short) 1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "invalid Input Date" + "'", str23, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "invalid Input Date" + "'", str27, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "invalid Input Date" + "'", str31, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "invalid Input Date" + "'", str35, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "invalid Input Date" + "'", str39, "invalid Input Date");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, (-1));
        java.lang.String str7 = nextDate3.run((-1), (int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = nextDate3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((-1), (int) (byte) -1, 0);
        java.lang.String str7 = nextDate3.run((int) ' ', (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, 10, (int) '4');
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate(100, (int) '#', 0);
        java.lang.String str7 = nextDate3.run(10, (int) (byte) 0, (int) (short) 0);
        java.lang.String str11 = nextDate3.run((int) (short) -1, (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) '4', (int) (short) 100, 0);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 1, (int) '4', (int) (byte) 0);
        java.lang.String str7 = nextDate3.run((int) 'a', (int) (short) 1, 10);
        java.lang.String str11 = nextDate3.run((int) 'a', (int) ' ', (int) (short) 10);
        java.lang.String str15 = nextDate3.run((int) ' ', 1, (int) '#');
        java.lang.String str19 = nextDate3.run((int) (short) -1, (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "invalid Input Date" + "'", str19, "invalid Input Date");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (byte) 10, (int) (byte) 0, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (byte) 100, 10, 0);
        java.lang.String str11 = nextDate3.run((int) (short) 100, 0, (int) (byte) 0);
        java.lang.String str15 = nextDate3.run(0, (int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid Input Date" + "'", str11, "invalid Input Date");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid Input Date" + "'", str15, "invalid Input Date");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        ee.ut.cs.swt.nextdate.NextDate nextDate3 = new ee.ut.cs.swt.nextdate.NextDate((int) (short) -1, 100, (int) (byte) 10);
        java.lang.String str7 = nextDate3.run((int) (short) -1, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid Input Date" + "'", str7, "invalid Input Date");
    }
}

