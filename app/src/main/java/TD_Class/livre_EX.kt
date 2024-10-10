package TD_Class

data class Livre(
    val titre: String,
    val auteur: String,
    val anneePublication: Int,
    val genre: String,
    val nombrePages: Int,
    val note: Double
)
// Liste de livres pour l'exercice
val bibliotheque = listOf(
    Livre("1984", "George Orwell", 1949, "Science-fiction", 328, 4.5),
    Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943, "Conte", 96,
        4.8),
    Livre("Harry Potter à l'école des sorciers", "J.K. Rowling", 1997,
        "Fantasy", 309, 4.7),
    Livre("Orgueil et Préjugés", "Jane Austen", 1813, "Roman", 432, 4.6),
    Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien", 1954, "Fantasy", 1178,
        4.9),
    Livre("Crime et Châtiment", "Fiodor Dostoïevski", 1866, "Roman", 671, 4.3),
    Livre("Fondation", "Isaac Asimov", 1951, "Science-fiction", 255, 4.4),
    Livre("Cent ans de solitude", "Gabriel García Márquez", 1967, "Réalisme magique", 417, 4.2)
)
fun main() {
//        bibliotheque.forEach{
//            println("Auteur : ${it.auteur} , Titre : ${it.titre}")
//        }
//        ______________________________________
//        var  listeContenant = bibliotheque.map {
//            it.titre
//        }
//        listeContenant.forEach{
//          println("Auteur : $it")
//        }
//        ____________________________________________
//          var  listeDesLivres = bibliotheque.filter {
//              it.anneePublication > 1950
//          }
//          listeDesLivres.forEach{
//            println(" Auteur ${it.auteur} , Annee Publication : ${it.anneePublication}")
//          }
////            _____________________________________________
//          var listGenre = bibliotheque.groupBy { it.genre }
//            listGenre.forEach {
//                println(it.key)
//            }
//        listGenre.forEach{
//             (it.value.forEach {
//                println(it.genre)
//            })}
//        --------------------------------------------------------------
//        var  nombrePagestotal = bibliotheque.fold(0) {total, Livre ->
//        total + Livre.nombrePages
//        }
//        println("Total price: $${nombrePagestotal}")
//        -------------------------------------------
//        var livresParAnnee  = bibliotheque.sortedBy {
//            it.anneePublication
//        }
//        livresParAnnee.forEach {
//            println("Auteur :${it.auteur}")
//        }
//        var liste = bibliotheque.filter {
//            it.note > 4.5
//        }
//        var listep = liste.map {
//            it.titre
//        }
//        var listsor = listep.sortedBy {
//             it
//        }
//        listsor.forEach {
//            println("Titre : $it")
//        }
//        ______________________________________________
    val livresParDecennies = bibliotheque.groupBy { it.anneePublication.toString().take(3) + "0".toInt() }
        .mapValues { it.value.toString()}
    println(livresParDecennies)
}
