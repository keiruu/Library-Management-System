import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;

public class dbConnection {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try{
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");       
            Component rootPane = null;
            System.out.println("Connected");
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex);
            
        }
        
        return conn;
    }
    
}
