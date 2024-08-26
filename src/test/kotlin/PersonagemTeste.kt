import org.example.Personagem.Personagem
import org.example.Raca.Gnomo
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PersonagemTeste {

    var personagem = Personagem()

    @Test
    fun testPersonagem() {
        personagem.nome = "teste"
        personagem.raca = Gnomo()

        personagem.forca = 15
        personagem.destreza = 12
        personagem.constituicao = 14
        personagem.inteligencia = 10
        personagem.sabedoria = 13
        personagem.carisma = 8

        personagem.adicionarBonusHabilidade()
        personagem.definirPontosDeVida()

        assertEquals(
            12, personagem.inteligencia
        )
        assertEquals(
            12, personagem.pontosDeVida
        )
    }
}