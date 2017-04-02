package helloWorld;

//This is the spring bean class.
public class HelloWorldBean {

	//private static final HelloWorldBean obj=new HelloWorldBean();  
	private String msg;
		
	private HelloWorldBean(String name){
		System.out.println(name);
		}  

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
		
	public void displayMsg() {
		System.out.println();
	}
	
	/*public static HelloWorldBean getHelloWorldBean( ){
	    System.out.println("factory method ");  
		return new HelloWorldBean();
	}*/
}