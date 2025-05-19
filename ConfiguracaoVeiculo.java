public class ConfiguracaoVeiculo {
    private String estado;

    public void setEstado(String estado) {
        this.estado = estado;
        System.out.println("Configuração atual: " + estado);
    }

    public Memento salvar() {
        return new ConfiguracaoMemento(estado);
    }

    public void restaurar(Memento memento) {
        if (memento instanceof ConfiguracaoMemento) {
            this.estado = ((ConfiguracaoMemento) memento).getEstado();
            System.out.println("Configuração restaurada: " + estado);
        }
    }
}