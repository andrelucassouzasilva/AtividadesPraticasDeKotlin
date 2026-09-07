# Atividades Práticas de Kotlin

Projeto Android desenvolvido no Android Studio, em Kotlin, reunindo uma coleção de atividades práticas de fixação envolvendo fórmulas de física, matemática, conversões de unidades e pequenas simulações de compras. Cada atividade é uma `Activity` independente, acessada a partir de um menu principal.

## Sobre o projeto

- **Linguagem:** Kotlin
- **IDE:** Android Studio
- **Package:** `com.example.atividadesmariow`
- **minSdk:** 24
- **targetSdk / compileSdk:** 37
- **UI:** Views tradicionais (XML) com `AppCompatActivity`, `EditText`, `Button`, `RadioGroup`, `CheckBox` e `Spinner`

## Estrutura de navegação

O app abre em uma `MainActivity` com um menu de botões, um para cada atividade. Ao tocar em um botão, o app navega (via `Intent`) até a `Activity` correspondente.

**[ COLE AQUI O PRINT: Tela do menu principal ]**


---

## Lista de atividades

### 1. Velocidade (v = d/t)
Calcula a velocidade média a partir da distância percorrida e do tempo gasto.

- **Entradas:** Distância (m), Tempo (s)
- **Fórmula:** `v = d / t`
- **Saída:** Velocidade em m/s
- **Validação:** tempo não pode ser zero

**Arquivo:** [VelocidadeActivity.kt](app/src/main/java/com/example/atividadesmariow/VelocidadeActivity.kt)

**[ COLE AQUI O PRINT: Atividade 1 - Velocidade ]**


---

### 2. Força (F = m·a)
Calcula a força resultante a partir da massa e da aceleração (2ª Lei de Newton).

- **Entradas:** Massa (kg), Aceleração (m/s²)
- **Fórmula:** `F = m * a`
- **Saída:** Força em Newtons (N)

**Arquivo:** [ForcaActivity.kt](app/src/main/java/com/example/atividadesmariow/ForcaActivity.kt)

**[ COLE AQUI O PRINT: Atividade 2 - Força ]**


---

### 3. Energia Cinética (E = m·v²/2)
Calcula a energia cinética de um corpo em movimento.

- **Entradas:** Massa (kg), Velocidade (m/s)
- **Fórmula:** `E = (m * v²) / 2`
- **Saída:** Energia em Joules (J)

**Arquivo:** [EnergiaActivity.kt](app/src/main/java/com/example/atividadesmariow/EnergiaActivity.kt)

**[ COLE AQUI O PRINT: Atividade 3 - Energia Cinética ]**


---

### 4. Fahrenheit para Celsius
Converte uma temperatura em graus Fahrenheit para graus Celsius.

- **Entrada:** Temperatura (°F)
- **Fórmula:** `C = 5 * (F - 32) / 9`
- **Saída:** Temperatura em °C

**Arquivo:** [FahrenheitParaCelsiusActivity.kt](app/src/main/java/com/example/atividadesmariow/FahrenheitParaCelsiusActivity.kt)

**[ COLE AQUI O PRINT: Atividade 4 - Fahrenheit para Celsius ]**


---

### 5. Celsius para Fahrenheit
Converte uma temperatura em graus Celsius para graus Fahrenheit.

- **Entrada:** Temperatura (°C)
- **Fórmula:** `F = (9 * C + 160) / 5`
- **Saída:** Temperatura em °F

**Arquivo:** [CelsiusParaFahrenheitActivity.kt](app/src/main/java/com/example/atividadesmariow/CelsiusParaFahrenheitActivity.kt)

**[ COLE AQUI O PRINT: Atividade 5 - Celsius para Fahrenheit ]**


---

### 6. Volume do Paralelepípedo
Calcula o volume de um paralelepípedo a partir de suas três dimensões.

- **Entradas:** Lado A, Lado B, Lado C
- **Fórmula:** `V = a * b * c`
- **Saída:** Volume em unidades³

**Arquivo:** [ParalelepipedoActivity.kt](app/src/main/java/com/example/atividadesmariow/ParalelepipedoActivity.kt)

**[ COLE AQUI O PRINT: Atividade 6 - Volume do Paralelepípedo ]**


---

### 7. Equação de Torricelli
Calcula a velocidade final de um corpo em movimento uniformemente variado, sem depender do tempo.

- **Entradas:** Velocidade inicial (v0), Aceleração (a), Deslocamento (ΔS)
- **Fórmula:** `v² = v0² + 2 * a * ΔS`
- **Saída:** Velocidade final em m/s
- **Validação:** se `v²` resultar negativo, os valores são reportados como inválidos

**Arquivo:** [TorricelliActivity.kt](app/src/main/java/com/example/atividadesmariow/TorricelliActivity.kt)

**[ COLE AQUI O PRINT: Atividade 7 - Equação de Torricelli ]**


---

### 8. Fórmula da Diluição
Calcula o volume final de uma solução diluída, a partir da concentração inicial, volume inicial e concentração final.

- **Entradas:** C1 (concentração inicial), V1 (volume inicial), C2 (concentração final)
- **Fórmula:** `C1 * V1 = C2 * V2` → `V2 = (C1 * V1) / C2`
- **Saída:** Volume final (V2)
- **Validação:** C2 não pode ser zero

**Arquivo:** [DiluicaoActivity.kt](app/src/main/java/com/example/atividadesmariow/DiluicaoActivity.kt)

**[ COLE AQUI O PRINT: Atividade 8 - Fórmula da Diluição ]**


---

### 9. Seno, Cosseno e Tangente
Calcula seno, cosseno e/ou tangente de um ângulo (em graus), conforme as opções marcadas nos checkboxes.

- **Entrada:** Ângulo (graus)
- **Opções:** Seno, Cosseno, Tangente (uma ou mais podem ser marcadas)
- **Saída:** Valores calculados com 4 casas decimais
- **Validação:** ao menos uma opção deve estar marcada

**Arquivo:** [TrigonometriaActivity.kt](app/src/main/java/com/example/atividadesmariow/TrigonometriaActivity.kt)

**[ COLE AQUI O PRINT: Atividade 9 - Seno, Cosseno e Tangente ]**


---

### 10. Movimento Uniforme
Calcula distância, velocidade ou tempo no Movimento Retilíneo Uniforme, conforme a(s) opção(ões) marcada(s).

- **Entradas:** Distância, Velocidade, Tempo (conforme o que for necessário para o cálculo escolhido)
- **Fórmula base:** `d = v * t`
- **Opções:** calcular Distância, Velocidade e/ou Tempo
- **Validação:** tempo e velocidade não podem ser zero quando usados como divisor

**Arquivo:** [MovimentoUniformeActivity.kt](app/src/main/java/com/example/atividadesmariow/MovimentoUniformeActivity.kt)

**[ COLE AQUI O PRINT: Atividade 10 - Movimento Uniforme ]**


---

### 11. Energia Mecânica
Calcula energia potencial, energia cinética e/ou energia mecânica total de um corpo, conforme a(s) opção(ões) marcada(s).

- **Entradas:** Massa (kg), Altura (m), Velocidade (m/s)
- **Constante:** gravidade = 9,8 m/s²
- **Fórmulas:**
  - `Ep = m * g * h`
  - `Ec = (m * v²) / 2`
  - `Em = Ep + Ec`
- **Saída:** Energia(s) em Joules (J), conforme opção(ões) marcada(s)

**Arquivo:** [EnergiaMecanicaActivity.kt](app/src/main/java/com/example/atividadesmariow/EnergiaMecanicaActivity.kt)

**[ COLE AQUI O PRINT: Atividade 11 - Energia Mecânica ]**


---

### 12. Geometria de Áreas
Calcula a área de círculo, retângulo ou triângulo, conforme a forma selecionada em um `RadioGroup`. Os campos de entrada se adaptam dinamicamente à forma escolhida.

- **Círculo:** entrada = Raio → `Área = π * r²`
- **Retângulo:** entradas = Base e Altura → `Área = base * altura`
- **Triângulo:** entradas = Base e Altura → `Área = (base * altura) / 2`

**Arquivo:** [GeometriaAreasActivity.kt](app/src/main/java/com/example/atividadesmariow/GeometriaAreasActivity.kt)

**[ COLE AQUI O PRINT: Atividade 12 - Geometria de Áreas ]**


---

### 13. Lei de Ohm
Calcula tensão, corrente ou resistência elétrica, conforme a grandeza selecionada em um `RadioGroup`.

- **Tensão:** `V = R * I` (entradas: Corrente e Resistência)
- **Corrente:** `I = V / R` (entradas: Tensão e Resistência; resistência ≠ 0)
- **Resistência:** `R = V / I` (entradas: Tensão e Corrente; corrente ≠ 0)

**Arquivo:** [LeiDeOhmActivity.kt](app/src/main/java/com/example/atividadesmariow/LeiDeOhmActivity.kt)

**[ COLE AQUI O PRINT: Atividade 13 - Lei de Ohm ]**


---

### 14. Loja de Produtos
Simula a compra de um produto selecionado em um `Spinner` (Caneca, Camiseta ou Boné), exibindo a imagem correspondente e calculando o total a pagar pela quantidade informada.

- **Produtos e preços:** Caneca (R$ 25,00), Camiseta (R$ 45,00), Boné (R$ 35,00)
- **Entrada:** Quantidade
- **Fórmula:** `Total = preço * quantidade`
- **Validação:** quantidade deve ser maior que zero

**Arquivo:** [ProdutoActivity.kt](app/src/main/java/com/example/atividadesmariow/ProdutoActivity.kt)

**[ COLE AQUI O PRINT: Atividade 14 - Loja de Produtos ]**


---

### 15. Lanchonete
Simula a compra de um lanche selecionado em um `Spinner` (Hambúrguer, Pizza ou Salada), exibindo a imagem correspondente e aplicando desconto de 5% para 3 unidades ou mais.

- **Itens e preços:** Hambúrguer (R$ 18,00), Pizza (R$ 35,00), Salada (R$ 22,00)
- **Entrada:** Quantidade
- **Regra de desconto:** 5% de desconto quando `quantidade >= 3`
- **Saída:** Subtotal, desconto (se aplicável) e total

**Arquivo:** [LanchoneteActivity.kt](app/src/main/java/com/example/atividadesmariow/LanchoneteActivity.kt)

**[ COLE AQUI O PRINT: Atividade 15 - Lanchonete ]**


---

### 16. Papelaria
Simula a compra de um item de papelaria selecionado em um `Spinner` (Caderno, Caneta ou Marcador), exibindo a imagem correspondente e aplicando uma taxa fixa de 10% sobre o subtotal.

- **Itens e preços:** Caderno (R$ 12,00), Caneta (R$ 3,50), Marcador (R$ 7,00)
- **Entrada:** Quantidade
- **Taxa:** 10% sobre o subtotal
- **Saída:** Subtotal, taxa e total

**Arquivo:** [PapelariaActivity.kt](app/src/main/java/com/example/atividadesmariow/PapelariaActivity.kt)

**[ COLE AQUI O PRINT: Atividade 16 - Papelaria ]**


---

### 17. Combustível
Simula o abastecimento com um combustível selecionado em um `Spinner` (Gasolina, Etanol ou Diesel), exibindo a imagem correspondente e calculando o valor total a pagar pelos litros informados.

- **Combustíveis e preço/litro:** Gasolina (R$ 5,89), Etanol (R$ 3,99), Diesel (R$ 6,29)
- **Entrada:** Litros
- **Fórmula:** `Total = preço por litro * litros`
- **Validação:** litros deve ser maior que zero

**Arquivo:** [CombustivelActivity.kt](app/src/main/java/com/example/atividadesmariow/CombustivelActivity.kt)

**[ COLE AQUI O PRINT: Atividade 17 - Combustível ]**


---

## Como executar

1. Abra o projeto no Android Studio.
2. Aguarde a sincronização do Gradle.
3. Selecione um emulador ou dispositivo físico.
4. Execute o módulo `app` (Run ▶).

---

## Controle de versionamento (Git/GitHub)

O versionamento do projeto foi feito com **Git**, e o repositório remoto foi hospedado no **GitHub**, em:
[https://github.com/andrelucassouzasilva/AtividadesPraticasDeKotlin](https://github.com/andrelucassouzasilva/AtividadesPraticasDeKotlin)

Abaixo está o passo a passo real utilizado, com os comandos executados no terminal.

### 1. Inicialização do repositório local

O projeto já existia (criado no Android Studio) mas ainda não era um repositório Git. O primeiro passo foi iniciá-lo:

```bash
git init
```

O projeto já contava com um arquivo `.gitignore` (gerado pelo próprio Android Studio), responsável por excluir do versionamento pastas e arquivos que não devem ir para o repositório, como `/build`, `.gradle`, `local.properties` e arquivos `.iml`.

### 2. Adicionando os arquivos e criando o primeiro commit

```bash
git add -A
git status --short
```

O `git status --short` foi usado para conferir, antes de commitar, se nenhum arquivo de build ou configuração sensível (como `local.properties`) havia sido adicionado por engano.

```bash
git commit -m "Commit inicial: atividades praticas de Kotlin (Android Studio)"
```

### 3. Conectando ao repositório remoto no GitHub

```bash
git remote add origin https://github.com/andrelucassouzasilva/AtividadesPraticasDeKotlin.git
git branch -M main
git remote -v
```

- `git remote add origin` associa o repositório local ao repositório remoto criado no GitHub.
- `git branch -M main` garante que a branch principal se chame `main`.
- `git remote -v` confirma que o remoto foi configurado corretamente (fetch/push).

### 4. Enviando o primeiro commit ao GitHub

```bash
git push -u origin main
```

O `-u` (`--set-upstream`) associa a branch local `main` à branch remota `main`, permitindo que os próximos `git push`/`git pull` sejam feitos sem precisar informar `origin main` novamente.

### 5. Criação da documentação (README) e novo commit

Após o primeiro push, o arquivo `README.md` foi criado com a documentação do projeto e de todas as atividades. Esse novo arquivo passou pelo mesmo ciclo de versionamento:

```bash
git add README.md
git status --short
git commit -m "Adiciona documentacao do projeto e das atividades no README"
git push
```

Como a branch `main` já estava com upstream configurado (passo 4), o `git push` (sem parâmetros) já soube automaticamente para onde enviar o commit.

### Histórico de commits

```bash
git log --oneline
```

```
963aa55 Adiciona documentacao do projeto e das atividades no README
e27d39f Commit inicial: atividades praticas de Kotlin (Android Studio)
```

### Resumo dos comandos utilizados

| Comando | Finalidade |
|---|---|
| `git init` | Inicializa o repositório Git local |
| `git add -A` / `git add <arquivo>` | Adiciona arquivos à área de stage |
| `git status --short` | Verifica o que será commitado antes de confirmar |
| `git commit -m "mensagem"` | Cria um commit com as mudanças em stage |
| `git remote add origin <url>` | Associa o repositório local a um repositório remoto no GitHub |
| `git branch -M main` | Renomeia/garante a branch principal como `main` |
| `git remote -v` | Lista os remotos configurados |
| `git push -u origin main` | Envia o primeiro commit e define o upstream da branch |
| `git push` | Envia novos commits para o remoto já configurado |
| `git log --oneline` | Exibe o histórico resumido de commits |

**[ COLE AQUI O PRINT: Repositório no GitHub (lista de commits/arquivos) ]**
