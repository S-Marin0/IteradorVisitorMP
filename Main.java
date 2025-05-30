/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

import java.util.*;

class PersonaColeccion implements Iterable<Persona> {
    private Collection<Persona> personas;

    PersonaColeccion(Collection<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public Iterator<Persona> iterator() {
        return personas.iterator();
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> telefonos1 = Arrays.asList("123456789");
        List<String> telefonos2 = Arrays.asList();

        Persona estudiante1 = new Estudiante("2023", "Ana Pérez", "Calle 123", telefonos1);
        Persona docente1 = new Docente("1234", "Carlos Ruiz", "Carrera 45", telefonos2);

        Set<Persona> personasSet = new TreeSet<>(Comparator.comparing(p -> p.nombres));
        personasSet.add(estudiante1);
        personasSet.add(docente1);

        PersonaColeccion coleccion = new PersonaColeccion(personasSet);
        ValidadorDatosVisitor validador = new ValidadorDatosVisitor();

        // Iterador y Visitor
        for (Persona persona : coleccion) {
            persona.aceptar(validador);
        }

        System.out.println("Recorrido completo.");
    }
}
