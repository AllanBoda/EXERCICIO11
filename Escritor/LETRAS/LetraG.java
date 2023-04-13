package Escritor.LETRAS;

import Escritor.Letra;

public class LetraG implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'G', 'G', 'G', 'G', 'G'},
                {'G', ' ', ' ', ' ', ' '},
                {'G', ' ', 'G', 'G', 'G'},
                {'G', ' ', ' ', ' ', 'G'},
                {'G', 'G', 'G', 'G', 'G'}
        };
        return arr;
    }
}
