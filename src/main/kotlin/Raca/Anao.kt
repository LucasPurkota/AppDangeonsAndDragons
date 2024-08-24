package org.example.Raca

import org.example.Personagem.Personagem

class Anao : Raca{
    override fun acrescentaPontosHabilidades(personagem: Personagem) {
        personagem.constituicao += 2
    }
}