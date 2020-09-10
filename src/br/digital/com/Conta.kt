package br.digital.com

open class Conta(var numConta: Int, var saldo: Double, var titular: Cliente) {

    open fun sacarDinheiro(qtde: Double){
        when {
            saldo >= qtde -> {
                saldo -= qtde
                println("Saldo disponível: $saldo")
            }
            else -> println("Saldo insuficiente")
        }
    }

    fun depositarDinheiro(qtde: Double){
        saldo += qtde
        println("Saldo disponível: $saldo")
    }
}