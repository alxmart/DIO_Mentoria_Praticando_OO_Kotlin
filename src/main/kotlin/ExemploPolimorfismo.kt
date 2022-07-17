fun main() {

}

abstract class Cadeira2 {

    // fun levantar()
    // fun abaixar()]

    val cor: String = ""
}

interface AlturaAjustavel {
    fun levantar()
    fun abaixar()
}

class CadeiraDeJantar : Cadeira {

}

class CadeiraDeEscritorio2 : Cadeira2, AlturaAjustavel {

    override fun levantar() {

        puxarAlavanca()
        tirarPeso()
    }

    override fun abaixar() {

        puxarAlavanca()
        colocarPeso()
    }

}

class CadeiraOdontologica2 : Cadeira2, AlturaAjustavel {

    override fun levantar() {
        apertarBotao(CIMA)
        motorLevantarCadeira()
    }

    override fun abaixar() {
        apertarBotao(BAIXO)
        motorAbaixarCadeira()
    }

}

