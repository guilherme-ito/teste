package biblioteca.controllers;

import java.util.List;

import biblioteca.models.allMembros.*;
import biblioteca.views.MembroView;

public interface MembroController {
    List<Membro> listarMembros();
    Membro buscarMembroPorIdentificacao(String identificacao);
}