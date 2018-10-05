package week3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Week3Test {
    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void maxTest() {
        assertEquals(9, Week3.max(6, 9));
    }
    @Test
    public void maxTest1() {
        assertEquals(8, Week3.max(4, 8));
    }
    @Test
    public void maxTest2() {
        assertEquals(15, Week3.max(15, 9));
    }
    @Test
    public void maxTest3() {
        assertEquals(4, Week3.max(4, 0));
    }
    @Test
    public void maxTest4() {
        assertEquals(22, Week3.max(17, 22));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void minOfArrayTest() {
        int[] array1 = {1, 2, 3, 4, 5};
        assertEquals(1, Week3.minOfArray(array1));
    }
    @Test
    public void minOfArrayTest1() {
        int[] array2 = {6, 7, 8, 9, 10};
        assertEquals(6, Week3.minOfArray(array2));
    }
    @Test
    public void minOfArrayTest2() {
        int[] array3 = {11, 12, 13, 14, 15};
        assertEquals(11, Week3.minOfArray(array3));
    }
    @Test
    public void minOfArrayTest3() {
        int[] array4 = {16, 17, 18, 19, 20};
        assertEquals(16, Week3.minOfArray(array4));
    }
    @Test
    public void minOfArrayTest4(){
        int[] array5={21,22,23,24,25};
        assertEquals(21,Week3.minOfArray(array5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void calculateBMI() {
        assertEquals("Binh thuong", Week3.calculateBMI(54, 1.68));
    }
    @Test
    public void calculateBMI1() {
        assertEquals("Thieu can", Week3.calculateBMI(54, 2.5));
    }
    @Test
    public void calculateBMI2() {
        assertEquals("Binh thuong", Week3.calculateBMI(58, 1.70));
    }
    @Test
    public void calculateBMI3() {
        assertEquals("Beo phi", Week3.calculateBMI(90, 1.50));
    }
    @Test
    public void calculateBMI4(){
     assertEquals("Thua can",Week3.calculateBMI(70,1.70));
    }
}
