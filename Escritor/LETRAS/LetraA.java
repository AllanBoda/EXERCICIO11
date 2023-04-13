package Escritor.LETRAS;

import Escritor.Letra;

public class LetraA implements Letra {
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
