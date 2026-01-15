# Exercício 3 - Máquina de Banho para Petshop (POO)

Este projeto consiste na simulação de uma máquina de banho para pets, desenvolvida com o objetivo de praticar conceitos de lógica de programação e Programação Orientada a Objetos (POO).

## 🎯 Objetivo

Controlar o funcionamento de uma máquina de banho de petshop, respeitando regras específicas de uso, consumo de recursos e estados da máquina.

---

## ⚙️ Funcionalidades da Máquina

A máquina de banho deve permitir as seguintes operações:

- Dar banho no pet
- Abastecer a máquina com água
- Abastecer a máquina com shampoo
- Verificar o nível de água
- Verificar o nível de shampoo
- Verificar se há pet na máquina
- Colocar pet na máquina
- Retirar pet da máquina
- Limpar a máquina

---

## 📋 Regras de Funcionamento

- A máquina permite **apenas 1 pet por vez**
- Cada banho consome:
    - 10 litros de água
    - 2 litros de shampoo
- Capacidade máxima da máquina:
    - Água: 30 litros
    - Shampoo: 10 litros
- O abastecimento de água e shampoo ocorre **de 2 em 2 litros**
- Caso o pet seja retirado **antes de estar limpo**, a máquina ficará suja
- Enquanto a máquina estiver suja, **não é permitido colocar outro pet**
- A limpeza da máquina consome:
    - 3 litros de água
    - 1 litro de shampoo

---

## 🧠 Regras Lógicas Importantes

- Não é possível dar banho sem pet na máquina
- Não é possível dar banho se não houver água ou shampoo suficientes
- Não é permitido ultrapassar o limite máximo de água ou shampoo
- A limpeza da máquina é obrigatória quando o pet é retirado sem banho completo

---

## 🛠️ Estrutura Sugerida

A máquina pode ser representada por uma classe contendo:

### Atributos:
- nível de água
- nível de shampoo
- presença de pet
- estado de limpeza da máquina

### Métodos:
- colocarPet()
- retirarPet()
- darBanho()
- abastecerAgua()
- abastecerShampoo()
- limparMaquina()
- verificarNivelAgua()
- verificarNivelShampoo()
- verificarPet()

---

## 🚀 Finalidade Educacional

Este projeto é voltado para o aprendizado de:
- Encapsulamento
- Controle de estado
- Regras de negócio
- Estruturação de classes e métodos
