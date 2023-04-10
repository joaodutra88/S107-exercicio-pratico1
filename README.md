<a href="https://github.com/chrislima">
<img src="https://img.shields.io/static/v1?label=Professor&message=Christopher Lima&color=blue&?style=social&logo=GitHub">
</a>

## Grupo

<a href="https://github.com/joaodutra88">
<img src="https://img.shields.io/static/v1?label=Github&message=Profile&color=blue&?style=social&logo=GitHub">
</a>

**João Vítor Carvalho de Paula Dutra 351**


<a href="https://github.com/leomendoncaf">
<img src="https://img.shields.io/static/v1?label=Github&message=Profile&color=blue&?style=social&logo=GitHub">
</a>

**Leonardo Mendonça Franco 46**

# S107-exercicio-pratico1

![Repo Size](https://img.shields.io/github/repo-size/joaodutra88/S107-exercicio-pratico1)
![Linguagens usadas](https://img.shields.io/github/languages/count/joaodutra88/S107-exercicio-pratico1)
![Linguagem mais usada](https://img.shields.io/github/languages/top/joaodutra88/S107-exercicio-pratico1)
![Última atualização](https://img.shields.io/github/last-commit/joaodutra88/S107-exercicio-pratico1)

### **Questão 1)** Utilizando todo conhecimento obtido nas aulas, faça um sistema de CI/CD com GitHub Actions, para realizar etapas de um pipeline. Veja as restrições a seguir:


1. Crie um sistema hipotético de software qualquer ou utilize algum pronto.
2. O software deve possuir pelo menos 10 cenários de teste unitário e/ou integração
e/ou interface.
3. É permitido o uso de qualquer ferramenta de testes.
4. O pipeline deve possuir as seguintes etapas:
```
• Execução dos testes;
• Build (Empacotamento);
• O pacote e o relatório de testes gerado devem ser armazenados como artefatos no GitHub Actions.
• Um script (Na linguagem da sua escolha) deve ser chamado para enviar um
e-mail com informações da execução do pipeline. Pode ser uma informação
trivial, como: "Pipeline executado!".
1
• O e-mail não pode estar fixado (hardcoded) no script, ele deve ser
uma variável de ambiente do GitHub Actions.
• O pipeline deve ter pelo menos 3 jobs diferentes (Testes, Empacotamento e
Notificação). Um deles deve rodar em paralelo.
• Qualquer software necessário para execução do pipline na máquina remota
deve ser instalado via script.
5. O servidor de CI/CD deve ser capaz de informar se o teste e a build obteve
sucesso ou falha.
6. O exercício deve ser entregue via tarefa no Teams com o link para o GitHub.
7. Pode ser feito em dupla.
8. Identifique na entrega os nomes dos integrantes.
```