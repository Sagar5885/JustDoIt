package MultiThreadding.Synchronization;

public class OneMoreExample {

    public static void main(String args[]) throws Exception{
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //synchronized ("") {
                    for(int i=0; i<1000; i++){
                        c.increment();
                    }
                //}
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //synchronized ("") {
                    for (int i = 0; i < 1000; i++) {
                        c.increment();
                    }
                //}
            }
        });

        //t1.setPriority(1); - but priority not help towards synchronized
        t1.start();//Trigger start t1 to start and finish it's run job
        t2.start();

        t1.join();//Join is needed Main thread to wait to complete t1 to finish
        t2.join();

        System.out.println("Count Now: "+c.count);
    }
}

class Counter {
    int count;

    public synchronized void increment(){
        count++;
    }

//    public void increment(){
//        count++;
//    }
}

//You can assing your method synchronized or make a method inside run with synchronized to run threads in synchronized mode.
//synchronized methods will serve one thread at time - another thread will wait
//as soon as you call join - it will wait for that thread to complete

//New, Runable, Running, block/wait, terminated/dead

//Priority of thread  - that thread run 1st or before some other thread

//        newFixedThreadPool(int)           Creates a fixed size thread pool.
//        newCachedThreadPool()             Creates a thread pool that creates new
//                                          threads as needed, but will reuse previously
//                                          constructed threads when they are available
//        newSingleThreadExecutor()         Creates a single thread.

//wait, notify, notifyAll - wait will wait till notify by thread, if more then one thread waiting then notifyAll
