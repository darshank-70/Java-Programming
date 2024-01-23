//Thread is in java.lang
class MyThread extends Thread {

    @Override 
    public void run(){
        for(int i=0;i<4; i++){
            try{Thread.sleep(200);}catch(InterruptedException e){}
            System.out.println(Thread.currentThread().getId());
        }
    }
}
class ThreadDemo {

    public static void main(String[] args) throws Exception{

        MyThread thread1=new MyThread();
        // thread1.start();//creates a new Thread and executes Run Method and simultaneously proceeds to Execute main Thread
        // thread1.join();///////throws 
        // thread1.run();//Doesnt create a Thread, but just executes Run 

        //create 5 Threads
        MyThread[] tArray= new MyThread[5];

        for(int i = 0 ; i < 5 ; i++ ){
            tArray[i]=new MyThread();
            tArray[i].setName("T="+i);
            if(i>=2) {
                tArray[i].start();
            }  //Keeping 0 and 1 Threads not started but created
        }
        
    }
}