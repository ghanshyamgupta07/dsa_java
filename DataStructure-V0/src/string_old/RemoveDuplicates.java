package string_old;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "ABBBCCA";
        System.out.println(removeDup(str));

    }
    
    private static String removeDup(String str){
        
        if(str == null || str.length() == 0)
            return  str;
        
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<str.length()){
            char curr = str.charAt(i);
            sb.append(curr);
            
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                i++;
            }
            
            i++;
            
        }
         return sb.toString();
    }
    
}
