
package math;

public class CatalanNum {
    public static void main(String[] args) {

         String s = "babad"; 
         
        if(s == null || s.length() == 0)
        return ;
     
    StringBuffer res = new StringBuffer();
    
    for(int i=0; i<s.length(); i++){
        
        
    }


        
     for(int i=0 ; i<11 ; i++){
        // System.out.println(" catalan no. for "+i + " == "+nthCatalanNum(i));
        // System.out.println(" catalan no. for "+i + " == "+nthCatalan(i));

        //System.out.println(" factorial "+i + " == "+factorial(i));
        
     }         




    }
    
    private static int nthCatalan(int n){

        return factorial(2*n)/(factorial(n)*factorial(n+1));
    }

    private static int factorial(int n){

     int res = 1;
     for(int i=2;i<=n;i++)
        res = res * i;

     return res;   
    }



    private static int nthCatalanNum(int n){

        if(n<2)
        return 1;

        int [] catlan = new int[n+1];
        catlan[0] = 1; catlan[1] = 1;
        
        
        for(int i=2;i<=n;i++){
            catlan[i] = 0;
            for(int j=0;j<i;j++){
                catlan[i] += catlan[j] * catlan[i-j-1] ;   
            }
        }
     
        return catlan[n]; 

    }
}
