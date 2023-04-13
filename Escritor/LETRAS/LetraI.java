package Escritor.LETRAS;

import Escritor.Letra;

public class LetraI implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'I', 'I', 'I', 'I', 'I'},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {'I', 'I', 'I', 'I', 'I'}
        };
        return arr;
    }
}
