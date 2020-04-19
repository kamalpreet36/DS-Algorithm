import java.util.ArrayList;


public class ReverseString {
	
	public String reverse(String str){
		ArrayList<Character> revArray =new ArrayList<>();

		if(!str.isEmpty() && str.length()>=2){
			for(int i=str.length()-1; i>=0; i--){
				revArray.add(str.charAt(i));
			}
			
			StringBuilder sb = new StringBuilder(); 
			  
		      //Appends characters one by one 
		    for (Character ch : revArray) { 
		            sb.append(ch); 
		    } 
		    return sb.toString();
		        
		}
		
		else {
		return str;
		}
	}
	
	public static void main(String[] args) {
		ReverseString str = new ReverseString();
		String rev = str.reverse("Reverse String");
		System.out.println(rev);
	}
	
	
}
