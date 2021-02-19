package control;

import model.Calculadora;

public class SubstractCommand implements Command {
    private Calculadora calculadora;

    public SubstractCommand(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public void execute(){
        calculadora.Substract();
    }
}
