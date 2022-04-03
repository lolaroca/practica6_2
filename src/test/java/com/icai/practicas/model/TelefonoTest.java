package com.icai.practicas.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

//import org.junit.jupiter.api.*;


public class TelefonoTest {
    @Test
    public void testTelefono(){

        //válidos
        Telefono t1 = new Telefono ("608475987");
        assertEquals(true, t1.validar());

        Telefono t2 = new Telefono ("608475986");
        assertEquals(true, t2.validar());

        //no válidos
        Telefono t3 = new Telefono ("768654738");
        assertEquals(false, t3.validar());

        Telefono t4 = new Telefono ("112233445566778899");
        assertEquals(false, t4.validar());
    
    }
}