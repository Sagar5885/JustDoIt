package SingletonPkg;

public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class SignletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SignletonHelper.INSTANCE;
    }
}

//privart static inner class that contains the instance of singleton class
//When BillPughSingleton class loaded SignletonHelper is not getting loaded in memory till someone calls getInstance
//Widely used