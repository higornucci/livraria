package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptador {
	
	@AroundInvoke
	public Object interceptar(InvocationContext context) throws Exception {
		long millis = System.currentTimeMillis();
		
		Object object = context.proceed();
		String metodo = context.getMethod().getName();
		String classe = context.getTarget().getClass().getSimpleName();
		
		System.out.println(classe + ", " + metodo);
		System.out.println("Tempo gasto: " + (System.currentTimeMillis() - millis));
		
		return object;
	}

}
