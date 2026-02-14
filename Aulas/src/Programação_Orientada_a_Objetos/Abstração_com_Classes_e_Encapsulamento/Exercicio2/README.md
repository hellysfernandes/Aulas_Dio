# Exercício 2 - Controle de Carro (POO)

## 📌 Descrição 

O objetivo desta atividade é implementar um **sistema de controle de um carro**, aplicando os conceitos de **Abstração, Encapsulamento e Controle de Estado** em Programação Orientada a Objetos.
Você deverá criar uma classe que represente um carro e permita controlar seu funcionamento respeitando regras específicas de velocidade, marchas e estado (ligado ou desligado).

---

## ⚙️ Funcionalidades Obrigatórias

O carro deve possuir os seguintes comportamentos:

- Ligar o carro
- Desligar o carro
- Acelerar
- Diminuir a velocidade
- Virar para a esquerda
- Virar para a direita
- Verificar a velocidade atual
- Trocar a marcha

---

## 🚦 Estado Inicial do Carro

Ao ser criado, o carro deve iniciar com:

- 🚫 **Desligado**
- ⚙️ **Marcha 0 (ponto morto)**
- 🧭 **Velocidade = 0 km/h**

---

## 🔒 Regras de Funcionamento

### 🔑 Estado do Carro

- Um carro **desligado não pode executar nenhuma função**, exceto ligar.
- O carro **só pode ser desligado** se:
    - Estiver em **ponto morto (marcha 0)**
    - Estiver com **velocidade igual a 0 km/h**

---

### 🚀 Velocidade

- Acelerar incrementa a velocidade em **1 km/h**
- Diminuir velocidade decrementa a velocidade em **1 km/h**
- Velocidade mínima: **0 km/h**
- Velocidade máxima: **120 km/h**

---

### ⚙️ Marchas

- O carro possui **6 marchas**, além do **ponto morto (marcha 0)**
- **Não é permitido pular marchas**
- A marcha deve ser compatível com a velocidade atual

#### 📊 Limite de Velocidade por Marcha

| Marcha | Velocidade Permitida |
|------|----------------------|
| 0 (Ponto morto) | Não pode acelerar |
| 1ª | 0 km/h a 20 km/h |
| 2ª | 21 km/h a 40 km/h |
| 3ª | 41 km/h a 60 km/h |
| 4ª | 61 km/h a 80 km/h |
| 5ª | 81 km/h a 100 km/h |
| 6ª | 101 km/h a 120 km/h |

---

### 🔄 Troca de Marcha

- Só é permitido:
    - Subir **uma marcha por vez**
    - Descer **uma marcha por vez**
- A marcha selecionada deve ser compatível com a velocidade atual do carro

---

### ↩️ Direção (Virar)

O carro **só pode virar para a esquerda ou direita** se:

- Velocidade mínima: **1 km/h**
- Velocidade máxima: **40 km/h**

---

## 🧠 Objetivo Educacional

Esta atividade tem como foco:

- Praticar **encapsulamento**
- Controlar **estado interno de objetos**
- Implementar **regras de negócio**
- Desenvolver lógica condicional aplicada a situações reais

---

## 📎 Observações

- Utilize boas práticas de Java
- Não utilize atributos públicos
- Valide todas as ações antes de executá-las
- Exiba mensagens claras ao usuário

---

📘 *Atividade destinada ao estudo de Abstração e Encapsulamento em Programação Orientada a Objetos.*
