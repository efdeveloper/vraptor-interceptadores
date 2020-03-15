package controllers;

import annotations.FooMensagem;
import br.com.caelum.vraptor.Controller;

@Controller
public class FooController {

    public void teste() {
        
    }

    @FooMensagem("Foo mensagem abc().")
    public void abc() {

    }

    @FooMensagem("Foo mensagem def().")
    public void def() {

    }

}
