/**
 * 
 */

/**
 * @author ik013043z1
 *
 */import java.util.Scanner;

public class SwitchTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Type a letter" );
		
		Scanner Sc = new Scanner(System.in);
		
		String Ch = Sc.next();
		 
        switch ( Ch) {
            case "a":
            	System.out.println( "You have typed a" );
            break;
            case "b":
            	System.out.println( "You have typed b" );
            break;
            case "c":
                System.out.println( "You have typed c" );
                break;
            case "d":
            	System.out.println( "You have typed d" );
            break;
            case "e":
                System.out.println( "You have typed e" );
                break;
            case "f":
                System.out.println( "You have typed f" );            
                break;
                
            default:
                System.out.println( "Type a letter between a and f");
                break;
		
		
        			}

										}
	
}

