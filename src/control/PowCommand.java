package control;

import model.Calculadora;

public class PowCommand implements Command {
    private Calculadora calculadora;

    public PowCommand(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public void execute(){
        calculadora.Pow();
    }
}
