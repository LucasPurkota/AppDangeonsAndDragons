package org.example.Raca

import org.example.Personagem.Personagem

class Drow : Raca {
    override fun acrescentaPontosHabilidades(personagem: Personagem) {
        personagem.carisma += 1
    }
}