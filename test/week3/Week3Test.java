package week3;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Week3Test {
    // TODO: Viết 5 testcase cho phương thức max()
    public void Tim_so_lon_nhat(){
        assertEquals(9,Week3.max(6,9));
        assertEquals(8,Week3.max(4,8));
        assertEquals(15,Week3.max(15,9));
        assertEquals(4,Week3.max(4,0));
        assertEquals(22,Week3.max(17,22));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void minOfArrayTest(){
        int[] array1={1,2,3,4,5};
        assertEquals(1,Week3.minOfArray(array1));
        int[] array2={6,7,8,9,10};
        assertEquals(6,Week3.minOfArray(array1));
        int[] array3={11,12,13,14,15};
        assertEquals(11,Week3.minOfArray(array1));
        int[] array4={16,17,18,19,20};
        assertEquals(16,Week3.minOfArray(array1));
        int[] array5={21,22,23,24,25};
        assertEquals(21,Week3.minOfArray(array1));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void calculateBMI(){
     assertEquals("Binh thuong",Week3.calculateBMI(54,1.68));
     assertEquals("Thieu can",Week3.calculateBMI(54,2.5));
     assertEquals("Binh thuong",Week3.calculateBMI(58,1.70));
     assertEquals("Beo phi",Week3.calculateBMI(90,1.50));
     assertEquals("Thua can",Week3.calculateBMI(70,1.70));
    }
}
