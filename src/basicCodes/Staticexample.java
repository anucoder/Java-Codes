package basicCodes;

class Calculate{ 
	int non_static = 40;
static int static_data = 40;
  static int cube(int x){ 
	 static_data = 50;
  return x*x*x;  
  
  }
  
  void non_static_get() {
	  System.out.println(non_static+" "+static_data) ;
  }
}
  
 class Staticexample
 {
  public static void main(String args[]){ 
  Calculate c = new Calculate();
  System.out.println(Calculate.static_data);
  int result=Calculate.cube(5);  
  System.out.println(result);  
  c.non_static_get();
  }  
}