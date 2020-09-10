package br.digital.com

fun main(){

    val cliente = Cliente("Arthur", "Rodrigues", 1, "123", "234")

    val poupanca = Poupanca(0.2, 2, 1000.00, cliente)

    val corrente = Corrente(2000.00, 4, 100.00, poupanca.titular)

    poupanca.recolherJuros()
    corrente.sacarDinheiro(20.00)
    corrente.depositarCheque(Cheque(200.00, "banco", "hoje"))
    corrente.depositarDinheiro(100.00)
}