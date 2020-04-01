package cs_utec.cs2901;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Logger l = Logger.getLogger("App");
        l.info( "Hello World!" );
		for(int i=0;i<100;i++){
			l.info("Necesito lavarme las manos por 20 segundos");
		}
	
    }
}
