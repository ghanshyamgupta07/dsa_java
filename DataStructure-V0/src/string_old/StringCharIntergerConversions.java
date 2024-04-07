package string_old;

public class StringCharIntergerConversions {

    public static void main(String[] args) {

        String str = "83?12?2??1?";
        StringBuffer stringBuffer = new StringBuffer();
        int lastUpdateind = 0;
        int sum = 0;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='?'){
                stringBuffer.append('0');
                lastUpdateind = i;
            }else{
                stringBuffer.append(str.charAt(i));
                sum += str.charAt(i) - '0';
            }

        }

        if(sum %3 != 0){
            stringBuffer.setCharAt(lastUpdateind,'1');
            if(sum+1 %3 != 0){
                stringBuffer.setCharAt(lastUpdateind,'2');
            }
        }
        System.out.println(stringBuffer);

    }
}
