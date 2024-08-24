package org.example.Raca

import org.example.Personagem.Personagem

class AnaoDaMontanha : Raca {
    override fun acrescentaPontosHabilidades(personagem: Personagem) {
        personagem.forca += 2
    }

}