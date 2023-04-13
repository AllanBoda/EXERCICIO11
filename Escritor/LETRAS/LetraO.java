package Escritor.LETRAS;

import Escritor.Letra;

public class LetraO implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {' ', 'O', 'O', 'O', ' '},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {' ', 'O', 'O', 'O', ' '}
        };
        return arr;
    }
}
