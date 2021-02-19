package control;

import model.Calculadora;

public class MultiplyCommand implements Command {
    private Calculadora calculadora;

    public MultiplyCommand(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public void execute(){
        calculadora.Multiply();
    }
}
