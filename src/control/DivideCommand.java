package control;

import model.Calculadora;

public class DivideCommand implements Command {
    private Calculadora calculadora;

    public DivideCommand(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public void execute(){
        calculadora.Divide();
    }
}
