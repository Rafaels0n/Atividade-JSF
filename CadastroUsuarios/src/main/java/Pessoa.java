import java.io.Serializable;


public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String enviar() {
        System.out.println("Nome enviado: " + nome);
        return null; 
    }
}