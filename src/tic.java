
import java.sql.*; 
import javax.swing.JOptionPane; 

class bustic{     
    Connection conn=null;         
    public static Connection ConnecrDb(){         
        try{          
            Class.forName("org.sqlite.JDBC");          
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Dell\\Desktop\\2\\Bus\\bus.sqlite");                  
            return conn;         
        }catch(Exception e){             
            JOptionPane.showMessageDialog(null, e);         
        }         return null;     
    } 
}
