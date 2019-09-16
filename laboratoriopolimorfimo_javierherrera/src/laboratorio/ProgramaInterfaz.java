
package laboratorio;

public class ProgramaInterfaz {

    public static void main(String arg[]) {
        
        
                Persona pavaroti = new Persona();

                hacerCantar(pavaroti);

                Canario piolin = new Canario();

                hacerCantar(piolin);

                Burro david = new Burro();

                hacerCantar(david);
    }

    public static void hacerCantar(PuedeCantar cantor) {
        
        cantor.cantar();
    }
}
