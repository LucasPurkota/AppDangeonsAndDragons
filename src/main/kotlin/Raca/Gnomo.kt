package org.example.Raca

import org.example.Personagem.Personagem

class Gnomo : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.inteligencia += 2
    }
}