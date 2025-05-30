package visitor;

import java.util.*;

interface PersonaVisitor {
    void visitarEstudiante(Estudiante estudiante);
    void visitarDocente(Docente docente);
}
