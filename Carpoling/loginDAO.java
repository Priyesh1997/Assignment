
package webapp;

/**
 *
 * @author hp
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * 
 */
public class loginDAO {
    String name;
    public boolean validate(String Email,String Password)
    {
        String url="jdbc:mysql://localhost:3306/login?user=root&password=Pallvi@1997&useSSL=false";
       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url);
            String query="select * from logindata where email=? AND password=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, Email);
            pstmt.setString(2,Password);
            
            ResultSet rs=pstmt.executeQuery();
            
            
            if(rs.next())
            {
                name=rs.getString(2);
                return true;
            }
            else
            {
                return false;
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
       
        return false;       
    }
    public String getName()
    {
        return name;
    }
    
    }