class Test10 {
   public static void main(String args[]){
    try{
       int n =20;
	   int abc = 0;
       
       int fraction = n/abc;
    }
  catch(ArithmeticException e){
    System.out.println("In the catch block due to Exception = "+e);
  }
  
  finally{
	System.out.println("Inside the finally block");
  }
}
}