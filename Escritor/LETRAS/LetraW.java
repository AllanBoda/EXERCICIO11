package Escritor.LETRAS;

import Escritor.Letra;

public class LetraW implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'W', ' ', ' ', ' ', 'W'},
                {'W', ' ', ' ', ' ', 'W'},
                {'W', ' ', 'W', ' ', 'W'},
                {'W', 'W', ' ', 'W', 'W'},
                {'W', 'W', ' ', 'W', 'W'}
        };
        return arr;
    }
}
