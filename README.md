## Como executar

### Pré-requisitos
- Java 21 (LTS) instalado — verifique com: `java -version`
    - Caso não tenha, recomendamos instalar via [SDKMAN](https://sdkman.io/) ou [Eclipse Temurin](https://adoptium.net/)
    - ⚠️ Evite versões early-access (ex: 25-ea) — podem causar erro de compilação

### Passo a passo

1. Clone o repositório:
```bash
   git clone https://github.com/Lucas-Siqueira1/LabTIME-teste-tecnico.git
   cd teste-tecnico-estagio
```

2. Compile o projeto usando o Maven Wrapper (não é necessário ter o Maven instalado):

   **Linux/Mac:**
```bash
   ./mvnw clean package
```

**Windows:**
```bash
   mvnw.cmd clean package
```

3. Execute o programa:
```bash
   java -jar target/teste-tecnico-estagio-1.0-SNAPSHOT.jar
```

4. O menu principal será exibido no terminal. Use os números indicados para navegar entre os tickets.