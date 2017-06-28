package in.javapandit.testing.mockito;

public class StaticMethodsClass {
	
	public static void myStaticMethodWithNoArg() {
		System.out.println("myStaticMethodWithNoArg");
	}
	
	public static void myStaticMethodCallingOtherStatic() {
		myStaticMethodWithNoArg();
		System.out.println("myStaticMethodCallingOtherStatic");
	}
	
	public static boolean myStaticMethodReturnBoolean(String checkParam) {
		System.out.println("myStaticMethodReturnBoolean");
		return checkParam == null;
	}
	
	public static void myStaticMethodCallingOtherStaticWithParam(String param) {
		if(myStaticMethodReturnBoolean(param)) {
			myStaticMethodWithNoArg();
		}
		System.out.println("myStaticMethodCallingOtherStatic");
	}

}
