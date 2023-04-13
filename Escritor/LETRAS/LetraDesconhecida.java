package Escritor.LETRAS;

import Escritor.Letra;

public class LetraDesconhecida implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'?', '?', '?'},
                {'?', ' ', '?'},
                {'?', '?', '?'},
                {' ', '?', ' '},
                {' ', '?', ' '},
        };
        return arr;
    }
}
