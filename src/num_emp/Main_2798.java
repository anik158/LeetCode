package num_emp;


public class Main_2798 {
    public static void main(String[] args) {

        int[] arr =new int[]{5,1,4,2,2,2};

        int res = maxTarget(arr,3);

        System.out.println(res);
    }

    public static int maxTarget(int[] arr,int target){

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>target){
                count++;
            }
        }
        return count;
    }
}
