package org.example

import org.example.Personagem.Personagem
import org.example.Raca.Humano

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var personagem = Personagem()

    println(personagem.forca)

    var humano = Humano()
    humano.acrescentaPontosHabilidades(personagem)

    println(personagem.forca)

}