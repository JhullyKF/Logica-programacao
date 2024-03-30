# Elaborar um programa que apresente o valor da conversão em dólar (US$) 
# de umvalor lido em real (R$). O programa deve solicitar ao usuário o valor 
# da cotação dodólar e também a quantidade de reais disponível

VALOR_DOLAR = 5.02
qtdReais = float(input('Insira a quantidade em reais: '))
print('Equivale a {:.2f} dólares'.format(qtdReais/VALOR_DOLAR))
