public class RodarAplicacao {
    public static void main(String[] args) throws Exception {
        
        Funcionario funcionario = new Funcionario();

        // UpCasting
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // DownCasting
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
