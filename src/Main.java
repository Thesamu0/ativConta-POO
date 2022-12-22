public class Main {
    public static void main(String[] args) {
        Conta matheus = new Conta("321341241","01","01");
        Conta guilherme = new Conta("1241242142","02","01");

        matheus.depositar(1000);
        guilherme.depositar(1000);

        matheus.transferir(500,guilherme);
        System.out.println("gui: " + guilherme.getSaldo() + "\n matheus: " + matheus.getSaldo());
        matheus.transferir(-100,guilherme);
        System.out.println("gui: " + guilherme.getSaldo() + "\n matheus: " + matheus.getSaldo());

        matheus.transferir(500,matheus);


    }
}

/*
Sistema Bancário
- Deposito
- Sacar
- Transferir

- Transferir apenas se tiver saldo
- Sacar apenas se tiver saldo

- Todos os atributos tem que ser privados
 */