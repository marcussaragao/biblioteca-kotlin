fun main() {
    val usuario = Usuario("Maria Silva", 1001)

    val livro1 = Livro("Dom Casmurro", "Machado de Assis", "Romance", doador = "João Pereira")
    val livro2 = Livro("O Hobbit", "J.R.R. Tolkien", "Fantasia") // sem doador
    val livro3 = Livro("Clean Code", "Robert C. Martin", "Tecnologia")

    usuario.registrarEmprestimo(Emprestimo(livro1, usuario, diasAtraso = 4, statusCodigo = 3, observacoes = "Capa danificada"))
    usuario.registrarEmprestimo(Emprestimo(livro2, usuario, diasAtraso = 0, statusCodigo = 1))
    usuario.registrarEmprestimo(Emprestimo(livro3, usuario, diasAtraso = 0, statusCodigo = 2))

    usuario.listarPendencias()
}