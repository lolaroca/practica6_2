package com.icai.practicas.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import com.icai.practicas.model.*;

import org.junit.jupiter.api.Test;

//import org.junit.jupiter.api.*;


public class DNITest {
    @Test
    public void testDNI(){

        //no válidos
        DNI dni1 = new DNI ("0000000F");
        assertEquals(false, dni1.validar());

        DNI dni2 = new DNI ("0000000D");
        assertEquals(false, dni2.validar());


        //no tienen la longitud correcta
        DNI dni3 = new DNI ("123");
        assertEquals(false, dni3.validar());

        //DNI válido

        DNI dni4 = new DNI ("06598111D");
        assertEquals(true, dni4.validar());

        DNI dni5 = new DNI ("06598111E");
        assertEquals(true, dni5.validar());
    }
}