package org.example.Personagem

import org.example.Raca.Raca

class Personagem {
    var nome : String = ""
    lateinit var raca : Raca
    var pontosDeVida : Int = 10
    var forca : Int = 8
    var destreza : Int = 8
    var constituicao : Int = 8
    var inteligencia : Int = 8
    var sabedoria : Int = 8
    var carisma : Int = 8


    fun definirPontosDeVida() {
        this.pontosDeVida +=  (this.constituicao - 10) / 2
    }

    fun adicionarBonusHabilidade(){
        this.raca.pontosHabilidades(this)
    }
}