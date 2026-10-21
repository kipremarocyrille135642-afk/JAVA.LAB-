
import java.sql.*;

class Display
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Test01", "root", "");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from stud");

            while(rs.next())
            {
                System.out.println(rs.getInt("rno") + " " +
                    rs.getString("name"));
            }

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
