package SingletonPkg;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    static {
        try{
            instance = new StaticBlockSingleton();
        }catch (Exception ex){
            throw new RuntimeException("Exception occure during singleton instance creation!");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}

//Excactly same as EagerInitializecdSingleton only difference is instance with exceptions handling
//Both create instance even before used which not best practice

