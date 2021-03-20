package com.mbugajski.springdemo.crm.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {

	private Logger myLogger = Logger.getLogger(getClass().getName());

	@Before("com.mbugajski.springdemo.crm.aspect.expressions.CRMExpressions.forAppFlow()")
	public void before(JoinPoint theJoinPoint) {

		myLogger.info("=====> in @Before: calling method: " + theJoinPoint.getSignature().toShortString());

		Object[] args = theJoinPoint.getArgs();

		for (Object arg : args) {
			myLogger.info("=====> argument: " + arg.toString());
		}
	}
	
	@AfterReturning(
			pointcut="com.mbugajski.springdemo.crm.aspect.expressions.CRMExpressions.forAppFlow()",
			returning="theResult"
			)
	public void afterReturning(JoinPoint theJoinPoint, Object theResult) {
		
		myLogger.info("=====> in @AfterReturning: from method: " + theJoinPoint.getSignature().toShortString());
		
		myLogger.info("=====> result: " + theResult);
	}
}
