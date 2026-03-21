package org.alistabrasil.sistema;
import java.util.Scanner;
import org.alistabrasil.models.Usuario;
import org.alistabrasil.services.UsuarioService;

public class AlistaBrasilSistema {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        UsuarioService service = new UsuarioService();
        Usuario u1 = new Usuario("05970459178", "Julio César", "02/12/2006", "jcesarsdl@gmail.com", "123456788");

        service.cadastrarUsuario(u1);

        Usuario logado = service.login("jcesarsdl@gmail.com", "123456788");

        if(logado != null){
            System.out.println("Login realizado!");
        } else {
            System.out.println("Erro no Login");
        }

        System.out.println(u1.toString());

    }
}
