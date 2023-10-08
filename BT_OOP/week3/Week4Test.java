import org.junit.Assert;
import org.junit.Test;

//import .Week4;
public class Week4Test {
    @Test
    public void testMax2Int1() {
        int a = 5;
        int b = 10;

        int expected = 10;
        Assert.assertEquals(expected, Week4.max2Int(a, b));
    }

    @Test
    public void testMax2Int2() {
        int a = 5;
        int b = 23;


        int expected = 23;
        Assert.assertEquals(expected, Week4.max2Int(a, b));
    }

    @Test
    public void testMax2Int3() {
        int a = 30;
        int b = 42;


        int expected = 42;
        Assert.assertEquals(expected, Week4.max2Int(a, b));
    }

    @Test
    public void testMax2Int4() {
        int a = 7;
        int b = 9;


        int expected = 9;
        Assert.assertEquals(expected, Week4.max2Int(a, b));
    }

    @Test
    public void testMax2Int5() {
        int a = 50;
        int b = 179;


        int expected = 179;
        Assert.assertEquals(expected, Week4.max2Int(a, b));
    }

    public void testMinArray1() {
        int[] array = {5, 10, 3, 7, 2};

        int expected = 2;
        Assert.assertEquals(expected, Week4.minArray(array));
    }

    @Test
    public void testMinArray2() {
        int[] array = {15, 8, 25, 12};

        int expected = 8;
        Assert.assertEquals(expected, Week4.minArray(array));
    }

    @Test
    public void testMinArray3() {
        int[] array = {-5, -2, -8, -1};

        int expected = -8;
        Assert.assertEquals(expected, Week4.minArray(array));
    }

    @Test
    public void testMinArray4() {
        int[] array = {100};

        int expected = 100;
        Assert.assertEquals(expected, Week4.minArray(array));
    }

    @Test
    public void testMinArray5() {
        int[] array = {0, 0, 0};

        int expected = 0;
        Assert.assertEquals(expected, Week4.minArray(array));
    }

    @Test
    public void testCalculateBMI1() {
        double weight = 60;
        double height = 1.70;

        String expected = "Bình thường";
        Assert.assertEquals(expected, Week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI2() {
        double weight = 45;
        double height = 1.60;

        String expected = "Thiếu cân";
        Assert.assertEquals(expected, Week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI3() {
        double weight = 75;
        double height = 1.75;

        String expected = "Thừa cân";
        Assert.assertEquals(expected, Week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI4() {
        double weight = 90;
        double height = 1.80;

        String expected = "Béo phì";
        Assert.assertEquals(expected, Week4.calculateBMI(weight, height));
    }

    @Test
    public void testCalculateBMI5() {
        double weight = 70;
        double height = 1.65;

        String expected = "Bình thường";
        Assert.assertEquals(expected, Week4.calculateBMI(weight, height));
    }
} 