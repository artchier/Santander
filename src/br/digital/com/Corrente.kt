package br.digital.com

class Corrente(var limite: Double,
               numConta: Int,
               saldo: Double,
               titular: Cliente) : Conta(numConta, saldo, titular) {

    override fun sacarDinheiro(qtde: Double) {
        if(saldo >= qtde){
            saldo -= qtde
            println("Saldo disponível: $saldo")
        }
        else{
            println("Limite cheque especial disponível")
            //var novoSaldo = saldo + limite
            if(saldo + limite >= qtde) {
                saldo -= qtde
                println("Saldo disponível: $saldo")
            }
            else
                println("Saldo insuficiente")

        }
    }

    fun depositarCheque(cheque: Cheque){
        saldo += cheque.valor
        println("Saldo disponível: $saldo")
    }
}