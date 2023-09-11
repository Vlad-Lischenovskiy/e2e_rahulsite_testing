public class coreJava {
    public static void main(String[] avg){

        //Variables
        int num = 5;
        String name = "Vlad";
        char letter = 'r';
        double dec = 5.99;
        Boolean bool = true;
        //System.out.println(num);

        //Arrays
        int[] arr = new int[5]; //array that include 5 variables
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 10;
        arr[4] = 6;

        int[] arr2 = {1, 2, 5, 10, 6}; //Valid array too

        //for loop
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
