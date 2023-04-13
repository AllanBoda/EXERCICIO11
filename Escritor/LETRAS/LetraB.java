package Escritor.LETRAS;

import Escritor.Letra;

public class LetraB implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'B', 'B', 'B', 'B', 'B'},
                {'B', ' ', ' ', ' ', 'B'},
                {'B', 'B', 'B', 'B', ' '},
                {'B', ' ', ' ', ' ', 'B'},
                {'B', 'B', 'B', 'B', 'B'}
        };
        return arr;
    }
}
