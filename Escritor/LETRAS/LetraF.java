package Escritor.LETRAS;
import Escritor.Letra;

public class LetraF implements Letra {
    public char[][] desenhar() {
        char[][] arr = {
                {'F', 'F', 'F', 'F', 'F'},
                {'F', ' ', ' ', ' ', ' '},
                {'F', 'F', 'F', 'F', ' '},
                {'F', ' ', ' ', ' ', ' '},
                {'F', ' ', ' ', ' ', ' '}
        };
        return arr;
    }
}
