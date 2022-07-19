import java.util.*;
class cekurung{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(cekkurung(input));
            //Complete the code
		}
		
	}
    private static boolean cekkurung(String kurung){
        Stack <Character>stack = new Stack<>();
        
        for(int i = 0; i<kurung.length(); i++){
            if(kurung.charAt(i)=='['|| kurung.charAt(i)=='('||kurung.charAt(i)=='{'){
                 stack.push(kurung.charAt(i));
 
 
            }else{
                
                if(stack.isEmpty()){ 
                    return false;
                   
                }else if(!stack.isEmpty()){
                   Character temp = stack.pop();
                   if((temp == '(' && kurung.charAt(i)!=')' || temp == '{' && kurung.charAt(i)!='}'|| temp == '[' && kurung.charAt(i)!=']')){
                       return false;
                   }
 
                }
                
                
 
                }
            }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
  
            
        }
}



