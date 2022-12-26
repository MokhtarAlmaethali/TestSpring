package com.yemensoft.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yemensoft.controller.TestController;
import com.yemensoft.model.service.ValueInjectionService;

public class TestIOC {

	@Test
	public void test1()
	{
		A a=new A();
		a.test();
		
	}
	
	@Test
	public void test2()
	{
//		1. initialize spring IOC container
		
		ApplicationContext contaxt=new ClassPathXmlApplicationContext("applicationContext.xml");
//		2. get instance of A from IOC container
		A a= contaxt.getBean(A.class);
		a.test();
		
//		
	}
	/**
	 * singleton class normally don't have properties(filed)
	 * singleton class(used as tool) vs Entity class	(Student, Employee)
	 * Entity class has properties inside and each object should have different properties
		
	 * the advantage of singleton is save memory
	 * Spring IOC, by default will handle all class as singleton class
	 * 	1. for entity class , we will create instance by ourself
	 *  2. for Entity class , we can let spring to handle it
	 *  
	 *   do you know how to write singleton class by yourself? 
	 *      you can see DBUtils Class hahahhahaha
	 */
	
	@Test 
	public void test3(){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		B b=context.getBean(B.class);
//		B b2=context.getBean(B.class);
//		B b3=context.getBean(B.class);
//		
////		B is singleton class(only one object) 
		
		
//		System.out.println(b);		
//		System.out.println(b2);
//		System.out.println(b3);
		
		
//		different object or different instance
//		if we create the A by ourself is not singleton but if we ask 
//		A from ioc container it will make it singleton by default
//		A a=new A();
//		A a2=new A();
//		A a3=new A();
//
//		System.out.println(a);
//		System.out.println(a2);
//		System.out.println(a3);

//		A a=context.getBean(A.class);
//		B b2=context.getBean(B.class);
//		
//		a.test(); //output b inside a
//		System.out.println(b2);
//		
		A a=context.getBean(A.class);
		A a2=context.getBean(A.class);
		a.test();
		System.out.println(a);
		System.out.println(a2);
		
	}
	
	@Test
	public void test4()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TestController testController= context.getBean(TestController.class);
		testController.test();
	}
	@Test
	public void test5()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ValueInjectionService service= context.getBean(ValueInjectionService.class);
		service.showinfo();
	}
}
