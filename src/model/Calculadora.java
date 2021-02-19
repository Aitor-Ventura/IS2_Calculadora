package model;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    private List<Observer> observers = new ArrayList<>();
    private int a, b, result;

    public Calculadora(List<Observer> observers, int a, int b) {
        this.observers = observers;
        this.a = a;
        this.b = b;
        this.result = 1;
    }

    public Calculadora(List<Observer> observers) {
        this.observers = observers;
        this.a = 1;
        this.b = 5;
        this.result = 1;
    }

    public void Plus(){
        result = a+b;
        notificar();
    }

    public void Substract(){
        result = a-b;
        notificar();
    }

    public void Multiply(){
        result = a*b;
        notificar();
    }

    public void Divide(){
        result = a/b;
        notificar();
    }

    public void Remainder(){
        result = a%b;
        notificar();
    }

    public void Pow(){
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        notificar();
    }

    public interface Observer {
        public void update(Calculadora calculadora);
    }

    private void notificar(){
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public String toString() {
        return "a= "+ a + " b= " + b + " result= " + result;
    }
}
