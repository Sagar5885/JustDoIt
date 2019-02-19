package MultiThreadding.Synchronization;

class OneMoreExampleWaitNotify extends Thread{

    long sum;

    public void run(){
        synchronized (this) {
            for(int i=0;i<1000; i++){
                sum = sum + i;
            }
            notify();
        }
    }
}

class TestOneMoreExampleWaitNotify {
    public static void main(String args[]){
        OneMoreExampleWaitNotify oneMoreExampleWaitNotify = new OneMoreExampleWaitNotify();
        oneMoreExampleWaitNotify.start();

        synchronized (oneMoreExampleWaitNotify){
            try {
                oneMoreExampleWaitNotify.wait(); //Wait here inside synchronized will help to wait for notify in OneMoreExampleWaitNotify class
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(oneMoreExampleWaitNotify.sum);
    }
}
