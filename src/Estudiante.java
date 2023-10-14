import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private String cedula;
    private String matricula;

    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    public Estudiante(){

    }

    public Estudiante(String nombre, String cedula, String matricula, Materia materia1, Materia materia2, Materia materia3) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.matricula = matricula;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Materia getMateria1() {
        return materia1;
    }

    public void setMateria1(Materia materia1) {
        this.materia1 = materia1;
    }

    public Materia getMateria2() {
        return materia2;
    }

    public void setMateria2(Materia materia2) {
        this.materia2 = materia2;
    }

    public Materia getMateria3() {
        return materia3;
    }

    public void setMateria3(Materia materia3) {
        this.materia3 = materia3;
    }

    public void imprimirMaterias(){
        System.out.println("La materia 1 es: "+materia1.getNombre());
        System.out.println("La materia 2 es: "+materia2.getNombre());
        System.out.println("La materia 3 es: "+materia3.getNombre());
    }

    public void imprimirTodosProfesoress(){
        String nomMateria1Profesor1 = materia1.getProfesor1().getNombre();
        System.out.println("El nombre del profesor 1 de la materia: "+materia1.getNombre()+ "es: "+nomMateria1Profesor1);
        String nomMateria2Profesor2 = materia2.getProfesor2().getNombre();
        System.out.println("El nombre del profesor 2 de la materia: "+materia2.getNombre()+ "es: "+nomMateria2Profesor2);
        String nomMateria3Profesor3 = materia3.getProfesor3().getNombre();
        System.out.println("El nombre del profesor 3 de la materia: "+materia3.getNombre()+ "es: "+nomMateria3Profesor3);
    }

    public void ingresarDatosEstudiante(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante "+i);
        this.nombre = sc.next();
        System.out.println("Ingrese la cedula del estudiante "+i);
        this.cedula = sc.next();
        System.out.println("Ingrese la matricula del estudiante "+i);
        this.matricula = sc.next();
    }

    public void ingresarMateria(){
        materia1 = new Materia();
        materia1.ingresarDatosMateria(1);
        materia2 = new Materia();
        materia2.ingresarDatosMateria(2);
        materia3 = new Materia();
        materia3.ingresarDatosMateria(3);
    }

    public void imprimirInfoEstudiante (){
        System.out.println("--------------------------------------------------------------");
        System.out.println("ESTUDIANTE: "+nombre);
        System.out.println("CEDULA:     "+cedula);
        System.out.println("MATRICULA:  "+matricula);
        materia1.imprimirDatosMateria(1);
        materia2.imprimirDatosMateria(2);
        materia3.imprimirDatosMateria(3);

    }
}
