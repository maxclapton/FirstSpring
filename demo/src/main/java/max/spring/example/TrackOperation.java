package max.spring.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TrackOperation {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Pointcut("execution(* max.spring.example.HolidayController.*(..))")
	public void action() {}
	
	@Before("action()")
	public void beforeAction(JoinPoint jp) {
		System.out.println("before execution");
		logger.info("before execution");
	}
	
	@After("action()")
	public void actionAction(JoinPoint jp) {
		System.out.println("after execution");
		logger.info("after execution");
	}
}
