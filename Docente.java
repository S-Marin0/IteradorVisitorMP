/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

import java.util.List;


class Docente extends Persona {
    Docente(String codigo, String nombres, String direccion, List<String> telefonos) {
        super(codigo, nombres, direccion, telefonos);
        if (codigo.length() > 4) {
            throw new IllegalArgumentException("El codigo del docente debe tener máximo 4 dígitos");
        }
    }

    @Override
    void aceptar(PersonaVisitor visitor) {
        visitor.visitarDocente(this);
    }
}
