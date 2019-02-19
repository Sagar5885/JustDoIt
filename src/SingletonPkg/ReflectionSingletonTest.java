package SingletonPkg;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String args[]){
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        try{
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor c: constructors) {
                c.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) c.newInstance();
                break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}

//will notice that hashCode of both the instances are not same that destroys the singleton pattern
//Reflection is very powerful