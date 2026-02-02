public class Main {

   public static void main(String []args) {

     //  1D array is a block of memory that stores a collection
     // of data items of the same type
     // UNDER ONE VARIABLE NAME

     // how to declare an ARRAY VARIABLE
     String[] apCompSci = new String[13];    
     double[] prices = new double[5]; // [0.0.0.0.0]
     String[] names = new String[5];
     int[] luckyNum = new int[10];
     

    System.out.println(prices[0]);

    luckyNum[0] = 14;
    luckyNum[5] = 7;
    System.out.println(luckyNum[0]);
    System.out.println(luckyNum[0]);
    System.out.println(luckyNum[3]);
    System.out.println(luckyNum[45]);

    String[] table = ("danny", "Matthew", "kyanni");
    System.out.println(table[1]);
    System.out.println(table[0]);
    // only use the initializer list shortcut when first declaring declaring array
    // like we cant do apCompsci = (name 1, name2
    // .length gets number
    int lengthOfTableArray = table.length;
    System.out.println(lengthOfTableArray);

    int finalIndex = table.length - 1;
    System.out.println(table[finalIndex]);

   } // ENDS MAIN METH
} // end main class
