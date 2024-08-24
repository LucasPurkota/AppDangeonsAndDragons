package org.example.Raca

import org.example.Personagem.Personagem

class Humano : Raca{
    override fun acrescentaPontosHabilidades(personagem: Personagem){
        personagem.forca += 1
        personagem.destreza += 1
        personagem.constituicao += 1
        personagem.inteligencia += 1
        personagem.sabedoria += 1
        personagem.carisma += 1
    }
}