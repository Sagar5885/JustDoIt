package LogicalExampleHackerrank;

/**
 * Created by sdodia on 6/29/17.
 */
public class SaveThePrisoner1 {
    public static int saveThePrisoner(int prisoners, int sweets, int start) {
        int i = 0;
        if(start>1) {
            i = sweets <= prisoners ? sweets + 1 : sweets - (prisoners - start + 1);
        }else {
            i = sweets <= prisoners ? sweets : sweets - (prisoners - start + 1);
        }
        int j = ((i - 1) % prisoners) + 1;
        return j;
    }

    public static int saveThePrisoner2(int n, int m, int s) {
        int i = 0;
        if(s>1) {
            i = m <= n ? m+1 : m - (n - s + 1);
        }else {
            i = m <= n ? m : m - (n - s + 1);
        }
        int j = ((i - 1) % n) + 1;
        return j;
    }

    public static void main(String args[]){
        int n1 = 5;
        int m1 = 2;
        int s1 = 2;
        System.out.println("Save Prisionar No: "+saveThePrisoner(n1, m1, s1));
    }
}
