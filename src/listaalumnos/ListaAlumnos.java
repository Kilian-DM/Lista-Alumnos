package listaalumnos;

//@author Kilian Diaz
import javax.swing.JOptionPane;

public class ListaAlumnos {

    public static void main(String[] args) {
        int edad1, edad2, edad3, codigo1, codigo2, codigo3;
        String nombre1, nombre2, nombre3;

        nombre1 = JOptionPane.showInputDialog(null, "Ingrese el Nombre");
        edad1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Edad"));
        codigo1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Codigo"));

        nombre2 = JOptionPane.showInputDialog(null, "Ingrese el Nombre");
        edad2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Edad"));
        codigo2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Codigo"));

        nombre3 = JOptionPane.showInputDialog(null, "Ingrese el Nombre");
        edad3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Edad"));
        codigo3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Codigo"));

        alumno alumnos = new alumno(nombre1, nombre2, nombre3, edad1, edad2, edad3, codigo1, codigo2, codigo3);
        alumnos.mostardatos();
        alumno alumnomayor1 = new alumno(nombre1, nombre2, nombre3, edad1, edad2, edad3, codigo1, codigo2, codigo3);
        alumnomayor1.alumnomayor();

    }

}
