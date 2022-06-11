import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class getApiTest {
    @Test
    void test() throws Exception {
       int a = getAPI.get("http://77.50.236.203:4880/users");
        Assertions.assertEquals(200, a);
    }
    }