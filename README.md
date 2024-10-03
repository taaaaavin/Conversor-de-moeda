# Conversor-de-Moeda
## Resumo
Faz a conversão de uma moeda origem para uma moeda destino, de acordo com o câmbio atual, utlizando a API CurrencyLayer
# Conversor de Moedas em Java

Este é um projeto de **Conversor de Moedas** desenvolvido em Java com interface gráfica utilizando **Swing**. O aplicativo consome a API de taxas de câmbio da [Apilayer](https://apilayer.com/) para converter valores entre diferentes moedas.

## Funcionalidades

- Interface gráfica para selecionar as moedas de origem e destino.
- Suporte para as seguintes moedas:
    - Real (BRL)
    - Dólar (USD)
    - Euro (EUR)
    - Libra (GBP)
    - Peso Argentino (ARS)
    - Peso Chileno (CLP)
- Conversão automática com base nas taxas de câmbio atuais fornecidas pela API da Apilayer.
- Exibição do resultado convertido na interface gráfica.
- Controle de erros para entrada de valores inválidos.

## Estrutura do Projeto

- **APIService.java**: Classe responsável por realizar a requisição à API da Apilayer e obter as taxas de câmbio.
- **Conversor.java**: Classe principal que gerencia a lógica do conversor.
- **ConversorFrame.java**: Classe responsável pela interação com o usuário com a interface gráfica.
- **OPCOES**: Array de opções de moedas que podem ser escolhidas pelo usuário.


## Exemplo

![image](https://github.com/user-attachments/assets/c713a2b3-6d5b-4a46-89c1-7f85701723bd)
</br>
![image](https://github.com/user-attachments/assets/f15a89e4-5ab3-4730-987e-3cee59a09507)
</br>
![image](https://github.com/user-attachments/assets/d829d1fc-7968-4fc3-9f07-20b5dee9fffe)
</br>
![image](https://github.com/user-attachments/assets/a7b3f7d8-971d-4a31-b49f-50d11e442f6c)
