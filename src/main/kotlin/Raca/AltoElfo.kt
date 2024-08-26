package org.example.Raca

import org.example.Personagem.Personagem

class AltoElfo : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.inteligencia += 1
    }
}