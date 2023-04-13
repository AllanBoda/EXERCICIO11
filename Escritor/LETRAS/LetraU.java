package Escritor.LETRAS;

import Escritor.Letra;

public class LetraU implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {' ', 'U', 'U', 'U', ' '}
        };
        return arr;
    }
}
