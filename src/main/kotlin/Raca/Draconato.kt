package org.example.Raca

import org.example.Personagem.Personagem

class Draconato : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.forca += 2
        personagem.carisma += 1
    }
}