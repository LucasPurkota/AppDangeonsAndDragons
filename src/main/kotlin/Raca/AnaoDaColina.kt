package org.example.Raca

import org.example.Personagem.Personagem

class AnaoDaColina : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.sabedoria += 1
    }
}