///WHen Multiple threads are Accessing same Resource there must be synchronized Access
//to the resources
//for Example in THe counter Class we are incrementing count using 2 threads for 2000times
//but we dont get 2000 as result //since the two Threads accessing can take place at same time 

//Therefore "synchronized" keyword provides the "Thread-safe" Access to method

class Counter{
    int count=0;
    public synchronized void increment(){
        count++;
    }
}
class SynchronizedDemo{

    public static void main(String[] args) throws Exception{

        Counter c=new Counter();
        
        Thread t1= new Thread(()->{
            for(int i = 0 ; i < 2000 ; i++){
                c.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<2000;i++){
                c.increment();
            }
        });
        

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(c.count);
    }
}