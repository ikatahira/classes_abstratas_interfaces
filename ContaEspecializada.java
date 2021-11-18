public class ContaEspecializada extends Conta {
  
       
 

@Override
public void imprimeExtrato() {
    System.out.println("Seu saldo é: "+getSaldo());
    
}

@Override
public int idade() {
    int maioridade=18;
    
    return 18;
}
    


}
