package JDBC;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStmtLab {

    private static final String URL="jdbc:mysql://localhost:3306/achs";
    private static final String USER = "root";
    private static final String PASSWORD ="#@sandesh1721@#";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

       // Statement stmt = connection.createStatement();

        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO students(rollNo,name,level,major,division) VALUES(?,?,?,?,?)");

        pstmt.setInt(1, 1);
        pstmt.setString(2, "Bibash kadel");
        pstmt.setString(3, "Bachelor");
        pstmt.setString(4, "BCA");
        pstmt.setString(5, "distinction");

        int rowAffected = pstmt.executeUpdate();

        if(rowAffected>0){
            System.out.println("Inserted data successfully");
        }
        else{
            System.out.println("failure");
        }

        pstmt.close();

        
    }
    
}
