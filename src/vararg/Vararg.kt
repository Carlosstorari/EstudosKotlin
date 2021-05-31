/*** Usando o vararg é possivel adicionar varios parametros*/
fun media( vararg notas: Float) {
    if (notas.isNotEmpty()) {
        var soma = 0f
        for(nota in notas) {
            soma += nota
        }
        println("A media é: ${soma/notas.size}")
    }

}

/*** Usando 0 <T> é possivel fazer com que a função aceite qualquer tipo de valor */
fun <T> recebeQualquerTipoDeParametro(vararg  valores: T) {
    for (valor in valores) {
        println(valor)
    }
}

fun main() {
    println("vararg com um tipo de parametro \n")
    media(10f, 8f)
    media(1f, 6f, 7f)

    println("vararg com qualquer tipo de parametro")
    recebeQualquerTipoDeParametro(1, 4f, false, "", 'C')
}