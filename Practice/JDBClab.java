import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBClab {


    private static final String URL="jdbc:mysql://localhost:3306/achs";
    private static final String USER = "root";
    private static final String PASSWORD ="#@sandesh1721@#";
    public static void main(String[] args) throws SQLException{

        //connection established
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

        //statememt established
        Statement stmt = connection.createStatement();


       // insert query
        // String insertQuery = "INSERT INTO students(name, level, major, division) VALUES('Gokarna','Bachelor','BCA','1st'),('Ram','+2','Managemet','1st')";
        // int rowInserted = stmt.executeUpdate(insertQuery);

        // if(rowInserted>0){
        //     System.out.println("Data inserted into database");
        // }else{
        //     System.out.println("Data inserted error");
        // }

        //row deleted
        // String deleteQuery = "DELETE FROM students where rollno IN(4,5,6)";
        // int rowDeleted = stmt.executeUpdate(deleteQuery);
        // if(rowDeleted>0){
        //     System.out.println("Data deleted into database");
        // }else{
        //     System.out.println("Data deleted error");
        // }


        //select query
        
        //select query
        ResultSet rs = stmt.executeQuery("SELECT name,rollNo from students where division = '1st' & major = 'BCA'");

        while (rs.next()) {
            String roll_No = rs.getString("rollNo");
            String name = rs.getString("name");
            //String level = rs.getString("level");
            //String major = rs.getString("major");
            System.out.println( "Roll no: " + roll_No + '\n' +  "Username: " +name + '\n');
            
        }
        rs.close();
        stmt.close();
        connection.close();
    }
    
}
