package Escritor.LETRAS;

import Escritor.Letra;

public class LetraY implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'Y', ' ', ' ', ' ', 'Y'},
                {'Y', ' ', ' ', ' ', 'Y'},
                {' ', 'Y', ' ', 'Y', ' '},
                {' ', ' ', 'Y', ' ', ' '},
                {' ', ' ', 'Y', ' ', ' '}
        };
        return arr;
    }
}
