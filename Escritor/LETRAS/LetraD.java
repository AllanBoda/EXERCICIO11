package Escritor.LETRAS;

import Escritor.Letra;

public class LetraD implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'D', 'D', 'D', 'D', ' '},
                {'D', ' ', ' ', ' ', 'D'},
                {'D', ' ', ' ', ' ', 'D'},
                {'D', ' ', ' ', ' ', 'D'},
                {'D', 'D', 'D', 'D', ' '}
        };
        return arr;
    }
}
