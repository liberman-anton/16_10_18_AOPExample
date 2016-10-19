package tel_ran.aop.validation;

import org.aspectj.lang.ProceedingJoinPoint;

import tel_ran.chat.ChatRoom;

public class VulgarWordsValidation{
	
	public Object validate(ProceedingJoinPoint joinPoint) throws Throwable{
		Object[] args = joinPoint.getArgs();
		String[] expressions = ChatRoom.getExpressions();
		if (args != null)
			for (int i = 0; i < args.length; i++)
				if(args[i] instanceof String)
					for(String expression : expressions)
						args[i] = args[i].toString().replaceAll(
								"(?i:" + expression + ")", "*****");
		return joinPoint.proceed(args);
	}
}