package Escritor.LETRAS;

import Escritor.Letra;

public class LetraJ implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {' ', ' ', 'J', 'J', 'J'},
                {' ', ' ', ' ', ' ', 'J'},
                {' ', ' ', ' ', ' ', 'J'},
                {'J', ' ', ' ', ' ', 'J'},
                {'J', 'J', 'J', 'J', 'J'}
        };
        return arr;
    }
}
