package Escritor.LETRAS;

import Escritor.Letra;

public class LetraS implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'S', 'S', 'S', 'S', 'S'},
                {'S', ' ', ' ', ' ', ' '},
                {'S', 'S', 'S', 'S', 'S'},
                {' ', ' ', ' ', ' ', 'S'},
                {'S', 'S', 'S', 'S', 'S'}
        };
        return arr;
    }
}
