import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class getApiTest {
    @Test
    public  void test() throws Exception {
        // Создаем http клиент
        try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            final HttpGet httpGet = new HttpGet("http://77.50.236.203:4880/users");
            try (final CloseableHttpResponse response1 = httpclient.execute(httpGet)) {
                System.out.print(httpGet.getMethod()+" ");
                System.out.println(response1.getVersion()+response1.getReasonPhrase());
                System.out.println(response1.getCode() + " " + response1.getReasonPhrase());
                final HttpEntity entity1 = response1.getEntity();
                Assertions.assertEquals(200, response1.getCode());
                System.out.println(EntityUtils.toString(entity1));
            }
        }
    }
    }