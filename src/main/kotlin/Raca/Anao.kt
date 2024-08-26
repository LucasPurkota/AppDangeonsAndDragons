package org.example.Raca

import org.example.Personagem.Personagem

class Anao : Raca{
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.constituicao += 2
    }
}