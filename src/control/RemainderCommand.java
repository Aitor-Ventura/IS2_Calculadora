package control;

import model.Calculadora;

public class RemainderCommand implements Command {
    private Calculadora calculadora;

    public RemainderCommand(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    @Override
    public void execute(){
        calculadora.Remainder();
    }
}
