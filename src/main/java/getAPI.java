import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;

public class getAPI {

    static int get(String uri) throws Exception  {
        // Создаем http клиент
        try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            final HttpGet httpGet = new HttpGet(uri);
            httpGet.addHeader("Content-Type", "application/json");
            try (final CloseableHttpResponse response1 = httpclient.execute(httpGet)) {
                System.out.print(httpGet.getMethod()+" ");
                System.out.println(response1.getVersion()+response1.getReasonPhrase());
                System.out.println(response1.getCode() + " " + response1.getReasonPhrase());
                final HttpEntity entity1 = response1.getEntity();
                System.out.println(EntityUtils.toString(entity1));
                return response1.getCode();
            }
        }
    }
}
