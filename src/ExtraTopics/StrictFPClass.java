package ExtraTopics;

/**
 * Created by sdodia on 6/2/17.
 */
strictfp class StrictFPClass {
    double a;
    double b;
    double sum(double i, double j){
        return i+j;
    }

    public static void main(String args[]){
        StrictFPClass strictFPClass = new StrictFPClass();
        System.out.print(strictFPClass.sum(1.12, 2.23));
    }

}