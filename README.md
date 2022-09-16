# ProjetoTesteSoftwareBiblioteca

# Atividade referente a disciplian de TESTE DE SOFTTWARE

# Texto na integra (apresendado pelo professor)
A biblioteca tem nome, mantém catálogo de livros onde cada livro tem título, autor e número único de catálogo. Há usuários da biblioteca registrados, cada com nome único de usuário. Usuário da biblioteca pode emprestar livro e devolver o livro emprestado para o sistema. No entanto, cada transação, cada realização de empréstimo ou devolução de livro deve ser registrada por uma bibliotecária. A bibliotecária tem que registrar novo usuário da biblioteca no SAB.
Quando solicitada, ela pode exibir, ordem crescente do número único de catálogo, os livros disponíveis para empréstimo, bem como exibir os livros já emprestados e, portanto, indisponíveis para empréstimo. 
O livro para ser emprestado, tem que ter pelo menos 2 exemplares. O usuário não poderá pegar 2 exemplares ao mesmo tempo do mesmo livro.

# Requisitos Funcionais levantados
# Biblioteca
- SET nome;
- GET nome;
- ADD catalogo;
- GET catalogos;
- SET Usuario;
- GET Usuario;
- SET bibliotecaria;
- GET bibliotecarias;

# Livro
- SET Titulo;
- GET titulo;
- SET Autor;
- GET Autor;
- SET codigoUnico;
- GET codigoUnico;
- SET exemplar;
- GET exemplares;
- SET catalogo;
- GET catalagos;
