import java.util.Scanner;

public class Materia {

    private String nombre = "";
    private String codigo = "";
    private int numHoras = 0;
    Profesor profesor1;
    Profesor profesor2;
    Profesor profesor3;

    public Materia(){

    }

    public Materia(String nombre, String codigo, int numHoras, Profesor profesor1, Profesor profesor2, Profesor profesor3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numHoras = numHoras;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.profesor3 = profesor3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public Profesor getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(Profesor profesor1) {
        this.profesor1 = profesor1;
    }

    public Profesor getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(Profesor profesor2) {
        this.profesor2 = profesor2;
    }

    public Profesor getProfesor3() {
        return profesor3;
    }

    public void setProfesor3(Profesor profesor3) {
        this.profesor3 = profesor3;
    }

    public void ingresarProfesor(int i){
        if (i == 1){
            profesor1 = new Profesor();
            profesor1.ingresarDatosProfesor(i);
        }else if (i == 2){
            profesor2 = new Profesor();
            profesor2.ingresarDatosProfesor(i);
        }else{
            profesor3 = new Profesor();
            profesor3.ingresarDatosProfesor(i);
        }
    }

    public void ingresarDatosMateria(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la materia: "+i);
        this.nombre = sc.next();
        System.out.println("Ingrese el codigo de la materia: "+i);
        this.codigo = sc.next();
        System.out.println("Ingrese el numero de horas: "+i);
        this.numHoras = sc.nextInt();
        ingresarProfesor(i);
    }

    public void imprimirDatosMateria (int i){
        System.out.println("El nombre de la materia es: "+nombre);
        System.out.println("El codigo de la materia es: "+codigo);
        System.out.println("El numero de Horas de la materia es: "+numHoras);
        profesor1.imprimirDatosProfesor();
        profesor2.imprimirDatosProfesor();
        profesor3.imprimirDatosProfesor();
        System.out.println("--------------------------------------------------------------");
    }
}
