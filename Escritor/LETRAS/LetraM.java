package Escritor.LETRAS;

import Escritor.Letra;

public class LetraM implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'M', 'M', ' ', 'M', 'M'},
                {'M', 'M', ' ', 'M', 'M'},
                {'M', ' ', 'M', ' ', 'M'},
                {'M', ' ', ' ', ' ', 'M'},
                {'M', ' ', ' ', ' ', 'M'}
        };
        return arr;
    }
}
