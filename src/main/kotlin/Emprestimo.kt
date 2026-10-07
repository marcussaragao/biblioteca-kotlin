class Emprestimo(
    val livro: Livro,
    val usuario: Usuario,
    val diasAtraso: Int,
    val statusCodigo: Int,
    val observacoes: String? = null
) {
    companion object {
        const val VALOR_MULTA_POR_DIA = 2.50
    }

    fun calcularMulta(): Double {
        return if (diasAtraso > 0) {
            diasAtraso * VALOR_MULTA_POR_DIA
        } else {
            0.0
        }
    }

    fun descricaoStatus(): String {
        return when (statusCodigo) {
            1 -> "Ativo: o livro está com o usuário dentro do prazo."
            2 -> "Devolvido: o livro já retornou ao acervo."
            3 -> "Atrasado: o prazo de devolução foi ultrapassado."
            else -> "Status desconhecido."
        }
    }

    fun observacaoOuPadrao(): String = observacoes ?: "Sem observações"
}