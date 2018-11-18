
public class Singleton {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SingletonDemo obj =SingletonDemo.getInstance();
		
		SingletonDemo obj1 =SingletonDemo.getInstance();
		SingletonDemo obj2 =SingletonDemo.getInstance();
	}
}
	 class SingletonDemo{
		   String s1="hello world";
		   public static SingletonDemo obj;
		   //private constructor
		  private SingletonDemo(){
			// TODO Auto-generated constructor stub
		
			   
			   System.out.println(s1);
			   System.out.println(s1.hashCode());
			
		}
		   public static SingletonDemo getInstance(){
			 if(obj==null){
				  obj=new SingletonDemo();
			   }
			   return obj;
		   }
	}


