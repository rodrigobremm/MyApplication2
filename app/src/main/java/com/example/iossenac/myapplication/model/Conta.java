package com.example.iossenac.myapplication.model;

/**
 * Created by iossenac on 29/04/17.
 */

public class Conta {
    private String nome;
    private String agencia;
    private String numero;
    private float saldo;
    private float limite;

    public Conta(String nome, String agencia, String numero, float saldo, float limite){
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta(String nome, String agencia, String numero, float limite){
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
        this.limite = limite;
    }



    public void depositar(float valor){
        this.saldo += valor;
    }

    public void sacar(float valor) throws Exception {
        if(ValidarSaque(valor))
            this.saldo -= valor;
        else {
            System.out.println("ERRO!");
            throw new Exception("Saldo insuficiente para este saque!");
        }
    }

    public void transferir(Conta conta, float valor){
        if(ValidarSaque(valor)){
            conta.depositar(valor);
            this.saldo -= valor;
        }
        else
            System.out.println("ERRO!");
    }

    public Boolean ValidarSaque(float valor)
    {
        if ((this.saldo-valor) > limite)
            return true;
        else
            return false;
    }


    public String getNome() {
        return nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

}
