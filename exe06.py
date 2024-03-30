# Escreva um programa que leia o nome de um funcionário, seu número 
# de horas trabalhadas, o valor que recebe por hora e calcule o salário 
# desse funcionário. A seguir, mostre o nome e o salário do funcionário.

nome = str(input('Informe seu nome: '))
numHoras = float(input('Informe seu número de horas trabalhadas: '))
valorHora = float(input('Informe o valor da hora: '))

sal = numHoras * valorHora

print('O funcionário {} recebe {:.2f}'.format(nome, sal))
