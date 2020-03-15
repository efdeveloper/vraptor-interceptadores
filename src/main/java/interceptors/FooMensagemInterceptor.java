package interceptors;

import annotations.FooMensagem;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.interceptor.AcceptsWithAnnotations;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;

@Intercepts
@AcceptsWithAnnotations({FooMensagem.class})
public class FooMensagemInterceptor {

    @AroundCall
    public void intercept(SimpleInterceptorStack simpleInterceptorStack, ControllerMethod controllerMethod) {
        FooMensagem fooMensagem = controllerMethod.getMethod().getAnnotation(FooMensagem.class);
        System.out.println(fooMensagem.value());
    }

}
