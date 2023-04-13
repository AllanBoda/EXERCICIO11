package Escritor.LETRAS;

import Escritor.Letra;

public class LetraT implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'T', 'T', 'T', 'T', 'T'},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '}
        };
        return arr;
    }
}
