package org.example

import org.example.Personagem.Personagem
import org.example.Raca.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("========CRIAÇÃo DE PERSONAGEM========")
    var personagem = Personagem()
    print("Nome: ")
    personagem.nome = readLine().toString()
    println("Raças:")
    println("1 - Alto Elfo")
    println("2 - Anão")
    println("3 - Anão da Colina")
    println("4 - Anão da Montanha")
    println("5 - Draconato")
    println("6 - Drow")
    println("7 - Elfo")
    println("8 - Elfo da Floresta")
    println("9 - Gnomo")
    println("10 - Gnomo da Floresta")
    println("11 - Gnomo das Rochas")
    println("12 - Halfling")
    println("13 - Halfling Pes Leves")
    println("14 - Halfling Robusto")
    println("15 - Humano")
    println("16 - Meio-Elfo")
    println("17 - Meio-Orc")
    println("18 - Tiefling")
    var raca : Int
    do {
        println("Escolha uma Raça:")
        raca = readln().toInt()
    }while ((raca < 1) || (raca > 18))

    personagem.escolherRaca(raca)

    var pontosHabilidadeDisponivel = 27
    println("========DISTRIBIÇÃO DE PONTOS DE HABILIDADE========")
    println("CUSTOS:")
    println("8 - 0")
    println("9 - 1")
    println("10 - 2")
    println("11 - 3")
    println("12 - 4")
    println("13 - 5")
    println("14 - 7")
    println("15 - 8")

    do {
        println("Pontos Habilidades Disponiveis $pontosHabilidadeDisponivel")
        println("1 - Força")
        println("2 - Destreza")
        println("3 - Constituição")
        println("4 - Inteligencia")
        println("5 - Sabedoria")
        println("6 - Carisma")
        println("Escolha a habilidade que deseja mudar:")
        var habilidade = readln().toInt()
        println("Escolha o nivel que deseja deixar sua Habilidade")
        var pontosHabilidade = readln().toInt()
        var result : Int
        when(pontosHabilidade) {
            8 -> result = pontosHabilidadeDisponivel - 0
            9 -> result = pontosHabilidadeDisponivel - 1
            10 -> result = pontosHabilidadeDisponivel - 2
            11 -> result = pontosHabilidadeDisponivel - 3
            12 -> result = pontosHabilidadeDisponivel - 4
            13 -> result = pontosHabilidadeDisponivel - 5
            14 -> result = pontosHabilidadeDisponivel - 7
            15 -> result = pontosHabilidadeDisponivel - 8
            else -> result = 9999
        }
        if ((result == 9999) || (habilidade > 6) || (habilidade < 1)){
            println("Valor Invalido")
        }
        else if (result < 0) {
            println("Voçê não possui pontos disponivel para subir para estes pontos")
        }
        else {
            when(habilidade) {
                1 -> personagem.forca = pontosHabilidade
                2 -> personagem.destreza = pontosHabilidade
                3 -> personagem.constituicao = pontosHabilidade
                4 -> personagem.inteligencia = pontosHabilidade
                5 -> personagem.sabedoria = pontosHabilidade
                else -> personagem.carisma = pontosHabilidade
            }

            pontosHabilidadeDisponivel = result
        }
    }while (pontosHabilidadeDisponivel > 0)

    personagem.adicionarBonusHabilidade()
    personagem.definirPontosDeVida()

    println("========DADOS PERSONAGEM========")
    println("Nome: ${personagem.nome}")
    println("Pontos de vida: ${personagem.pontosDeVida}")
    println("Força: ${personagem.forca}")
    println("Destreza: ${personagem.destreza}")
    println("Constituição: ${personagem.constituicao}")
    println("Inteligencia: ${personagem.inteligencia}")
    println("Sabedoria: ${personagem.sabedoria}")
    println("Carisma: ${personagem.carisma}")
}