package org.alistabrasil.services;
import org.alistabrasil.models.Usuario;
import java.util.List;
import java.util.ArrayList;

public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public boolean cadastrarUsuario(Usuario usuario){
        for (Usuario u : usuarios) {
            if(u.getCpf().equals(usuario.getCpf())){
                return false;
            }
        }

        usuarios.add(usuario);

        return true;
    }

    public Usuario login(String email, String senha){
        for (Usuario u : usuarios) {
            if(u.getEmail().equals(email) && u.getSenha().equals(senha)){
                return u;
            }
        }

        return null;
    }

    public Usuario buscarCpf(String cpf){
        for (Usuario u : usuarios) {
            if(u.getCpf().equals(cpf)){
                return u;
            }
        }

        return null;
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}

