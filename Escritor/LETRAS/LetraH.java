package Escritor.LETRAS;

import Escritor.Letra;

public class LetraH implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'H', ' ', ' ', ' ', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
                {'H', 'H', 'H', 'H', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
                {'H', ' ', ' ', ' ', 'H'}
        };
        return arr;
    }
}
