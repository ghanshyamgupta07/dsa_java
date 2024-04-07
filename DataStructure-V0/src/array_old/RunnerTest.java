package array_old;

import java.util.*;

class Travel{
     int id;
     String from;
     String to;

     public Travel(int id, String from, String to) {
         this.id = id;
         this.from = from;
         this.to = to;
     }

    @Override
    public String toString() {
        return "Travel{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}


public class RunnerTest {

    public static void main(String[] args) {

        List<Travel> list = new ArrayList<>();

        Travel t1 = new Travel(1,"mumbai","delhi");
        Travel t2 = new Travel(1,"'delhi'","'chaennai'");
        Travel t3 = new Travel(2,"'delhi'","'culcutta'");
        Travel t4 = new Travel(2,"'culcutta'","'mumbai'");
        Travel t5 = new Travel(3,"'mahoba'","'muskara'");

        list.add(t1); list.add(t2); list.add(t3); list.add(t4); list.add(t5);
        Map<Integer,Travel> map = new HashMap();

        for(Travel t : list){
            if(map.containsKey(t.id)){
                map.get(t.id).to = t.to;
            }else{
                map.put(t.id,t);
            }
        }

       for(Travel t :map.values())
           System.out.println(t);








        int [] arr = {16, 17, 4, 3, 5, 2};
        // [0,0,0,0,0]

        int max = -1;
        int [] res = new int [arr.length];
        for(int i=arr.length-1; i >=0; i--){
            res[i] = max;

            if(arr[i]>max)
                max = arr[i];


        }

        System.out.println(Arrays.toString(res));

    }
}
