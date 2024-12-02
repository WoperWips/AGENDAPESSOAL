Agenda de Contatos (Java Swing + JPA)
Este projeto é uma aplicação simples de Agenda de Contatos desenvolvida em Java utilizando o padrão MVC (Model-View-Controller), a biblioteca Swing para a interface gráfica e JPA (Java Persistence API) para operações de CRUD em banco de dados.

Funcionalidades
Adicionar Contato: Permite cadastrar um novo contato com nome e telefone.
Atualizar Contato: Atualiza as informações de um contato existente.
Deletar Contato: Remove um contato do banco de dados.
Listar Contatos: Exibe todos os contatos armazenados.

Arquitetura do Projeto
O projeto segue o padrão MVC:

Model: Responsável por gerenciar os dados e realizar operações no banco de dados.
View: Interface gráfica com o usuário, construída com a biblioteca Swing.
Controller: Faz a ponte entre a View e o Model, gerenciando eventos e atualizando dados.
Estrutura do projeto:
bash
Copiar código
src/
├── com/exemplo/agenda/main/
│   ├── AgendaContatos.java       # Classe principal
│   └── ContatoController.java    # Controller da aplicação
├── com/exemplo/agenda/model/
│   ├── ContatoModel.java         # Classe responsável pelas operações no banco
│   └── Contato.java              # Entidade JPA representando um contato
├── com/exemplo/agenda/view/
│   └── ContatoView.java          # Interface gráfica da aplicação

Como Configurar o Projeto no VS Code
Pré-requisitos:
Java Development Kit (JDK) instalado.
Configuração de um gerenciador de dependências como Maven ou Gradle.
Um banco de dados configurado (ex.: MySQL, H2, ou qualquer banco de sua escolha).
Adicionar o arquivo persistence.xml ao diretório de configurações de persistência (src/main/resources/META-INF/persistence.xml).
Exemplo de persistence.xml:
xml
Copiar código
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence" version="2.1">
    <persistence-unit name="AgendaPU">
        <class>com.exemplo.agenda.model.Contato</class>
        <properties>
            <!-- Configurações do banco de dados -->
            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/agenda_db"/>
            <property name="javax.persistence.jdbc.user" value="root"/>
            <property name="javax.persistence.jdbc.password" value="senha"/>
            <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>

            <!-- Configurações adicionais -->
            <property name="hibernate.hbm2ddl.auto" value="update"/>
            <property name="hibernate.show_sql" value="true"/>
        </properties>
    </persistence-unit>
</persistence>
Passos para executar:
Clone o projeto ou baixe os arquivos.
Abra o projeto no VS Code.
Configure o arquivo persistence.xml com as credenciais do seu banco de dados.
Certifique-se de que as bibliotecas necessárias estão instaladas:
JPA (javax.persistence)
Hibernate (ou outra implementação JPA)
Driver do banco de dados (ex.: mysql-connector-java para MySQL)

Compile e execute o arquivo principal AgendaContatos.java.
Componentes
1. Model
Gerencia os dados e a persistência:

Contato.java: Define a entidade JPA para a tabela de contatos.
ContatoModel.java: Contém métodos para adicionar, atualizar, deletar e listar contatos no banco.
2. View
ContatoView.java: Define a interface gráfica usando Swing, com campos de texto, botões e tabela.
3. Controller
ContatoController.java: Gerencia a interação entre a View e o Model, implementando as ações de cada botão.
Exemplo de Uso
Abra o programa e insira os dados de um contato nos campos "Nome" e "Telefone".
Clique em Adicionar para salvar o contato.
Use os botões Atualizar, Deletar, ou Listar para gerenciar os contatos.
Tecnologias Utilizadas
Java
Swing (Interface gráfica)
JPA (Persistência de dados)
Hibernate (Implementação JPA)
MySQL (Banco de dados)
Possíveis Melhorias
Adicionar validação mais robusta nos campos.
Implementar paginação para grandes volumes de contatos.
Adicionar funcionalidades de busca.
Melhorar o layout da interface gráfica.
Autor
Herick Marlon

Se precisar de suporte ou tiver dúvidas, entre em contato! 🚀
