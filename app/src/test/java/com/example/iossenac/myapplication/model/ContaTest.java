package com.example.iossenac.myapplication.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by iossenac on 29/04/17.
 */
public class ContaTest {
    @Test
    public void depositarSucesso() {
        float valorEsperado = 400;

        float valorDepositado = 300;

        Conta conta = new Conta("A","0","0",100,100);



        assertEquals(valorEsperado, conta.getSaldo(), 400);

    }

    @Test
    public void sacarSucesso() {

        float saldoEsperado = 100;

        Conta conta = new Conta("a","0","0",200,-100);
        try {
            conta.sacar(100);
        }catch (Exception e) {
            fail(e.getMessage());
        }


        assertEquals(saldoEsperado, conta.getSaldo(), 0);
    }

    @Test
    public void sacarErroSaldoInsuficiente() {

    }

    @Test
    public void transferirSucesso() {

    }

    @Test
    public void transferirErroSaldoInsuficiente() throws Exception {

    }


}