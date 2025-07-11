# Projeto Curriculo Gamer
Projeto para cadastrar seus jogos favoritos!

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +String name
        +List~JogoJogado~ jogosJogados
        +List~JogoRecomendado~ jogosRecomendados
        +List~Feature~ features
    }

    class Feature {
        +String icon
        +String description
    }

    class Jogo {
        +String nome
        +String descricao
        +int anoLancamento
    }

    class JogoJogado {
        +String status
        +int nota
    }

    class JogoRecomendado {
        +int compatibilidade
    }

    Jogo <|-- JogoJogado
    Jogo <|-- JogoRecomendado

    User "1" --> "*" JogoJogado
    User "1" --> "*" JogoRecomendado
    User "1" --> "*" Feature

```
