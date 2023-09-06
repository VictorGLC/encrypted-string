# README - Programa de Criptografia

## Visão Geral
Este programa em Java foi projetado para criptografar uma string de entrada usando uma técnica simples de cifra de transposição. O código recebe uma entrada de texto simples, remove espaços e, em seguida, rearranja os caracteres em uma estrutura de grade, criando uma string criptografada lendo os caracteres coluna por coluna.

## Como o Código Funciona
Aqui está uma explicação passo a passo de como o código funciona:

1. **String de Entrada**:
   - O programa começa com uma string de entrada, que é inicialmente definida como "tenha um bom dia" no código fornecido. Você pode alterar esta entrada modificando a variável `stringInput`.

2. **Tratamento da String**:
   - A string de entrada é processada para remover espaços usando o método `replace`, resultando na `treatedString` (string tratada).

3. **Determinação do Tamanho da Grade**:
   - O código calcula a raiz quadrada do comprimento da `treatedString` e arredonda para cima para o inteiro mais próximo. Esse valor é armazenado na variável `sqrtLength`. Isso determina as dimensões da grade usada para criptografia.

4. **Separação da String**:
   - Os caracteres da `treatedString` são separados em strings individuais e armazenados em uma lista chamada `stringsSeparatedList` (lista de strings separadas).

5. **Criação de uma Matriz 2D**:
   - Uma matriz 2D chamada `organizatedString` é criada com dimensões `sqrtLength` por `sqrtLength`. Essa matriz conterá os caracteres de `stringsSeparatedList` em uma estrutura de grade.

6. **Preenchimento da Matriz 2D**:
   - Os caracteres de `stringsSeparatedList` são colocados na matriz `organizatedString` linha por linha. O loop itera pelas linhas e colunas da matriz, preenchendo-a com caracteres de `stringsSeparatedList`. Essa organização é essencial para a criptografia.

7. **Criptografia**:
   - O código criptografa a string lendo os caracteres da matriz `organizatedString` coluna por coluna. Ele itera pelas colunas da matriz e adiciona cada caractere à `encryptedList` (lista criptografada). Além disso, ele adiciona um caractere de espaço após cada coluna lida, o que separa os caracteres criptografados.

8. **Impressão da String Criptografada**:
   - Por fim, o programa imprime a string criptografada iterando pela `encryptedList` e imprimindo cada caractere no console. A string criptografada é exibida como uma sequência contínua sem espaços.

## Executando o Código
Para executar este código:
1. Certifique-se de ter o Java instalado em seu sistema.
2. Copie e cole o código fornecido em um arquivo Java (por exemplo, `EncryptionProgram.java`).
3. Compile e execute o código usando seu ambiente de desenvolvimento Java preferido ou executando os seguintes comandos em seu terminal:

   ```bash
   javac EncryptionProgram.java
   java com.encrypted.Program.Main
   ```

4. O programa criptografará a string de entrada e exibirá o resultado no console.

Sinta-se à vontade para personalizar a variável `stringInput` com seu próprio texto de entrada para ver como a criptografia funciona com mensagens diferentes.
