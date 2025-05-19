import java.util.Date;

public class ConfiguracaoMemento implements Memento {
    private final String estado;
    private final Date data;

    public ConfiguracaoMemento(String estado) {
        this.estado = estado;
        this.data = new Date();
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String getNome() {
        return "Configuração salva em: " + data.toString();
    }

    @Override
    public Date getData() {
        return data;
    }
}