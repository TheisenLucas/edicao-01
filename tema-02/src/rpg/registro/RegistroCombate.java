package rpg.registro;

import java.util.ArrayList;
import java.util.List;

public class RegistroCombate {

    private static List<String> registros = new ArrayList<>();

    public void registrar(String registro) {
        registros.add(registro);
    }

    public void imprimir() {
        for(String registro : registros) {
            System.out.println(registro);
        }
    }
}
