# Faça um programa que leia o nome de um vendedor, o seu salário fixo e o 
# total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
# vendedor ganha15% de comissão sobre suas vendas efetuadas, informar o
# total a receber no final do mês

COMISSAO = float(0.15)
nome = str(input('Insira seu nome: '))
salFixo = float(input('Insira seu salário fixo: '))
vendas = int(input('Insira o total de vendas: '))
salFinal = salFixo + vendas * COMISSAO
print('Salário final: {:.2f}'.format(salFinal))
