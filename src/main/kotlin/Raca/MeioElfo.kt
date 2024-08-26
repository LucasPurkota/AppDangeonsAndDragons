package org.example.Raca

import org.example.Personagem.Personagem

class MeioElfo : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.carisma += 1
    }
}