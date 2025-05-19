import java.util.ArrayList;
import java.util.List;

public class HistoricoConfiguracoes {
    private final ConfiguracaoVeiculo configuracao;
    private final List<Memento> historico = new ArrayList<>();

    public HistoricoConfiguracoes(ConfiguracaoVeiculo configuracao) {
        this.configuracao = configuracao;
    }

    public void backup() {
        System.out.println("Salvando configuração...");
        historico.add(configuracao.salvar());
    }

    public void restaurar() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma configuração para restaurar.");
            return;
        }
        Memento memento = historico.remove(historico.size() - 1);
        configuracao.restaurar(memento);
    }
}
