package Escritor.LETRAS;

import Escritor.Letra;

public class LetraZ implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'Z', 'Z', 'Z', 'Z', 'Z'},
                {' ', ' ', ' ', ' ', 'Z'},
                {' ', 'Z', 'Z', 'Z', ' '},
                {'Z', ' ', ' ', ' ', ' '},
                {'Z', 'Z', 'Z', 'Z', 'Z'}
        };
        return arr;
    }
}
