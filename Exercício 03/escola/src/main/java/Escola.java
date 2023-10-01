import java.util.ArrayList;
import java.util.List;

public class Escola {

    List<Funcionario> funcionarios;

    public Escola() {
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void exibirFuncionarios() {
        for (Funcionario funcionario: funcionarios) {
            System.out.println("=====================");
            System.out.println(funcionario);
        }
        System.out.println("=====================");
    }
}
