package idde.propertiesclient;

/**
 * Hello world!
 *
 */

public class TestDependencyReader 
{
    public TestDependencyReader(){
       System.out.println("propertiesclient starts");
       idde.propertiesreader.Reader p = new idde.propertiesreader.Reader();
       String rv = p.readProperties();
       
    }
    public static void main( String[] args )
    {
        TestDependencyReader p = new TestDependencyReader();
    }
}
