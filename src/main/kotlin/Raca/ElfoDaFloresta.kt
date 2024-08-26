package org.example.Raca

import org.example.Personagem.Personagem

class ElfoDaFloresta : Raca {
    override fun pontosHabilidades(personagem: Personagem) {
        personagem.sabedoria += 1
    }
}