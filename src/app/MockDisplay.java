package app;

import model.Calculadora;
import view.Display;

public class MockDisplay implements Display {
    private Calculadora calculadora;

    @Override
    public void display(Calculadora calculadora){
        this.calculadora = calculadora;
        System.out.println(this.calculadora.toString());
    }

    @Override
    public void update(Calculadora calculadora){
        this.calculadora = calculadora;
    }

}
