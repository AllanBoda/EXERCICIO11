package Escritor.LETRAS;

import Escritor.Letra;

public class LetraN implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'N', 'N', ' ', ' ', 'N'},
                {'N', 'N', ' ', ' ', 'N'},
                {'N', ' ', 'N', ' ', 'N'},
                {'N', ' ', ' ', 'N', 'N'},
                {'N', ' ', ' ', 'N', 'N'}
        };
        return arr;
    }
}
