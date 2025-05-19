public class HondaSistema {
    public static void main(String[] args) {
        ConfiguracaoVeiculo configuracao = new ConfiguracaoVeiculo();
        HistoricoConfiguracoes historico = new HistoricoConfiguracoes(configuracao);

        configuracao.setEstado("Cor: Vermelho | Motor: 2.0 | Transmissão: Automática");
        historico.backup();

        configuracao.setEstado("Cor: Preto | Motor: 1.5 Turbo | Transmissão: CVT");
        historico.backup();

        configuracao.setEstado("Cor: Branco | Motor: Elétrico | Transmissão: Automática");

        System.out.println("\n--- Restaurando última configuração ---");
        historico.restaurar();

        System.out.println("\n--- Restaurando configuração anterior ---");
        historico.restaurar();
    }
}
