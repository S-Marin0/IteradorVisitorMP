/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;


import java.util.*;

class ValidadorDatosVisitor implements PersonaVisitor {
    @Override
    public void visitarEstudiante(Estudiante estudiante) {
        if (!estudiante.datosCompletos()) {
            System.out.println("Estudiante con codigo " + estudiante.codigo + " tiene datos incompletos.");
        }
    }

    @Override
    public void visitarDocente(Docente docente) {
        if (!docente.datosCompletos()) {
            System.out.println("Docente con codigo " + docente.codigo + " tiene datos incompletos.");
        }
    }
}

class MostrarInformacionVisitor implements PersonaVisitor {
    @Override
    public void visitarEstudiante(Estudiante estudiante) {
        System.out.println("Estudiante: " + estudiante.nombres + ", Direccion: " + estudiante.direccion);
    }

    @Override
    public void visitarDocente(Docente docente) {
        System.out.println("Docente: " + docente.nombres + ", Direccion: " + docente.direccion);
    }
}
