/**
 * Classe que possui os atributos e metodos de uma Conta corrente
 * 
 * @author grupo
 *
 */
public class ContaCorrente {

	private float valor;
	private boolean aberto;
	
	public ContaCorrente(){
		this.aberto = false;
		this.valor = 100.0f;
	}
	
	public void abrirConta(){
		this.aberto = true;
	}
	
	/**
	 * 
	 * @param valorSaque Valor que sera sacado
	 * @throws SaldoInsuficienteException Se o valor do saque for maior que o saldo disponivel, lance essa exception
	 * @throws SaqueNegativoException Se o valor do saque for negativo, lance essa exception
	 * @throws ContaFechadaException Se a conta nao estiver aberta, lance essa exception
	 */
	public void sacar(float valorSaque) throws SaldoInsuficienteException, SaqueNegativoException, ContaFechadaException{
		if(this.aberto == false){
			throw new ContaFechadaException();
		} else if(valorSaque <= 0.0f){
			throw new SaqueNegativoException();
		} else if(valorSaque > this.valor){
			throw new SaldoInsuficienteException();
		} else {
			this.valor -= valorSaque;
		}
	}
	
	/**
	 * 
	 * @return Retorna o saldo disponivel
	 */
	
	public float getValor() {
		return valor;
	}

	/**
	 * 
	 * @param valor Valor para definir o saldo disponivel
	 */
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
