package br.edu.unicesumar.doisconstrutores
//v1
//class Personagem {
//    var nome: String = ""
//    var forca = 0
//    lateinit var raca: String
//
//    constructor()
//
//    constructor(nome: String, forca: Int, raca: String): this() {
//        this.nome = nome
//        this.forca = forca
//        this.raca = raca
//    }
//}

class Personagem() {
    var nome: String = ""
    var forca = 0
    lateinit var raca: String

    constructor(nome: String, forca: Int, raca: String): this() {
        this.nome = nome
        this.forca = forca
        this.raca = raca
    }
}