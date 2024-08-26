package org.example.Raca

import org.example.Personagem.Personagem

class AnaoDaMontanha : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.forca += 2
    }

}