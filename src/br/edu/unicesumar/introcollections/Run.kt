package br.edu.unicesumar.introcollections

fun main(args: Array<String>) {
    var x : List<String> = listOf("x", "y", "z")
    var y : MutableList<String> = mutableListOf("y")
    y.add("z")

    println(x)
    println(y)

    y.forEach { s -> println(s) }

    var w = y.map {
        var result = ""
        for (i in 1..10)
            result += it
    }

    println(w)


}