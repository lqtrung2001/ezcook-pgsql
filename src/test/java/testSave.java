
import com.ezcook.daos.*;
import com.ezcook.daos.impls.*;
import com.ezcook.entities.*;
import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.util.List;

public class testSave {
    @Test
    public void checkfindAll(){
//        IUserDao userDao=new UserDao();
//        List<User> list= userDao.findAll();

//        IFoodDao foodDao=new FoodDao();
//        List<Food> lst= foodDao.findAll();

        IUserDao userDao=new UserDao();
        List<User> userList= userDao.pagination(2,3);
        System.out.println("sdfsdfd");
    }

}