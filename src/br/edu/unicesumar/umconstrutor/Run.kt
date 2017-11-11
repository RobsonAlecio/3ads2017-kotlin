package br.edu.unicesumar.umconstrutor

fun main(args: Array<String>) {
    println("Coiso")
    val personagem = Personagem("Kalel", 0, "Criptoniana")
    print(personagem)

    val personagem1 = Personagem("Kara", 0, "Criptoniana")
    print(personagem1)
}

private fun print(personagem: Personagem) {
    println(personagem.nome)
    println(personagem.forca)
    println(personagem.raca)
}