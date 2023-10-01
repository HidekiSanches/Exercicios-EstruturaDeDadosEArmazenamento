import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    List<Bonus> bonus;

    public ControleBonus() {
        this.bonus = new ArrayList<>();
    }

    public void addBonus(Bonus b) {
        bonus.add(b);
    }

    public void exibirBonus() {
        for(Bonus bonu: bonus){
            System.out.println("=====================");
            System.out.println(bonu);
        }
        System.out.println("=====================");
    }
}
