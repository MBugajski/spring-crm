package com.mbugajski.springdemo.crm.aspect.expressions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CRMExpressions {

	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	public void forAppFlow() {}

	@Pointcut("execution(* com.mbugajski.springdemo.crm.controller.*.*(..))")
	public void forControllerPackage() {}
	
	@Pointcut("execution(* com.mbugajski.springdemo.crm.service.*.*(..))")
	public void forServicePackage() {}
	
	@Pointcut("execution(* com.mbugajski.springdemo.crm.dao.*.*(..))")
	public void forDaoPackage() {}

	
	
	
}
