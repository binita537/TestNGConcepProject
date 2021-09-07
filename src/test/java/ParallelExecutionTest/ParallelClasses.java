package ParallelExecutionTest;

import java.util.Date;

import org.testng.annotations.Test;

public class ParallelClasses {

	/*
	 * <suite name="My suite" parallel="methods" thread-count="5"> <suite
	 * name="My suite" parallel="tests" thread-count="5"> <suite name="My suite"
	 * parallel="classes" thread-count="5"> view sourceprint? <suite name="My suite"
	 * parallel="instances" thread-count="5">
	 * 
	 */

	/*
	 * parallel="methods": TestNG will run all your test methods in separate
	 * threads. Dependent methods will also run in separate threads but they will
	 * respect the order that you specified.
	 * 
	 * parallel="tests": TestNG will run all the methods in the same <test> tag in
	 * the same thread, but each <test> tag will be in a separate thread. This
	 * allows you to group all your classes that are not thread safe in the same
	 * <test> and guarantee they will all run in the same thread while taking
	 * advantage of TestNG using as many threads as possible to run your tests.
	 * 
	 * parallel="classes": TestNG will run all the methods in the same class in the
	 * same thread, but each class will be run in a separate thread.
	 * 
	 * parallel="instances": TestNG will run all the methods in the same instance in
	 * the same thread, but two methods on two different instances will be running
	 * in different threads. Additionally, the attribute thread-count allows you to
	 * specify how many threads should be allocated for this execution.
	 * 
	 * Note: the @Test attribute timeOut works in both parallel and non-parallel
	 * mode.
	 * 
	 * You can also specify that a @Test method should be invoked from different
	 * threads. You can use the attribute threadPoolSize to achieve this result:
	 * 
	 * 
	 * 
	 */
	
	Date date=new Date();

	@Test
	public void TestOne() {
		System.out.println("I am parallel test one  "+date);
	}

	@Test
	public void TestTwo() {
		System.out.println("I am parallel test Two  "+date);
	}

}
