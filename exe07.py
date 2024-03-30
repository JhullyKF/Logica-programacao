# Escreva um algoritmo que pergunte ao usuário a quantidade de km 
# percorridos porum carro alugado e a quantidade de dias pelos quais 
# ele foi alugado. Calcule emostre o valor a pagar, sabendo que o carro 
# custa R$70,00 por dia e R$0,15 por km rodado

DIA = float(70.00)
KM = float(0.15)

qtd_km = float(input('Informe a quantidade de Km rodado: '))
qtd_dias = int(input('Informe a quantidade de dias que ele foi alugado: '))

resultado = qtd_km * KM + qtd_dias * DIA
print('Resultado: {:.2f}'.format(resultado))
