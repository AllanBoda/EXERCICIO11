package Escritor.LETRAS;

import Escritor.Letra;

public class LetraK implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', ' ', ' ', ' ', 'A'}
        };
        return arr;
    }
}
