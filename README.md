# Gymi – Chatbot de Academia

## Descrição

O Gymi é um chatbot desenvolvido em Java utilizando regras e palavras-chave para responder dúvidas de usuários sobre uma academia.

O chatbot reconhece diferentes formas de perguntas por meio da normalização das mensagens (maiúsculas, minúsculas e acentos) e mantém o contexto da conversa durante a escolha e contratação de um plano.

## Funcionalidades

O Gymi responde perguntas sobre:

* Horário de funcionamento da academia.
* Planos (Mensal, Trimestral e Anual).
* Aulas (Zumba, Pilates, Spinning e Funcional).
* Musculação.
* Personal trainer.
* Formas de pagamento.
* Endereço da academia.
* Contato (WhatsApp).

Além disso, o chatbot possui:

* Normalização das mensagens.
* Regras compostas utilizando palavras-chave.
* Resposta para mensagens não reconhecidas.
* Contexto da conversa na escolha e contratação de planos.
* Encerramento da conversa com o comando `sair`.

## Tecnologias utilizadas

* Java
* Scanner (`java.util.Scanner`)
* Normalizer (`java.text.Normalizer`)

## Como executar

1. Abra o projeto no Visual Studio Code.
2. Abra o arquivo `Gymi.java`.
3. Execute o programa (**Run Java** ou botão ▶).
4. Digite perguntas sobre a academia no terminal.
5. Para encerrar a conversa, digite `sair`.

## Exemplos de perguntas

* Até que horas a academia fica aberta?
* Quais planos vocês têm?
* Quero contratar um plano para treinar.
* Tem personal trainer?
* Tem Pilates?
* Aceita PIX?
* Onde fica a academia?
* Qual é o WhatsApp de vocês?
