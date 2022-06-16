import user.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
      sqlQuery.getColumnName("person");
        List<User> a = sqlQuery.sqlQuery("SELECT * FROM person");
        System.out.println(a);
//        for (User us :a){
//            System.out.println(us);
//        }
        sqlQuery.getTables();


    }
}
