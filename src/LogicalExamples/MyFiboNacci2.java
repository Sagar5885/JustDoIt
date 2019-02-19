package LogicalExamples;

public class MyFiboNacci2 {

    public static void main(String args[]){
        System.out.println("Fibo No - 10th:"+sol(10));
    }

    public static int sol(int a){
        int[] resarr = new int[a+1];
        resarr[0] = 0;
        resarr[1] = 1;

        for(int i=2; i<=a; i++){
            resarr[i] = resarr[i-1]+resarr[i-2];
        }

        return resarr[a];
    }
}
