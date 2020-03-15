package interceptors;

import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@Intercepts
@RequestScoped
public class Log {

    @Inject
    private HttpServletRequest httpServletRequest;

    @AroundCall
    public void intercept(SimpleInterceptorStack stack) {
        System.out.println("Interceptando " + httpServletRequest.getRequestURI());
        // código a ser executado antes da lógica

        stack.next(); // continua a execução
    }

}
