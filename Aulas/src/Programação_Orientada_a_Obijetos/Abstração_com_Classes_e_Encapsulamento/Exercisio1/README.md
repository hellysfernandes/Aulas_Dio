# Exercício 1 — Conta Bancária (POO)

## 📌 Descrição
Este projeto tem como objetivo implementar uma **Conta Bancária** utilizando os conceitos de **Programação Orientada a Objetos**, com foco em **Abstração** e **Encapsulamento**.

A conta deve permitir a realização de operações básicas de um banco, incluindo o uso de **cheque especial**, respeitando regras específicas definidas no enunciado.

---

## 🏦 Funcionalidades da Conta

A conta bancária deve permitir as seguintes operações:

- Consultar saldo
- Consultar o valor disponível do cheque especial
- Depositar dinheiro
- Sacar dinheiro
- Pagar um boleto
- Verificar se a conta está utilizando o cheque especial

---

## 📏 Regras de Negócio

### 1. Limite da Conta
O limite total disponível para uso da conta é composto por:
Saldo + Cheque Especial


---

### 2. Definição do Cheque Especial
O valor do cheque especial deve ser definido **no momento da criação da conta**, com base no **valor do depósito inicial**, obedecendo às seguintes regras:

- Se o depósito inicial for **menor ou igual a R$ 500,00**  
  → O cheque especial será de **R$ 50,00**.

- Se o depósito inicial for **maior que R$ 500,00**  
  → O cheque especial será de **50% do valor depositado**.

#### Exemplos:
- Depósito inicial de R$ 300,00 → Cheque especial = R$ 50,00
- Depósito inicial de R$ 600,00 → Cheque especial = R$ 300,00
- Depósito inicial de R$ 1.000,00 → Cheque especial = R$ 500,00

---

### 3. Uso do Cheque Especial
- O cheque especial pode ser utilizado quando o saldo da conta não for suficiente para realizar uma operação.
- A conta deve ser capaz de identificar se o cheque especial está sendo utilizado.

---

### 4. Taxa sobre o Cheque Especial
- Caso o cheque especial seja utilizado, a conta deve cobrar uma **taxa de 20%** sobre o **valor utilizado do cheque especial**.
- Essa taxa deve ser cobrada **assim que houver saldo disponível**, por exemplo, após um depósito.

#### Exemplo:
- Valor usado do cheque especial: R$ 100,00
- Taxa (20%): R$ 20,00
- Total a ser devolvido ao banco: R$ 120,00

---

## 🧠 Observações Importantes

- O **limite do cheque especial não deve ser alterado após a criação da conta**.
- Apenas o valor **utilizado** do cheque especial pode variar.
- As operações de **sacar dinheiro** e **pagar boleto** possuem a mesma lógica de débito da conta.

---

## 🎯 Objetivo do Exercício
Aplicar corretamente os conceitos de:
- Encapsulamento
- Uso de atributos `private`
- Uso de construtores
- Controle de regras de negócio
- Organização e clareza do código

---
