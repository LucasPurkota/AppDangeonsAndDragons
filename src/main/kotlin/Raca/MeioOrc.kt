package org.example.Raca

import org.example.Personagem.Personagem

class MeioOrc : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
         personagem.forca += 2
        personagem.constituicao += 1
    }

}