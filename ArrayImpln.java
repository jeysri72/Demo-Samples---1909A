public class ArrayImpln {
    public static void main(String[] args){
        //Array - is a collection of same data type
        int value;

        int[] myArrary ; // Declaration
        myArrary = new int[5]; // Initialization

        myArrary[0] = 5; // Assigning values
        myArrary[1] = 10;
        myArrary[2] = 5;
        myArrary[3] = 3;
        myArrary[4] = 2;

        for (int i = 0; i<myArrary.length ; i++){
            System.out.println(myArrary[i]);
        }

    }
}
