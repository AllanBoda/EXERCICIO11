package Escritor.LETRAS;

import Escritor.Letra;

public class LetraP implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'P', 'P', 'P', 'P', 'P'},
                {'P', ' ', ' ', ' ', 'P'},
                {'P', 'P', 'P', 'P', 'P'},
                {'P', ' ', ' ', ' ', ' '},
                {'P', ' ', ' ', ' ', ' '}
        };
        return arr;
    }
}
