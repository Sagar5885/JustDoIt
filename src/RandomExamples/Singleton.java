package RandomExamples;

/**
 * Created by sdodia on 3/28/17.
 */
public class Singleton {
    private static Singleton singleton=new Singleton();
    public String str;
    private Singleton(){}
    public static Singleton getSingleInstance(){return singleton;}
}

//Enum is the only true way to create a Singleton. Private constructors can be still call through reflection.
//