package tel_ran.aop.validation;

import org.aspectj.lang.ProceedingJoinPoint;

public class VulgarWordsValidation{
	private String[] vul; 
	
	public VulgarWordsValidation(String[] vul) {
		super();
		this.vul = vul;
	}

	public Object validate(ProceedingJoinPoint joinPoint) throws Throwable{
		Object[] args = joinPoint.getArgs();
		if (args != null)
			for (int i = 0; i < args.length; i++)
				if(args[i] instanceof String)
					for(String expression : vul)
						args[i] = args[i].toString().replaceAll(
								"(?i)" + expression, "*****");
		return joinPoint.proceed(args);
	}
}