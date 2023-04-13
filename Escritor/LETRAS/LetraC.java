package Escritor.LETRAS;

import Escritor.Letra;

public class LetraC implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'C', 'C', 'C', 'C', 'C'},
                {'C', ' ', ' ', ' ', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {'C', ' ', ' ', ' ', ' '},
                {'C', 'C', 'C', 'C', 'C'}
        };
        return arr;
    }
}
