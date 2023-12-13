
package sobreescrituraysobrecarga;

/**
 * @author Joseph Magallanes
 */
public class Animal {
    
    // entendiendo la sobrecarga
    
    private int id_animal;
    private String descripcion;
    
    //constructores
    
    //métodos getters y setters
    
    //otros métodos
    // Sobrecarga cuando existen varios método con el mismo nombre, pero
    // estos son usados por la cantidad de parametros que se usan.
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal) {
        System.out.println("El animal " + nombreAnimal + " hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal, String tipoSonido) {
        System.out.println("El animal " + nombreAnimal + " hace un sonido de tipo " + tipoSonido);
    }
}
