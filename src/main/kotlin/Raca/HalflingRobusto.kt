package org.example.Raca

import org.example.Personagem.Personagem

class HalflingRobusto : Raca {
    override fun acrescentaPontosHabilidades(personagem: Personagem) {
        personagem.constituicao += 1
    }
}