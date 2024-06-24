public class PessoaFisica extends Cliente{

    protected String cpf;
    protected int idade;
    protected char sexo;



    int getIdade(){
        return this.idade;
    }

    int setIdade(int idade){
        this.idade = idade;
        return this.idade;
    }

    char getSexo(){
        return this.sexo;
    }

    char setSexo(char sexo){
        this.sexo = sexo;
        return this.sexo;
    }

    String getCpf(){
        return this.cpf;
    }

    static PessoaFisica criarPessoaFisica(String nome, String cpf, String endereco, int idade, char sexo){
        return new PessoaFisica(nome, cpf, endereco, idade, sexo);
    }

    public String toString(){
        String string = "Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco() + "\nCPF: " + this.getCpf() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo();
        return string;
    }

    public boolean equals(PessoaFisica pessoa){
        if(this.cpf == pessoa.cpf){
            return true;
        }else{
            return false;
        }
    }

    public boolean autenticar(String chave){
        if(chave.equals(this.getCpf())){
            return true;
        }else{
            return false;
        }
    }



    PessoaFisica(String nome, String cpf, String endereco, int idade, char sexo){
        super(nome, endereco);
        setIdade(idade);
        setSexo(sexo);
        boolean cpfValido= ValidacaoCpf(cpf);

        if (cpfValido) {
            System.out.println("CPF Válido");
            this.cpf=cpf;
        }

        else {
            System.out.println("CPF Inválido");
        }


    }
}
