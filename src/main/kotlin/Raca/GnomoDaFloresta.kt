package org.example.Raca

import org.example.Personagem.Personagem

class GnomoDaFloresta : Raca {
    override fun acrescentaPontosHabilidades(personagem: Personagem) {
        personagem.destreza += 1
    }
}