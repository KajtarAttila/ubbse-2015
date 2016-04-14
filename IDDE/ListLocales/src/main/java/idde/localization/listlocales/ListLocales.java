package idde.localization.listlocales;

import java.util.*;
import java.text.*;
/**
 * Listing all the available locales on the System
 *
 */
public class ListLocales 
{
    public static void main( String[] args )
    {
        Locale list[] = DateFormat.getAvailableLocales();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getLanguage() + " "
                    + list[i].getCountry());
        }

    }
}
