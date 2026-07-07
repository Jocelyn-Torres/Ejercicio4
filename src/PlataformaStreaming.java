import java.util.ArrayList;

public class PlataformaStreaming {

    private ArrayList<CuentaUsuario> usuarios;

    public PlataformaStreaming(ArrayList<CuentaUsuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void registrarUsuarios(CuentaUsuario u){
        usuarios.add(u);
    }



}
