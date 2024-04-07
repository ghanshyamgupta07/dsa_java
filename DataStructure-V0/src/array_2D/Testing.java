package array_2D;

public class Testing {
    public static void main(String[] args) {

        int [][]  data = BasicOps.create(4,4);
        BasicOps.print(data);

//        System.out.println("traverse row wise");
//        BasicOps.traverse(data,true);
//        System.out.println("\ntraverse column wise");
//        BasicOps.traverse(data,false);
//        System.out.println("\n");
//        BasicOps.printDigonals(data);

        // BasicOps.printAboveBelowMainDigonals(data);
        System.out.println("");
        BasicOps.printIndexes(data);
    }
}
