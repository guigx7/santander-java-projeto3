public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        System.out.println("\nFunções de reprodutor musical:");
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();

        System.out.println("\nFunções de aparelho telefônico:");
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println("\nFunções de navegador na internet:");
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
