package org.example.Raca

import org.example.Personagem.Personagem

class HalflingRobusto : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.constituicao += 1
    }
}