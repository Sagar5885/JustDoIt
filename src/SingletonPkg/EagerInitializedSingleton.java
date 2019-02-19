package SingletonPkg;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

//Simplest way to create singleton
//instance of singleton class is created at the same time of class loading
//Drawback instance is created eventhough client is not using it
//if your singleton not using lots of resources then use this approach of signleton
//File System, DB connection,..etc