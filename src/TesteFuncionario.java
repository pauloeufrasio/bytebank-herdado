public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionarioPaulo = new Funcionario();

        funcionarioPaulo.setNome("Paulo");
        funcionarioPaulo.setCpf("459.638.908-02");
        funcionarioPaulo.setSalario(2600.00);

        System.out.println(funcionarioPaulo.getNome());
        System.out.println("Sua bonificação é de: " +funcionarioPaulo.getBonificacao());
        System.out.println(funcionarioPaulo.getCpf());



    }
}