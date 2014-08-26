package org.apache.subash;

import org.slf4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Logger Logger= LoggerFactory.getLogger(App.class);
        Logger.info("Hello world!")
    }
}
