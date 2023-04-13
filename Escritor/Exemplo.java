package Escritor;

import Escritor.LETRAS.*;
import Escritor.LETRAS.LetraDesconhecida;

import java.util.HashMap;
import java.util.Map;

public class Exemplo {
    public static void main(String[] args) {
        Map<Character, Letra> letras = new HashMap<>();
        letras.put('A', new LetraA());
        letras.put('B', new LetraB());
        letras.put('C', new LetraC());
        letras.put('E', new LetraE());
        letras.put('F', new LetraF());
        letras.put('G', new LetraG());
        letras.put('H', new LetraH());
        letras.put('I', new LetraI());
        letras.put('J', new LetraJ());
        letras.put('K', new LetraK());
        letras.put('L', new LetraL());
        letras.put('M', new LetraM());
        letras.put('N', new LetraN());
        letras.put('O', new LetraO());
        letras.put('P', new LetraP());
        letras.put('Q', new LetraQ());
        letras.put('R', new LetraR());
        letras.put('S', new LetraS());
        letras.put('T', new LetraT());
        letras.put('U', new LetraU());
        letras.put('V', new LetraV());
        letras.put('W', new LetraW());
        letras.put('X', new LetraX());
        letras.put('Y', new LetraY());
        letras.put('X', new LetraZ());
        letras.put('?', new LetraDesconhecida());

        Escreve escritor = new Escreve(letras);
        escritor.escreverPalavra("LUCAS DANIEL GOMES E UM BUNDA MOLE");
    }
}
