package week11;

public class StringPatterns
{
	/* returns the String that results when letter and pattern are compared, 
	* as described in part(a)
	* precondition: letter consists of one uppercase letter.
				 pattern has at least 2 letters and all letters are uppercase.
	*/
	public static String letterAndPattern(String letter, String pattern){ /* to be implemented in part(a) */
        String result="";
        
        if (pattern.indexOf(letter)>-1) result=letter;
        else{
            for(int i=pattern.length()-1; i>=0; i--){
                result+=pattern.substring(i,i+1);
            }
        }
        return result;
    }
	
	// there may be variables and methods that are not shown.
}
