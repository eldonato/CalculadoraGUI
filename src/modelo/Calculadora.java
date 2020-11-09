/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author PC
 */
public class Calculadora {
    
    //Variáveis
    private float result;
    private float num1;
    private float num2;
    private String sinal;

    //Construtor
    public Calculadora(float num1, float num2, String sinal) {
        this.num1 = num1;
        this.num2 = num2;
        this.sinal = sinal;
    }
    
    public Calculadora(){}
    
    //Métodos
    public float Calcular(){
        if (sinal.equals("somar")){
            result = num1+num2;
        }else if (sinal.equals("subtrair")){
            result = num1-num2;
        }else if (sinal.equals("dividir")){
            result = num1/num2;
        }else if (sinal.equals("multiplicar")){
            result = num1*num2;
        }
        return result;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "num1=" + num1 + ", num2=" + num2 + ", sinal=" + sinal + '}';
    }
    
    
    
}
