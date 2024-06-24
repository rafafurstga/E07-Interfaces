public abstract class Cliente {

    private String nome;
    private String endereco;


    //metodos

    String getNome() {
        return this.nome;
    }

    String setNome(String nome) {
        this.nome = nome;
        return this.nome;
    }

    String getEndereco() {
        return this.endereco;
    }

    String setEndereco(String endereco) {
        this.endereco = endereco;
        return this.endereco;
    }


    boolean ValidacaoCpf(String cpf) {

        boolean cpfValido = true;

        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11)
            cpfValido = false;

        // Verifica se todos os dígitos são iguais
        boolean allDigitsEqual = true;
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                allDigitsEqual = false;
                break;
            }
        }
        if (allDigitsEqual)
            cpfValido = false;

        // Calcula o primeiro dígito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digit1 = 11 - (sum % 11);
        if (digit1 > 9)
            digit1 = 0;

        // Verifica o primeiro dígito verificador
        if ((cpf.charAt(9) - '0') != digit1)
            cpfValido = false;

        // Calcula o segundo dígito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digit2 = 11 - (sum % 11);
        if (digit2 > 9)
            digit2 = 0;

        // Verifica o segundo dígito verificador
        if ((cpf.charAt(10) - '0') != digit2) {
            cpfValido = false;
        }
        return cpfValido;
    }

    public abstract boolean autenticar(String chave);

    Cliente(String nome, String endereco) {
        setNome(nome);
        setEndereco(endereco);

    }
}

