/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

import java.util.*;

abstract class Persona {
    String codigo;
    String nombres;
    String direccion;
    List<String> telefonos;

    Persona(String codigo, String nombres, String direccion, List<String> telefonos) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    abstract void aceptar(PersonaVisitor visitor);

    boolean datosCompletos() {
        return codigo != null && nombres != null && direccion != null && !telefonos.isEmpty();
    }
}
