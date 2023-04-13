package Escritor.LETRAS;

import Escritor.Letra;

public class LetraX implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'X', ' ', ' ', ' ', 'X'},
                {' ', 'X', ' ', 'X', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', 'X', ' '},
                {'X', ' ', ' ', ' ', 'X'}
        };
        return arr;
    }
}
