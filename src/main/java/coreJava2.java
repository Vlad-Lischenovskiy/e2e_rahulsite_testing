public class coreJava2 {
    public  static void main(String[] args){

        //check if this array is multiple 2
        int[] arr = {1, 2, 4, 6 ,7 ,9, 20, 22};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
            else {
                System.out.println(arr[i] + "Vova lox prosnus yge");
            }
        }
    }
}
