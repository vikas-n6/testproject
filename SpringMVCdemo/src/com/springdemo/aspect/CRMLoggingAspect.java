package com.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class CRMLoggingAspect {

	//set up logger
	private  Logger myLogger=Logger.getLogger(getClass().getName());
	
	//setup pointcut declaration
	@Pointcut("execution(* com.springdemo.controller.*.*(..))")
	private void forControllerPackage(){
		
	}
	
	@Pointcut("execution(* com.springdemo.service.*.*(..))")
	private void forServicePackage(){
		
	}
	
	@Pointcut("execution(* com.springdemo.dao.*.*(..))")
	private void forDaoPackage(){
		
	}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	private void forAppFlow(){
		
	}
	
	//add @Before advice
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint){
		
		//display the method 
		String method=theJoinPoint.getSignature().toShortString();
		myLogger.info("====> in @Before: Calling method: "+method);
		
		//display the arguments
		Object[] args=theJoinPoint.getArgs();
		
		//loop through and display the arguments
		for(Object tempArg: args){
			myLogger.info("====> argument: "+tempArg);
		}
	}
	
	//add @afterReturning advice
	@AfterReturning(
			pointcut="forAppFlow()",
			returning="theResult")
	public void afterReturning(JoinPoint theJoinPoint, Object theResult){
		
		//display method
		String method=theJoinPoint.getSignature().toShortString();
		myLogger.info("====> in @AfterReturning: from method: "+method);
		
		//display data returned
		myLogger.info("====>Result: "+theResult);
	}
	
	
}
