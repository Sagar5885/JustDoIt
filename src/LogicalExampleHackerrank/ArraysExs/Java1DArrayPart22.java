package LogicalExampleHackerrank.ArraysExs;

import java.util.Scanner;

/**
 * Created by sdodia on 7/12/17.
 */
public class Java1DArrayPart22 {
    static boolean didWinGame(int jumpLength, int[] gameArray, int currentPos,int lastJumpPos)
    {

        boolean didWin = false;

        int range = currentPos;

        while(range < gameArray.length-1 && gameArray[range+1] == 0){
            range++;
        }
        if(range == gameArray.length-1) return true;

        int lowRange = range;
        while(lowRange>lastJumpPos && gameArray[lowRange-1] == 0 && (lowRange+jumpLength) > range+1 ){
            lowRange--;
        }
        currentPos = lowRange;
        for(int i = currentPos;i<=range;i++){
            if((i+jumpLength)<gameArray.length && gameArray[i+jumpLength] == 0  && jumpLength!=0){
                didWin = didWinGame(jumpLength, gameArray, i+jumpLength,i);
            }

            if(didWin || (i+jumpLength)>=gameArray.length || (i+1)>=gameArray.length){
                didWin = true;
                break;
            }
        }

        return didWin;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for(int i=0;i<numCases;i++){
            int arraySize = sc.nextInt();
            int jumpLength = sc.nextInt();
            sc.nextLine();
            int[] gameArray = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                gameArray[i] = sc.nextInt();
            }
            if(didWinGame(jumpLength, gameArray,0,0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
