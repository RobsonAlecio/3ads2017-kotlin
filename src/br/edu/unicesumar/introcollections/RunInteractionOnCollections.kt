package br.edu.unicesumar.introcollections

import br.edu.unicesumar.umconstrutor.Personagem

fun main(args: Array<String>) {
    val herois = listOf(
            Personagem("Jason Born", 45, "Humano"),
            Personagem("Hulk", 1450, "Super-Humano"),
            Personagem("Superman", 1200, "Criptoniano"),
            Personagem("Batman", 75, "Humano"),
            Personagem("Homem de Ferro", 400, "Humano"),
            Personagem("Thor", 1050, "Asgardiano"),
            Personagem("Riuk", 500, "Shinigami"),
            Personagem("Rem", 500, "Shinigami"),
            Personagem("Sobo", 400, "Shinigami"),
            Personagem("Sobo", 300, "Shinigami"),
            Personagem("Loki", 600, "Asgardiano"),
            Personagem("Felipe", 15, "Asgardiano"),
            Personagem("Zod", 1300, "Criptoniano"),
            Personagem("Goku", 2000, "Sayajin"),
            Personagem("Capitão América", 450, "Super-Humano"),
            Personagem("Vegeta", 1600, "Sayajin")
    )

    //herois.forEach({ p -> println(p.nome)})
    herois.forEach({ println(it.nome)})

    println("=".repeat(30))
//    ArrayList<Personagem> copia7 = new ArrayList<>(personagens);
//    copia7.sort(Comparator.comparingInt(Personagem::getForca));
    val heroisSortedByForca = herois.sortedBy { it.forca }
    heroisSortedByForca.forEach { println("${it.nome} -> ${it.forca}") }

    println("=".repeat(30))
    heroisSortedByForca.forEach { println(it.nome + " -> " + it.forca) }

    println("=".repeat(30))
    heroisSortedByForca.forEach { println("%s -> %s".format(it.nome, it.forca)) }

    println("*".repeat(30))
//    personagens.stream().map(p -> p.getNome() + " -> " + p.getRaca())
//          .forEach(descricao -> System.out.println(descricao));
    heroisSortedByForca
            .map { it.nome + " -> " + it.forca}
            .forEach { println(it) }

    println("%".repeat(30))
//    List<Personagem> antiPersonagens = personagens.stream()
//            .map(origem -> new Personagem("Anti " + origem.getNome(), origem.getForca(), origem.getRaca()))
//            .collect(Collectors.toList());
//
//    antiPersonagens.forEach(p -> System.out.println(p.getNome()));
    herois
            .map { Personagem("Anti ${it.nome}", it.forca, it.raca) }
            .forEach { println(it.nome + " -> " + it.forca) }

    println("#".repeat(30))
/**
 * 		copia1.sort(Comparator.comparing(Personagem::getNome).reversed().thenComparingInt(Personagem::getForca));
        Map<String, List<Personagem>> personagensPorRaca = copia1.stream()
        .collect(Collectors.groupingBy(Personagem::getRaca));
        System.out.println(personagensPorRaca);

        personagensPorRaca.forEach((raca, personagens1) -> {
            System.out.printf("Raça: %s\n", raca);
            personagens1.forEach(p -> System.out.printf("-> %s -> %d\n", p.getNome(), p.getForca()));
        });
 */
    herois
            .sortedWith(compareByDescending(Personagem::nome).thenComparing(Personagem::forca))
            .groupBy(Personagem::raca)
            .forEach {
                println("${it.key}")
                it.value.forEach {
                    println("  => ${it.nome} -> ${it.forca}")
                }
            }

    println("-".repeat(30))
    //Stream<Personagem> filtered = copia2.stream().filter(p -> p.getForca() >= 1_000 );
    herois.filter { it.forca > 1_000 }.forEach { println("  => ${it.nome} -> ${it.forca}") }
    //Optional<Personagem> optional = filtered.findFirst();

    println("@".repeat(30))
//    val personagem = herois.find { it.forca > 10_000 }
    val personagem = herois.find { it.forca > 1_000 }
//    println(personagem!!.nome)
    println(personagem?.nome)
    println(personagem?.nome ?: "Não existe tal heroi")//Elvis Operator


    println("$".repeat(30))
    //IntStream.rangeClosed(1, 100).forEach(i -> System.out.println(i));
    (1 .. 100).forEach { println(it)}
    (1 .. 100).forEach {
        herois.forEach { println("${it.nome}") }
    }
}