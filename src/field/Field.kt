package field

class Maquina (var marca: String) {
    var nucleos = 0
    get() {
        println("Get foi chamado")
        return field
    }
    set(value) {
        /** field é usado como se fosse o this,
         * porem ele é usado apenas na alteração do se ou get de uma classe*/
        println("Set foi chamado")
        field = value
    }
}

fun main() {
    var m = Maquina("xpto")
    println(m.nucleos)
    m.nucleos = 10
}