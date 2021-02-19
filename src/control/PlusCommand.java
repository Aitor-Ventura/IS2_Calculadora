package control;

import model.Calculadora;

public class PlusCommand implements Command {
    private Calculadora calculadora;

    public PlusCommand(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public void execute(){
        calculadora.Plus();
    }
}
