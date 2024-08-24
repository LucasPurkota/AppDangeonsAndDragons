package org.example.Raca

import org.example.Personagem.Personagem

class GonomoDasRochas : Raca {
    override fun acrescentaPontosHabilidades(personagem: Personagem) {
        personagem.constituicao += 1
    }
}