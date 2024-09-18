package org.example.Personagem

import org.example.Raca.*

open class Personagem {
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

    fun escolherRaca(opcao: Int) {
        this.raca = when(opcao){
            1 -> AltoElfo()
            2 -> Anao()
            3 -> AnaoDaColina()
            4 -> AnaoDaMontanha()
            5 -> Draconato()
            6 -> Drow()
            7 -> Elfo()
            8 -> ElfoDaFloresta()
            9 -> Gnomo()
            10 -> GnomoDaFloresta()
            11 -> GnomoDasRochas()
            12 -> Halfling()
            13 -> HalflingPesLeves()
            14 -> HalflingRobusto()
            15 -> Humano()
            16 -> MeioElfo()
            17 -> MeioOrc()
            else -> Tiefling()
        }
    }
}