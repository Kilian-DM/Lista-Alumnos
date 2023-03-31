package listaalumnos;

import javax.swing.JOptionPane;

public class alumno {

    private String nombre1;
    private int codigo1;
    private int edad1;
    private String nombre2;
    private int codigo2;
    private int edad2;
    private String nombre3;
    private int codigo3;
    private int edad3;

    public alumno() {
        nombre1 = "";
        codigo1 = 0;
        edad1 = 0;
        nombre2 = "";
        codigo2 = 0;
        edad2 = 0;
        nombre3 = "";
        codigo3 = 0;
        edad3 = 0;

    }

    public alumno(String nombre1, String nombre2, String nombre3, int edad1, int edad2, int edad3, int codigo1, int codigo2, int codigo3) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
        this.edad1 = edad1;
        this.edad2 = edad2;
        this.edad3 = edad3;
        this.codigo1 = codigo1;
        this.codigo2 = codigo2;
        this.codigo3 = codigo3;

    }

    public String getnombre1() {
        return nombre1;
    }

    public void setnombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public int getcodigo1() {
        return codigo1;
    }

    public void setcodigo1(int codigo1) {
        this.codigo1 = codigo1;
    }

    public int getedad1() {
        return edad1;
    }

    public void setedad1(int edad1) {
        this.edad1 = edad1;
    }

    public String getnombre2() {
        return nombre2;
    }

    public void setnombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getcodigo2() {
        return codigo2;
    }

    public void setcodigo2(int codigo2) {
        this.codigo2 = codigo2;
    }

    public int getedad2() {
        return edad2;
    }

    public void setedad2(int edad2) {
        this.edad2 = edad2;
    }

    public String getnombre3() {
        return nombre3;
    }

    public void setnombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public int getcodigo3() {
        return codigo3;
    }

    public void setcodigo3(int codigo3) {
        this.codigo3 = codigo3;
    }

    public int getedad3() {
        return edad3;
    }

    public void setedad3(int edad3) {
        this.edad3 = edad3;
    }

    public void mostardatos() {
        JOptionPane.showMessageDialog(null, "Datos del Estudiante:  \n" + "Codigo: " + codigo1 + "\n" + " Nombre: " + nombre1 + "\n" + " Edad: " + edad1);
        JOptionPane.showMessageDialog(null, "Datos del Estudiante:  \n" + "Codigo: " + codigo2 + "\n" + " Nombre: " + nombre2 + "\n" + " Edad: " + edad2);
        JOptionPane.showMessageDialog(null, "Datos del Estudiante:  \n" + "Codigo: " + codigo3 + "\n" + " Nombre: " + nombre3 + "\n" + " Edad: " + edad3);

    }

    public void alumnomayor() {
        if (edad1 >= 18) {
            JOptionPane.showMessageDialog(null, "El estudiante es mayor de edad:  \n" + "Codigo: " + codigo1 + "\n" + " Nombre: " + nombre1 + "\n" + " Edad: " + edad1);
        }
        if (edad2 >= 18) {
            JOptionPane.showMessageDialog(null, "El estudiante es mayor de edad:  \n" + "Codigo: " + codigo2 + "\n" + " Nombre: " + nombre2 + "\n" + " Edad: " + edad2);
        }
        if (edad3 >= 18) {
            JOptionPane.showMessageDialog(null, "El estudiante es mayor de edad:  \n" + "Codigo: " + codigo3 + "\n" + " Nombre: " + nombre3 + "\n" + " Edad: " + edad3);
        }

    }
}
