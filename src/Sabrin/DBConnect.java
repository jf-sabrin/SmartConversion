package Sabrin;
import java.sql.*;
import javax.swing.*;
import java.util.regex.*;

public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private int flag = 0;

    public DBConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void RegisterInsert(String queryInsert) {
        try {
            st.executeUpdate(queryInsert);
            JOptionPane.showMessageDialog(null, "Congo!!!.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "try again ");
        }
    }
    public void Login(String queryLogin, String username, String password) {
        try {
            rs = st.executeQuery(queryLogin);

            while (rs.next()){

                String tableUserName = rs.getString(2);
                String tablePass = rs.getString(4);

                if (username.equals(tableUserName) && password.equals(tablePass)){
                    JOptionPane.showMessageDialog(null,"Welldome !! .");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                JOptionPane.showMessageDialog(null,"Try again !! ");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }
}