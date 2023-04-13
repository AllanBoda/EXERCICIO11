package Escritor.LETRAS;

import Escritor.Letra;

public class LetraE implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'E', 'E', 'E', 'E', 'E'},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E', ' '},
                {'E', ' ', ' ', ' ', ' '},
                {'E', 'E', 'E', 'E', 'E'}
        };
        return arr;
    }
}
