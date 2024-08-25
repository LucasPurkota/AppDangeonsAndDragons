package org.example.Raca

import org.example.Personagem.Personagem

class AnaoColina : Raca {
    override fun acrescentaPontosHabilidades(personagem: Personagem) {
        personagem.sabedoria += 1
    }
}