package problemsTesting;



public class PJUnit2 {
	public static int main(String string) 
    { 
        int code = 0x12456; 
  
        int ans = Character.charCount(code); 
  
        // prints 2 if character is greater than 0x10000 
        // otherwise 1 
        System.out.println(ans);
		return ans; 
    } 
}
