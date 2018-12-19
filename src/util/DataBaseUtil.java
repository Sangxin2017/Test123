package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseUtil {


    public static class CONNECTION_HOLDER{
        public static Connection CONNECTION  =  null;
    }

    public void initDatabase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            CONNECTION_HOLDER.CONNECTION = DriverManager.getConnection("jdbc:mysql://120.79.0.116:3306/studentmanager","dog","kejiyueyueping2017");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询数据
     * @param sql 查询语句
     */
    public static ResultSet SELECT(String sql){
        ResultSet resultSet = null;
        try {
           resultSet  = CONNECTION_HOLDER.CONNECTION.prepareStatement(sql).executeQuery();
            if(resultSet.next()){
                return resultSet;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
