public class Reverse_Print {
    public static void main(String[] args) {
        int[] arr={4,5,3,6,2,6};
        for (int i = 0; i < arr.length/2 ;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length -i-1];
            arr[arr.length -i-1] = temp;


        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
