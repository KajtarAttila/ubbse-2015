package dao.generic.proba;


import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import pojo.java.*;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    		Locale currentLocale = new Locale("hu");
    		ResourceBundle messages;
    		messages = ResourceBundle.getBundle("ApplicationResources",currentLocale);
    		System.out.println(currentLocale);
    	
    		
        	Car p2 = new Car();
        	GenericDao<Car> dao2 = new GenericJdbcDao(Car.class);
        	p2.setAge(555);
        	p2.setHorsepower(555);
        	p2.setMake("almakorte");
        	ArrayList<Car> listToInsert = new ArrayList<Car> ();
        	listToInsert.add(p2);
        	dao2.insertObjects(listToInsert);
        	
        	
        	
        	
        	List<Car> l2 = dao2.getAllDataRows();
        	Iterator<Car> i2 = l2.listIterator();
        	while( i2.hasNext())
        	{
        		Car c = i2.next();
        		for (Field field : c.getClass().getDeclaredFields()) {
    				PropertyDescriptor propertyDescriptor;
					try {
						propertyDescriptor = new PropertyDescriptor(field.getName(), c.getClass());
	    				Method method = propertyDescriptor.getReadMethod();
	    				
	    				System.out.println(messages.getString(field.getName())+"= "+ method.invoke(c));

					} catch (IntrospectionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

    			}
        		
        		
        		
        	}
        	
        	
        		
        	
        	
        	
        	
    }
}
