package Escritor;
import Escritor.LETRAS.*;

import java.util.HashMap;
import java.util.Map;

public class Escreve {
    private final HashMap<Character, Letra> letras = new HashMap<>();

    public Escreve(Map<Character, Letra> letras) {
        this.letras.put('A', new LetraA());
        this.letras.put('B', new LetraB());
        this.letras.put('C', new LetraC());
        this.letras.put('D', new LetraD());
        this.letras.put('E', new LetraE());
        this.letras.put('F', new LetraF());
        this.letras.put('G', new LetraG());
        this.letras.put('H', new LetraH());
        this.letras.put('I', new LetraI());
        this.letras.put('J', new LetraJ());
        this.letras.put('K', new LetraK());
        this.letras.put('L', new LetraL());
        this.letras.put('M', new LetraM());
        this.letras.put('N', new LetraN());
        this.letras.put('O', new LetraO());
        this.letras.put('P', new LetraP());
        this.letras.put('Q', new LetraQ());
        this.letras.put('R', new LetraR());
        this.letras.put('S', new LetraS());
        this.letras.put('T', new LetraT());
        this.letras.put('U', new LetraU());
        this.letras.put('V', new LetraV());
        this.letras.put('W', new LetraW());
        this.letras.put('X', new LetraX());
        this.letras.put('Y', new LetraY());
        this.letras.put('Z', new LetraZ());
        this.letras.put(' ', new Espaco());
        this.letras.put('?', new LetraDesconhecida());
        // Adicionar outras letras
    }

    public void escreverPalavra(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            Letra letraObj = letras.getOrDefault(letra, new LetraDesconhecida());
            char[][] arr = letraObj.desenhar();
            escrever(arr);
        }
    }

    private void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

