package Escritor.LETRAS;

import Escritor.Letra;

public class LetraQ implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {' ', 'Q', 'Q', ' ', ' '},
                {'Q', ' ', ' ', 'Q', ' '},
                {'Q', ' ', 'Q', 'Q', ' '},
                {'Q', ' ', ' ', 'Q', ' '},
                {' ', 'Q', 'Q', 'Q', 'Q'}
        };
        return arr;
    }
}
