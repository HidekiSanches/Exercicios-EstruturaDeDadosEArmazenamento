public class Main {
    public static void main(String[] args) {
        Coordenador coordenador = new Coordenador("11122233344", "Hideki", 300, 300.0, 30);
        Professor professor = new Professor("22233344455", "Sasaoka", 5, 300.0);
        Secretario secretario = new Secretario("33344455566", "Thiago", 2400.0, 1000.0);

        ControleBonus controle = new ControleBonus();
        Escola escola = new Escola();

        System.out.println("""
                =====================
                ESCOLA
                =====================
                """);
        escola.addFuncionario(coordenador);
        escola.addFuncionario(professor);
        escola.addFuncionario(secretario);

        escola.exibirFuncionarios();
        System.out.println("""
                =====================
                CONTROLE BONUS
                =====================
                """);
        controle.addBonus(coordenador);
        controle.addBonus(professor);

        controle.exibirBonus();
    }
}
