package org.alistabrasil.sistema;
import org.alistabrasil.models.Usuario;

public class AlistaBrasilSistema {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Usuario user = new Usuario(20);

        System.out.println(user.getIdade());
    }
}
