package veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author byporti
 */
public class VeritabaniBaglantisi {
    
    public final String URL = "jdbc:mysql://localhost:3306/";
    public final String DB_NAME = "izintakipsistemi";
    public final String ID = "root";
    public final String PW = "explat45";
    public final String DRIVER = "com.mysql.jdbc.Driver";
    
    public Connection con;
    
    public Statement baglan() {
        
        try {
            
            //Driver yolunu belirtip örnek oluşturduk.
            Class.forName(DRIVER).newInstance();
            // Connection ile bağlantıyı sağladık.
            con = DriverManager.getConnection(URL + DB_NAME, ID, PW);
            
            //JOptionPane.showMessageDialog(null, "Veritabanına bağlantı başarılı.");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Veritabanına bağlantı başarısız oldu!!    " + e);
        }// try-catch sonu
        
        return null;
    }// statement sonu
    
    // Veritabanına bağlantı yapıp yapmayacağını kontrol edelim.
    /*public static void main(String[] args) {
        
        VeritabaniBaglantisi vb = new VeritabaniBaglantisi();
        vb.baglan();
    }// main metodu sonu
    */
    
}// class sonu.
