
package org.uta.ventas;

import javax.jws.WebService;

@WebService(endpointInterface = "org.uta.ventas.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
    
    public String sayBye(String nombre) {
        return "Hasta luego: " + nombre;
    }
}

