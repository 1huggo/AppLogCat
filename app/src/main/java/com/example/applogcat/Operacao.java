package com.example.applogcat;

public class Operacao {

    private float operador1;
    private float operador2;

    public Operacao (float op1, float op2)
    {
        this.operador1 = op1;
        this.operador2 = op2;
    }

    public float getOperador1() {
        return this.operador1;
    }

    public float getOperador2() {
        return this.operador2;
    }

    public float Soma()
    {
        return operador1 + operador2;
    }

    public float Subtracao() { return operador1 - operador2; }

    public float Multiplicacao() { return operador1 * operador2; }

    public float Divisao() { return operador1 / operador2; }
}
