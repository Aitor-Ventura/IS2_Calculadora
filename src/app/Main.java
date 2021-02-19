package app;

import control.*;
import model.Calculadora;
import view.Display;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private Display display;
    //private Command command;

    public static void main(String[] args) {
        new Main().execute();
    }

    public Main(){
    }

    public void execute(){
        this.display = new MockDisplay();
        List<Calculadora.Observer> observers = new ArrayList<>();

        Calculadora calculadora = new Calculadora(observers, 5, 5);
        Map<String,Command> commands = new HashMap<>();
        commands.put("Suma", new PlusCommand(calculadora));
        commands.put("Restar", new SubstractCommand(calculadora));
        commands.put("Multiplicar", new MultiplyCommand(calculadora));
        commands.put("Dividir", new DivideCommand(calculadora));
        commands.put("Resto", new RemainderCommand(calculadora));
        commands.put("Exponente", new PowCommand(calculadora));

        commands.get("Exponente").execute();
        this.display.display(calculadora);
    }
}
