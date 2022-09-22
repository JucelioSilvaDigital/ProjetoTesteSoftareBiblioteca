# ProjetoTesteSoftwareBiblioteca

# Atividade referente a disciplina de TESTE DE SOFTWARE
Será usado o https://junit.org/junit5/ para realizar os testes.

# O propósito é implementar em um código antigo feito na disciplina de POO, algumas funcionalidades a fim de aplicar TESTES DE SOFTWARE.
Os testes serão aplicados antes da implementação...

# Neste contexto apresento os atributos do código antigo
# Atributos da Biblioteca:
- nome;
- catalogo (lista de livros);//entendeu-se catalogar os livros, sendo assim vamos apenas dar um número único
- usuários (lista de Usuários);
# Atributos da Livro:
- titulo;
- autor;
- nr_unico;
- disponibilidade; //true/false
- usuarioEmprestado;//quem pegou emprestado
# Atributos de Usuário
- nome;
- livros; //livros emprestados pelo usuário

# Texto na íntegra (apresentado pelo professor) para o novo código
A biblioteca tem nome, mantém catálogo de livros onde cada livro tem título, autor e número único de catálogo. Há usuários da biblioteca registrados, cada com nome único de usuário. Usuário da biblioteca pode emprestar livro e devolver o livro emprestado para o sistema. No entanto, cada transação, cada realização de empréstimo ou devolução de livro deve ser registrada por uma bibliotecária. A bibliotecária tem que registrar novo usuário da biblioteca no SAB.
Quando solicitada, ela pode exibir, ordem crescente do número único de catálogo, os livros disponíveis para empréstimo, bem como exibir os livros já emprestados e, portanto, indisponíveis para empréstimo. 
O livro para ser emprestado, tem que ter pelo menos 2 exemplares. O usuário não poderá pegar 2 exemplares ao mesmo tempo do mesmo livro.

# Mudanças significativas
- Usuário com nome único de usuário;
- Precisa de uma bibliotecária para realizar a transação de empréstimo ou devolução;
- A bibliotecária também é responsável por cadastrar o usuário na biblioteca;
- Implementar uma condição de incluir exemplares de determinado livro; 
- Mostrar livros disponíveis e já emprestados por ordem numérica do catálogo; 

# Sendo assim, como alternativa
- Podemos optar por criar uma class bibliotecária;
- Também trabalhar com uma class exemplar;

# Observação
Não foram aplicadas todas as implementações determinadas pelo professor, porém o implementado já foi o suficiente para realizar os testes no JUNIT.
