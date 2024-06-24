public class PessoaJuridica extends Cliente{
    /*String cnpj: cpnj da PJ
int numFuncionarios: Número de funcionários da PJ
String setor*/
    String cnpj;
    int numFuncionarios;
    String setor;

    int getNumFuncionarios(){
        return this.numFuncionarios;
    }

    int setNumFuncionarios(int numFuncionarios){
        this.numFuncionarios = numFuncionarios;
        return this.numFuncionarios;
    }

    String getSetor(){
        return this.setor;
    }

    String setSetor(String setor){
        this.setor = setor;
        return this.setor;
    }

    String getCnpj(){
        return this.cnpj;
    }

    public String toString(){
        String string = "Nome: " + this.getNome() + "\nEndereço: " + this.getEndereco() + "\nCNPJ: " + this.getCnpj() + "\nNúmero de funcionários: " + this.numFuncionarios + "\nSetor: " + this.getSetor();
        return string;
    }

    public boolean equals(PessoaJuridica empresa){
        if(this.cnpj == empresa.cnpj){
            return true;
        }else{
            return false;
        }
    }
    public boolean autenticar(String chave){
        if(chave.equals(this.getCnpj())){
            return true;
        }else{
            return false;
        }
    }

    PessoaJuridica(String nome, String cnpj, String endereco, int numFuncionarios, String setor){
        super(nome, endereco);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }
}
