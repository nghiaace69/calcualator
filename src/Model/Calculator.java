/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class Calculator {
   private double a,b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public double xuLy(char s,double a,double b){
    
        switch(s){
            case '+': return a+b;
            case '-': return a-b;
            case 'x': return a*b;
            case '/':
                if (b == 0.0) {
                    throw new ArithmeticException("Division by 0");
                    
                }
                else return a/b;
        
        }
        return 0;
    }

    public Calculator() {
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
}
