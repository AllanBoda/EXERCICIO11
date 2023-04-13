package Escritor.LETRAS;

import Escritor.Letra;

public class LetraL implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', 'L', 'L', 'L', 'L'}
        };
        return arr;
    }
}
