package org.example.Raca

import org.example.Personagem.Personagem

class GnomoDasRochas : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.constituicao += 1
    }
}