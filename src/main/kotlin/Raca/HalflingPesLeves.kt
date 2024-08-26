package org.example.Raca

import org.example.Personagem.Personagem

class HalflingPesLeves : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.carisma += 1
    }
}