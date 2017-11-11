package br.edu.unicesumar.doisconstrutores

fun main(args: Array<String>) {
    println("Coiso")
    val personagem = Personagem()
    personagem.nome = "Kalel"
    personagem.raca = "Criptoniana"
    print(personagem)

    val personagem1 = Personagem("Kara", 0, "Criptoniana")
    print(personagem1)
}

private fun print(personagem: Personagem) {
    println(personagem.nome)
    println(personagem.forca)
    println(personagem.raca)
}