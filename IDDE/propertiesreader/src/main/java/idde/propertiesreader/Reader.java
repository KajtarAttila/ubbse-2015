package idde.propertiesreader;

import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class Reader 
{
    public void Reader(){
        System.out.println("App starts:");
        
    }
    public String readProperties(){
        
        Properties prop = new Properties();
        String returnValue = new String("");
        try{
        InputStream in = getClass().getResourceAsStream("/test.properties");
        prop.load(in);
        
        System.out.println(prop.getProperty("alma"));
        returnValue.concat(prop.getProperty("alma"));
        System.out.println(prop.getProperty("szilva"));
        returnValue.concat(prop.getProperty("szilva"));
        }
        catch(Exception ex){
        System.out.println(ex.getMessage());
        };
        return returnValue;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Reader p = new Reader();
        p.readProperties();
    }
    
}
