# Gestão de Biblioteca (Estudo de Caso 11)

Sistema em Kotlin que simula o controle de empréstimos, devoluções e multas de uma biblioteca comunitária.

**Aluno:** Marcus Guedes

## Classes
- `Livro`: título, autor, gênero e doador (opcional)
- `Usuario`: nome, código e lista de empréstimos
- `Emprestimo`: livro, usuário, dias de atraso, status e observações (opcional)

## Regras de negócio
- **Multa (if/else):** R$ 2,50 por dia de atraso; sem atraso, multa zero
- **Doador (Null Safety):** se for nulo, usa o operador Elvis e registra "Acervo Geral da Biblioteca"
- **Status (when):** 1 = Ativo, 2 = Devolvido, 3 = Atrasado
- **Pendências (for):** lista os livros ainda não devolvidos de cada usuário

## Como executar
1. Abra o projeto no IntelliJ IDEA
2. Execute o arquivo `Main.kt`