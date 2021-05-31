package enum_classes

/** é usada quando é necessario listar possibilidades que possam ocorrer*/
enum class PrioridadeEnum {
    BAIXA, MEDIA, ALTA
}

/**Quando um item da classe enum é chamada, é retornado uma string com a descriçao q é o nome do item.
 * Porém é possivel atribuir um valor ao item da classe */
enum class PrioridadeEnum2(val id: Int) {
    BAIXA(1) {
        override fun toString(): String {
            return "Super baixa, não se preocupe"
        }
    },
    MEDIA(5), ALTA(10)
}

/** é possivel usar a classe enum como atributo de outra classe*/
class Alarme(var desc: String, p: PrioridadeEnum)

fun main() {
    for (p in PrioridadeEnum2.values()) {
        //ordinal é a posiçao da classe
        println("$p - ${p.id} - ${p.ordinal}")
    }
}