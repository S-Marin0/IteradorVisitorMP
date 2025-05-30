/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

import java.util.List;


class Estudiante extends Persona {
    Estudiante(String codigo, String nombres, String direccion, List<String> telefonos) {
        super(codigo, nombres, direccion, telefonos);
    }

    @Override
    void aceptar(PersonaVisitor visitor) {
        visitor.visitarEstudiante(this);
    }
}