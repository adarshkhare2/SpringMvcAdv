package SpringAOP;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class GoodByAdvise implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Good Bye : AfterAdvice ");
	}

}
