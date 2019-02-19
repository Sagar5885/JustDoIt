package MultiThreadding.Synchronization;

import java.util.concurrent.*;

public class CallableExample {

    public static void main(String args[]){

        ExecutorService executorService = Executors.newSingleThreadExecutor();

//        Callable<String> task = new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return "My Callable Task Done!";
//            }
//        };
//
//        Future<String> f = executorService.submit(task);
//
//        if(f.isDone()){
//            try {
//                System.out.println(f.get());
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//        }


        MyCallable task2 = new MyCallable(10);
        Future<Integer> f2 = executorService.submit(task2);

        try {
            System.out.println(f2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

//Callable is same as Runnable accept two difference - 1)Callable returns with Future Obj and 2)Callable throws one checked exception