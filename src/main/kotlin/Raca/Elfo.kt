package org.example.Raca

import org.example.Personagem.Personagem

class Elfo : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.destreza += 2
    }
}