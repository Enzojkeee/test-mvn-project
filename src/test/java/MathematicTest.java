import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathematicTest {

    @Test
    void test() {
        int actual = Mathematic.sum(1,2,3,4,5);
        int expected = 15;
        Assertions.assertEquals(actual,expected);



    }

}