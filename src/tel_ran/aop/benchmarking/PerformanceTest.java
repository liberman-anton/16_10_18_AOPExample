package tel_ran.aop.benchmarking;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class PerformanceTest {
	 public Object watchPerformance(ProceedingJoinPoint joinPoint) throws Throwable{
		 Signature signature = joinPoint.getSignature();
		 String name = signature.getName();
		 long timeStart = System.currentTimeMillis();
		 Object res = joinPoint.proceed();
		 long timeEnd = System.currentTimeMillis();
		 System.out.println("method name: " + name + "; running time: " + (timeEnd -timeStart));
		 return res;
	 }
}
