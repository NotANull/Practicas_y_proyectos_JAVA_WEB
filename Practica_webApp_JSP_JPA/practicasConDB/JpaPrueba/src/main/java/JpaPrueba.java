
import java.util.Date;
import logica.Alumno;
import logica.Controladora;

public class JpaPrueba {

    public static void main(String[] args) {

        Controladora control = new Controladora();

//        Alumno alu = new Alumno(15, "Omar", "Salum", new Date());
//        control.crearAlumno(alu);
        
//        control.eliminarAlumno(5);
//        alu.setNombre("Sofía");
//        alu.setApellido("Peralta");
//        control.editarAlumno(alu);

        System.out.println("Alumno: \n" + control.traerAlumno(28));
        System.out.println("Lista de Alumnos: \n" + control.traerListaAlumnos());
    }
}
