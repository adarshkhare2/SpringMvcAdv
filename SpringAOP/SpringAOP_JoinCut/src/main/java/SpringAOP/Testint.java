package SpringAOP;

public interface Testint {
	//These 2 starts with "say" word
	//say= NameMatchmethodPointcut
	void sayHi();
	void sayBy();

	//These 2 starts with "Wish" & End with "Msg"
	//wish+mMsg= this regex
	//.*get.+data= JdkRegexpMethodPointcut
	void getdata();
	void getMydata();
	
	
}
