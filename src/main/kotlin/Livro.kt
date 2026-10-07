class Livro(
    val titulo: String,
    val autor: String,
    val genero: String,
    val doador: String? = null
) {

    fun doadorRegistrado(): String = doador ?: "Acervo Geral da Biblioteca"
}