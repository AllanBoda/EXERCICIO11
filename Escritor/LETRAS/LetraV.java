package Escritor.LETRAS;

import Escritor.Letra;

public class LetraV implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'V', ' ', ' ', ' ', 'V'},
                {'V', ' ', ' ', ' ', 'V'},
                {'V', ' ', ' ', ' ', 'V'},
                {' ', 'V', ' ', 'V', ' '},
                {' ', ' ', 'V', ' ', ' '}
        };
        return arr;
    }
}
