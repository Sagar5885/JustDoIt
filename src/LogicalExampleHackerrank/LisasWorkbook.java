package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/9/17.
 */
public class LisasWorkbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int pageNumber = 1;
        int specialProblems = 0;

        for(int i=0; i<n; i++){
            int problems = sc.nextInt();
            int currentProblem = 1;

            while(problems > 0)
            {
                int pageProblems = problems;
                pageProblems -= k;

                if(pageProblems > 0)
                {pageProblems = k;}
                else
                {pageProblems += k;}
                while(pageProblems > 0)
                {
                    if(pageNumber == currentProblem)
                    {
                        specialProblems++;
                    }
                    currentProblem++;
                    pageProblems--;
                }

                problems -= k;
                pageNumber++;
            }
        }
        System.out.println(specialProblems);
    }
}
