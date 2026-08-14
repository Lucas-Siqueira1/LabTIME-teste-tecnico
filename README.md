## Pré-requisitos

* Java 21 (LTS) instalado — verifique com: `java -version`

## Passo a passo

1. **Clone o repositório e acesse a pasta:**
   ```bash
   git clone https://github.com/Lucas-Siqueira1/LabTIME-teste-tecnico.git
   cd LabTIME-teste-tecnico
   ```

2. **Compile o projeto:**

   **Linux/Mac:**
   ```bash
   ./mvnw clean package
   ```

   **PowerShell (Windows):**
   ```powershell
   .\mvnw.cmd clean package
   ```

3. **Execute o programa:**
   ```bash
   java -jar target/teste-tecnico-estagio-1.0-SNAPSHOT.jar
   ```

## Mapeamento e Justificativa dos Padrões

### Ticket 1: Sistema de Contingência do Núcleo da Nave

Ao ler o campo de requisito de ticket 1, foi possível perceber que o desafio era conseguir implementar algo que me 
permitisse disparar ações específicas (medidas de emergência da nave) a partir de um determinado gatilho (nível crítico 
de energia do núcleo). A restrição arquitetural exigia que a classe do núcleo não conhecesse, referenciasse ou chamasse 
diretamente as classes das ações de emergencia, então, por isso, o padrão que eu escolhi foi o **Observer**. Esse padrão 
possibilita seguir corretamente o requisito e a restrição exigida. Sobre a implementação, o meu código possui 3 classes 
observadoras (pacote Observers): Escudo.java, Luzes.java e Painel.java, além da interface Observer que define o método 
notificate como contrato. As classes observadoras implementam essa interface, cada uma delas implementando a sua própria 
lógica para o método notificate. Dessa forma, a classe do núcleo não precisa conhecer e nem interagir diretamente com as 
classes observadoras. Um ponto que eu considero interessante de ser citado é o uso de enums para melhorar a clareza e diminuir 
o acoplamento do código. Seguindo a lógica que eu usei para implementar esse ticket, o gatilho para disparar os observadores 
dependia da variável inteira contagemDano e, por isso, sem o uso de enums, todas as classes que tivessem condições que dependiam 
de contagemDano precisariam usar um valor fixo da variável, espalhando esse valor pelo código, o que dificultaria uma possível mudança de 
lógica, como diminuir o dano que a nave tomava a cada interação com o comando de tomar dano, já que teria que mudar o valor em todas 
as classes que usavam esse valor. O uso do enum permite que essa alteração seja feita apenas na classe enumeradora.

### Ticket 2: Comportamento Dinâmico da Tripulação

A escolha do padrão desse ticket foi algo interessante, pois ao ler o requisito e a restrição arquitetural, eu já percebi que se tratava do caso base de uso do padrão Strategy, onde nós temos algumas estratégias que podem ser mudadas dinamicamente de acordo com a vontade do usuário. Entretanto, eu também pensei no padrão State (eu já havia utilizado tanto o padrão Strategy quanto o State anteriormente, então já sabia como funcionava a implementação deles), pois, pensando no conceito teorico do State, nos temos um objeto (NPC) que pode assumir diferentes estados (funções), o que se difere um pouco da ideia conceitual do padrão Strategy, que se baseia em um problema/ação que pode ser resolvida(o) por diversas estratégias. Porém, o padrão State, em sua implementação, define que o próprio objeto decida para qual estado ele irá transicionar, e o requisito do ticket 2 exige que o usuário escolha para qual função o NPC irá. Em resumo, a minha implementação foi do padrão Strategy, pois por mais que eu considere que a ideia conceitual do problema se encaixava mais ao padrão State, o fato de o usuário escolher qual será a próxima função do NPC foge da implementação do State. Então, sobre a implementação do Strategy, meu código possui a interface Funcao (a estratégia) com o método trabalhar, que define o contrato que cada estratégia deve seguir. O sistema possui três classes de estratégias: FuncaoMecanico.java, FuncaoOperadorCanhoes.java e FuncaoPiloto.java, que implementam a interface Funcao, permitindo, assim, que a classe Tripulante não precise conhecer cada estratégia específica, apenas possua uma referência para a interface Funcao e um método trocarFuncao para alterar a função do NPC. Dessa forma, a implementação seguiu exatamente o requisito e a restrição, visto que o NPC não é destruído a cada troca de função e a classe tripulante não possui blocos de if/else ou switch.

### Ticket 3: Armamento Modular e Modificadores Piratas

Para resolver esse ticket eu utilizei dois padrões diferentes, o padrão Strategy e o Decorator. Nesse ticket, de acordo com o requisito e a restrição, a nave não poderia implementar diretamente a lógica de cada arma e deveria apenas emitir o comando genérico de atirar e, sendo assim, o padrão Strategy era o ideal, visto que eu poderia tratar cada arma como uma estratégia. Porém, o ticket também falava sobre adicionar modificadores nas armas, permitindo empilhar essas modificações, problema esse que o Strategy não consegue resolver. Então, por causa disso, eu decidi usar o padrão Decorator para resolver essa parte do ticket, visto que ele me permite adicionar funcionalidades dinamicamente a um objeto, resolvendo, portanto, o problema do empilhamento de modificações. Partindo para implementação de cada padrão, o código possui a interface Arma, contendo o método atirar, que representa a estratégia, e também possui as classes das armas que implementam essa interface. Já o decorator possui uma implementação mais complexa, para ele nos temos uma classe abstrata (ArmamentoDecorator) que implementa a interface arma e que vai ser a superclasse das classes de modificações, que vão herdar dessa classe. A classe ArmamentoDecorator possui uma referência para interface Arma, para saber qual vai ser a arma modificada, e o motivo pelo qual essa classe abstrata implementa a interface Arma, é para que as classes que herdarem dela implementem o método atirar, adicionando a modificação. Dessa forma, a classe nave apenas emite o comando de atirar, como exigido na restrição, e as modificações podem ser adicionadas dinamicamente, sem necessitar da criação de uma classe para cada combinação de modificações.