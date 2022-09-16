# ProjetoTesteSoftwareBiblioteca

# Atividade referente a disciplina de TESTE DE SOFTTWARE

# O proposito é implementar em um codigo antigo feito na disciplina de POO, algumas funcionalidades a fim de aplicar TESTES DE SOFTWARE.
Aplicaremos os testes antes da implementação...

# Neste contexto apresento os atributos do código antigo
# Atributos da Biblioteca:
- nome;
- catalago (lista de livros);//entendeu-se catalogar os livros, sendo assim vamos apenas dar um numero unico
- usuarios (lista de Usuarios);
# Atributos da Livro:
- titulo;
- autor;
- nr_unico;
- disponibilidade; //true/false
- usuarioEmprestado;//quem pegou emprestado
# Atributos de Usuario
- nome;
- livros; //livros emprestados pelo usuario

# Texto na integra (apresendado pelo professor) para o novo código
A biblioteca tem nome, mantém catálogo de livros onde cada livro tem título, autor e número único de catálogo. Há usuários da biblioteca registrados, cada com nome único de usuário. Usuário da biblioteca pode emprestar livro e devolver o livro emprestado para o sistema. No entanto, cada transação, cada realização de empréstimo ou devolução de livro deve ser registrada por uma bibliotecária. A bibliotecária tem que registrar novo usuário da biblioteca no SAB.
Quando solicitada, ela pode exibir, ordem crescente do número único de catálogo, os livros disponíveis para empréstimo, bem como exibir os livros já emprestados e, portanto, indisponíveis para empréstimo. 
O livro para ser emprestado, tem que ter pelo menos 2 exemplares. O usuário não poderá pegar 2 exemplares ao mesmo tempo do mesmo livro.

# Mudanças significativas
- Usuario com nome unico de usuario;
- Precisa de uma bibliotecaria para realizar a transação de emprestimo ou devolução;
- A bibliotecaria tambem é respopnsavel por cadastrar o usuário na biblioteca;
- Implementar uma condição de incluir exemplares de determinado livro; 
- Mostrar livros disponiveis e já emprestados por ordem numerica do catalogo; 

# Sendo assim
- Precisamos da class bibliotecaria;
- Podemos tambem trabalhar com uma class exemplar;
