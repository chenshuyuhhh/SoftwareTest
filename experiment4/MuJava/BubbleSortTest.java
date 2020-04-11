import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


public class BubbleSortTest {

    private int[] expected;
    private int[] actual;
    private int[] wrong;


    @Before
    public void before() {
        int length = 10;
        int max=100,min = 0;
        // generate the actual array
        actual = new int[length];
        expected = new int[length];
        wrong = new int[length];
        for (int i = 0; i < length; ++i) {
            int num = (int) (Math.random() * (max - min + min));
            actual[i] = num;
            expected[i] = num;
            wrong[i] = num;
        }
        Arrays.sort(expected);
        Arrays.sort(wrong);
        for (int i = 1; i < length; ++i) {
            if(wrong[i-1]!=wrong[i]){
                int temp = wrong[i-1];
                wrong[i-1] = wrong[i];
                wrong[i] = temp;
                break;
            }
        }
    }


    @After
    public void after() {
    }


    @Test
    public void bubbleSortTest() {
        Assert.assertArrayEquals(this.expected,BubbleSort.BubbleSort(this.actual));
        Assert.assertNotSame(Arrays.toString(this.wrong), Arrays.toString(BubbleSort.BubbleSort(this.actual)));
    }
}

