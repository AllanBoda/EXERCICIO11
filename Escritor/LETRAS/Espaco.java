package Escritor.LETRAS;

import Escritor.Letra;

public class Espaco implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '}
        };
        return arr;
    }
}
