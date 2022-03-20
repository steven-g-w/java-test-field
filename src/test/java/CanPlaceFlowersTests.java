import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CanPlaceFlowersTests {

    @Test
    public void test() {
        int[] bed = new int[] {1,0,0,0,1};
        boolean result = new CanPlaceFlowers().canPlaceFlowers(bed, 1);
        Assertions.assertEquals(result, true);
    }

    @Test
    public void test2() {
        int[] bed = new int[] {1,0,0,0,1};
        boolean result = new CanPlaceFlowers().canPlaceFlowers(bed, 2);
        Assertions.assertEquals(result, false);
    }
}