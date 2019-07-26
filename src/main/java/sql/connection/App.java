package sql.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public class AppConfig {
        
        public DataSource dataSource() {
            //DriverManagerDataSource ds = new DriverManagerDataSource();
            Connection ds = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:rabbit", "system", "123");
            
            
        }
}
