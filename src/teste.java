
public class teste {
    public static void main(String[] args) {

        FuncionarioTeste funcionario = new FuncionarioTeste();
        funcionario.setSalario(3000.00);
        System.out.println(funcionario.getTipo());
        System.out.println("Sua bonificação " +funcionario.getBonificacao());

        FuncionarioTeste f2 = new FuncionarioTeste();
        f2.setTipo(1);
        f2.setSalario(5000.00);
        System.out.println(f2.getTipo());
        System.out.println("Sua bonificação " + f2.getBonificacao());


    }

}
