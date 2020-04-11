import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class BackPackTest {

    int m; // capacity
    int n; // number

    int w[]; // weight
    int p[]; // value

    int expected[][];
    int wrong[][];

    @Before
    public void before() {
        m = 10;
        n = 3;
        w = new int[]{3, 4, 5}; // weight
        p = new int[]{4, 5, 6}; // value
        expected = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4},{0, 0, 0, 4, 5, 5, 5, 9, 9, 9, 9},{0, 0, 0, 4, 5, 6, 6, 9, 10, 11, 11}};
        wrong = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{0, 0, 0, 3, 4, 4, 4, 4, 4, 4, 4},{0, 0, 0, 3, 5, 5, 5, 9, 9, 9, 9},{0, 0, 0, 3, 5, 6, 6, 9, 10, 11, 11}};
    }


    @After
    public void after() {
    }

    private String toString(int array[][]){
        StringBuilder sb = new StringBuilder();
        for (int[] line:array){
            sb.append(Arrays.toString(line));
        }
        return sb.toString();
    }

    @Test
    public void bubbleSortTest() {
        String actualS = toString(BackPack.BackPack_Solution(m,n,w,p));
        Assert.assertEquals(toString(this.expected), actualS);
        Assert.assertNotSame(toString(this.wrong), actualS);
    }
}
