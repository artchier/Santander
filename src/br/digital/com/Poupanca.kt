package br.digital.com

class Poupanca(var taxa: Double, numConta: Int, saldo: Double, titular: Cliente) : Conta(numConta, saldo, titular) {

    fun recolherJuros(){
        saldo += (taxa*saldo)
        println("Saldo disponível: $saldo")
    }
}