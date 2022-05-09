package first;
import java.sql.*;

public class StudImpl implements StudInterface {
    @Override
    public void save(Student st)
    {
    ////TODO Auto-generate method stub

    }
    @Override
    public void update(Student st)
    {
    //TODO Auto-generate method stub
    String sql = " ";
    String name = st.getName();
    int id =st.getId();
    sql="update student set name='"+name+"'where id="+id;
    try {
        Class.forName("org.postgresql.Driver");
 System.out.println("Driver updated");
 
 Connection conn;
 conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test3","postgres","rut");
 System.out.println("Connection done");
 Statement stmt;
 stmt=conn.createStatement();
//  String sql;
//  sql="insert into student values(544,'pitnew')";
stmt.executeUpdate(sql);

 System.out.println("record updated");
 conn.close();
    } catch (Exception e)
     {
        //TODO: handle exception
    }
 }
 @Override
 public void delete(Student st)
 {
 ////TODO Auto-generate method stub

 }
 @Override
 public Student getStud(int id)
 {
 ////TODO Auto-generate method stub
  return null;
 }

    
}
