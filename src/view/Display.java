package view;

import model.Calculadora;

public interface Display extends Calculadora.Observer{
    public void display(Calculadora calculadora);
}
