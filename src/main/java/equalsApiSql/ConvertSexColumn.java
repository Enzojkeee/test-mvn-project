package equalsApiSql;

import user.User;

import java.util.List;

public class ConvertSexColumn {

//Конвертируем bool from sex column to male/female (String) format
    public static void boolToSex(List<User> person){
        for(User us : person){
            if (us.getSex()=="false"){
                us.setSex("FEMALE");
            } else if (us.getSex()=="true"){
                us.setSex("MALE");
            }
        }
    }
}
