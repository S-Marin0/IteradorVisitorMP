/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;


import java.util.*;

public class ValidadorDatosVisitor implements PersonaVisitor {
    @Override
    public void visitarEstudiante(Estudiante estudiante) {
        if (!estudiante.datosCompletos()) {
            System.out.println("Estudiante con código " + estudiante.codigo + " tiene datos incompletos.");
        }
    }

    @Override
    public void visitarDocente(Docente docente) {
        if (!docente.datosCompletos()) {
            System.out.println("Docente con código " + docente.codigo + " tiene datos incompletos.");
        }
    }
}

public class MostrarInformacionVisitor implements PersonaVisitor {
    @Override
    public void visitarEstudiante(Estudiante estudiante) {
        System.out.println("Estudiante: " + estudiante.nombres + ", Dirección: " + estudiante.direccion);
    }

    @Override
    public void visitarDocente(Docente docente) {
        System.out.println("Docente: " + docente.nombres + ", Dirección: " + docente.direccion);
    }
}
