package API;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import user.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Обрабатываем Json response from API using Jackson
public class ListObjectsFromJson {
    public static List<User> getList (String jsonResponse) throws IOException {
        String json = jsonResponse;
        ObjectMapper mapper = new ObjectMapper();
        List<User> userList = mapper.readValue(json,new TypeReference<List<User>>(){});

        return userList;
    }
}
