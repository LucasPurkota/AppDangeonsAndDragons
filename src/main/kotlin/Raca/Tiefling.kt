package org.example.Raca

import org.example.Personagem.Personagem

class Tiefling : Raca {
    override fun acrescentaPontosHabilidades(personagem: Personagem) {
        personagem.inteligencia += 1
        personagem.carisma += 2
    }
}