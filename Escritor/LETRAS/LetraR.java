package Escritor.LETRAS;

import Escritor.Letra;

public class LetraR implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'R', 'R', 'R', 'R', 'R'},
                {'R', ' ', ' ', ' ', 'R'},
                {'R', 'R', 'R', 'R', 'R'},
                {'R', ' ', 'R', ' ', ' '},
                {'R', ' ', ' ', 'R', 'R'}
        };
        return arr;
    }
}
