package multiThreading;

class threadex extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
	 threadex t1=new threadex();  
	 threadex t2=new threadex();  
   
  t1.start();  
  t2.start();  
 }  
}