package aplicacion;

public abstract class Formulario {
    
    public abstract CampoTexto crearCampoTexto();

    public void mostrar(){
        crearCampoTexto().dibujar();
    }
}
