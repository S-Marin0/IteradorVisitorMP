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
        List<String> telefonos3 = Arrays.asList("987654321");

        Persona estudiante1 = new Estudiante("2023", "Ana Pérez", "Calle 123", telefonos1);
        Persona docente1 = new Docente("1234", "Carlos Ruiz", "Carrera 45", telefonos2);
        Persona estudiante2 = new Estudiante("2024", "Beatriz Gómez", "Avenida 5", telefonos3);
        
        Set<Persona> personasSetNombre = new TreeSet<>(Comparator.comparing(p -> p.nombres));
        personasSetNombre.add(estudiante1);
        personasSetNombre.add(docente1);
        personasSetNombre.add(estudiante2);

        PersonaColeccion coleccionNombre = new PersonaColeccion(personasSetNombre);
        
        Set<Persona> personasSetCodigo = new TreeSet<>(Comparator.comparing(p -> p.codigo));
        personasSetCodigo.add(estudiante1);
        personasSetCodigo.add(docente1);
        personasSetCodigo.add(estudiante2);

        PersonaColeccion coleccionCodigo = new PersonaColeccion(personasSetCodigo);

        ValidadorDatosVisitor validador = new ValidadorDatosVisitor();
        MostrarInformacionVisitor mostrar = new MostrarInformacionVisitor();

        System.out.println("Primer recorrido (por nombre): Validar datos y mostrar información");
        for (Persona persona : coleccionNombre) {
            persona.aceptar(validador);
            persona.aceptar(mostrar);
        }

        System.out.println("\nSegundo recorrido (por código): Mostrar información");
        for (Persona persona : coleccionCodigo) {
            persona.aceptar(mostrar);
        }

        System.out.println("\nRecorridos completos.");
    }
}
