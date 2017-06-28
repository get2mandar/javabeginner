package in.javapandit.testing.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticMethodsClass.class)
public class StaticMethodsClassTest {
	
	@Test
	public void testMyStaticMethodCallingOtherStatic() {
		// Power Mock Class Having Static Methods
		
		//PowerMockito.mockStatic(StaticMethodsClass.class);
		
		PowerMockito.spy(StaticMethodsClass.class);
		
		//PowerMockito.verifyStatic(Mockito.never());
		//StaticMethodsClass.myStaticMethodWithNoArg();
		
		PowerMockito.doNothing().when(StaticMethodsClass.class);
		StaticMethodsClass.myStaticMethodWithNoArg();

		//PowerMockito.verifyStatic(Mockito.times(1));
		StaticMethodsClass.myStaticMethodCallingOtherStatic();
	}
	
	@Test
	public void testMyStaticMethodCallingOtherStaticWithParamAsNull() {
		// Power Mock the Static Class
		PowerMockito.spy(StaticMethodsClass.class);
		
		String name = null;
		
		PowerMockito.doReturn(true).when(StaticMethodsClass.class);
		StaticMethodsClass.myStaticMethodReturnBoolean(name);
		
		PowerMockito.doNothing().when(StaticMethodsClass.class);
		StaticMethodsClass.myStaticMethodWithNoArg();
		
		StaticMethodsClass.myStaticMethodCallingOtherStaticWithParam(name);
	}
	
	@Test
	public void testMyStaticMethodCallingOtherStaticWithParamAsValidName() {
		// Power Mock the Static Class
		PowerMockito.spy(StaticMethodsClass.class);
		
		String name = "ValidName";
		
		PowerMockito.doReturn(true).when(StaticMethodsClass.class);
		StaticMethodsClass.myStaticMethodReturnBoolean(name);
		
		PowerMockito.doNothing().when(StaticMethodsClass.class);
		StaticMethodsClass.myStaticMethodWithNoArg();
		
		StaticMethodsClass.myStaticMethodCallingOtherStaticWithParam(name);
	}
	
	@Test
	public void testMyStaticMethodCallingOtherStaticWithParamAsValidNameElseRoute() {
		// Power Mock the Static Class
		PowerMockito.spy(StaticMethodsClass.class);
		
		String name = "ValidName";
		
		PowerMockito.doReturn(false).when(StaticMethodsClass.class);
		StaticMethodsClass.myStaticMethodReturnBoolean(name);
		
		StaticMethodsClass.myStaticMethodCallingOtherStaticWithParam(name);
	}
}
