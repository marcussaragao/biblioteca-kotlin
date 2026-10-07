class Usuario(
    val nome: String,
    val codigo: Int
) {
    private val emprestimos = mutableListOf<Emprestimo>()

    fun registrarEmprestimo(emprestimo: Emprestimo) {
        emprestimos.add(emprestimo)
    }

    fun listarPendencias() {
        println("Pendências de $nome (código $codigo):")
        var totalMultas = 0.0
        var temPendencia = false

        for (emprestimo in emprestimos) {
            if (emprestimo.statusCodigo != 2) {
                temPendencia = true
                val multa = emprestimo.calcularMulta()
                totalMultas += multa
                println("- \"${emprestimo.livro.titulo}\" de ${emprestimo.livro.autor}")
                println("  Status: ${emprestimo.descricaoStatus()}")
                println("  Dias de atraso: ${emprestimo.diasAtraso} | Multa: R$ ${"%.2f".format(multa)}")
                println("  Doador: ${emprestimo.livro.doadorRegistrado()}")
                println("  Observações: ${emprestimo.observacaoOuPadrao()}")
            }
        }

        if (!temPendencia) {
            println("Nenhuma pendência.")
        } else {
            println("Total de multas: R$ ${"%.2f".format(totalMultas)}")
        }
    }
}