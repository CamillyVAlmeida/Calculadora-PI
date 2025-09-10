# Calculadora PI

Uma calculadora simples desenvolvida em Java que realiza operações matemáticas básicas (soma, subtração, multiplicação e divisão) através de uma interface de linha de comando.

## Funcionalidades

- **Soma**: Adição de dois números
- **Subtração**: Subtração de dois números  
- **Multiplicação**: Multiplicação de dois números
- **Divisão**: Divisão de dois números (com proteção contra divisão por zero)
- **Interface interativa**: Permite realizar múltiplas operações em sequência
- **Tratamento de erros**: Validação de operações inválidas e divisão por zero

## Tecnologias Utilizadas

- **Java 21**: Linguagem de programação principal
- **Maven**: Gerenciador de dependências e build
- **JUnit 5**: Framework de testes unitários
- **Scanner**: Para entrada de dados via console

## Estrutura do Projeto

```
Calculadora-PI/
├── PI/
│   ├── pom.xml                          # Configuração do Maven
│   └── src/
│       ├── main/
│       │   └── java/
│       │       └── Calculadora/
│       │           ├── Calculadora.java # Classe principal com operações matemáticas
│       │           └── Main.java        # Classe principal com interface do usuário
│       └── test/
│           └── java/
│               └── Calculadora/
│                   ├── CalculadoraTest.java # Testes unitários principais
│                   └── UnitarioTest.java    # Testes unitários adicionais
└── README.md
```

## Como Executar

### Pré-requisitos

- Java 21 ou superior
- Maven 3.6 ou superior

### Executando o Projeto

1. **Clone o repositório** (se aplicável):
   ```bash
   git clone <url-do-repositorio>
   cd Calculadora-PI
   ```

2. **Navegue até o diretório do projeto**:
   ```bash
   cd PI
   ```

3. **Compile o projeto**:
   ```bash
   mvn compile
   ```

4. **Execute a aplicação**:
   ```bash
   mvn exec:java -Dexec.mainClass="Calculadora.Main"
   ```

   Ou execute diretamente:
   ```bash
   java -cp target/classes Calculadora.Main
   ```

### Executando os Testes

```bash
mvn test
```

## Como Usar

1. Execute o programa conforme as instruções acima
2. Digite o primeiro valor quando solicitado
3. Digite a operação desejada (+, -, *, /)
4. Digite o segundo valor
5. O resultado será exibido
6. Escolha se deseja realizar uma nova operação (S/N)

### Exemplo de Uso

```
Digite o primeiro valor:
10
Digite a operação (+, -, *, /):
+
Digite o segundo valor:
5
Resultado: 15.0
Deseja realizar nova operação? (S ou N):
S
```

## Testes

O projeto inclui testes unitários abrangentes que cobrem:

- Operações de soma
- Operações de subtração  
- Operações de multiplicação
- Operações de divisão
- Tratamento de divisão por zero
- Validação de operações inválidas

### Executando Testes Específicos

```bash
# Executar todos os testes
mvn test

# Executar apenas CalculadoraTest
mvn test -Dtest=CalculadoraTest

# Executar apenas UnitarioTest  
mvn test -Dtest=UnitarioTest
```

## Operações Suportadas

| Operação | Símbolo | Exemplo | Resultado |
|----------|---------|---------|-----------|
| Soma | + | 5 + 3 | 8.0 |
| Subtração | - | 10 - 4 | 6.0 |
| Multiplicação | * | 3 * 7 | 21.0 |
| Divisão | / | 15 / 3 | 5.0 |

## Tratamento de Erros

- **Divisão por zero**: Retorna `IllegalArgumentException` com mensagem "Não é possível dividir por zero."
- **Operação inválida**: Retorna `IllegalArgumentException` com mensagem "Operação inválida!"
- **Entrada inválida**: O programa solicita nova entrada em caso de formato incorreto

## Configuração do Projeto

### Maven (pom.xml)

- **Java Version**: 21
- **Encoding**: UTF-8
- **JUnit Version**: 5.10.2
- **Maven Compiler Plugin**: 3.11.0
- **Maven Surefire Plugin**: 3.0.0-M9

## Cobertura de Testes

Os testes cobrem todos os métodos públicos da classe `Calculadora`:

- `somar(double, double)`
- `subtrair(double, double)`
- `multiplicar(double, double)`
- `dividir(double, double)`

## Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

## Autor

Desenvolvido como parte de um projeto de aprendizado em Java.

---

**Nota**: Este é um projeto educacional desenvolvido para demonstrar conceitos básicos de programação em Java, incluindo orientação a objetos, tratamento de exceções e testes unitários.
