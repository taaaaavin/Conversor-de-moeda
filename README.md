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

![image](https://github.com/user-attachments/assets/8c31ce4f-c35e-47a9-a95c-100b994a0bff)
</br>
![image](https://github.com/user-attachments/assets/0aa58055-2779-4f93-a74b-9c08cb18b75b)
</br>
![image](https://github.com/user-attachments/assets/81b7392a-bc81-4a44-b4e9-27dbf1854dad)
</br>
![image](https://github.com/user-attachments/assets/b586d5c3-1e88-496e-93b0-7e5dcdacc5cc)
