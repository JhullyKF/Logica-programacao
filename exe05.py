# Leia 3 valores, no caso, variáveis A, B e C, que são as três notas 
# de um aluno. A seguir, calcule a média do aluno, sabendo que a 
# nota A tem peso 2, a nota B tempeso 3 e a nota C tem peso 5
PESO_A = 2
PESO_B = 3
PESO_C = 5
notaA = float(input('Insira a primeira nota: '))
notaB = float(input('Insira a segunda nota: '))
notaC = float(input('insira terceira nota: '))

resultado = float((notaA * PESO_A + notaB * PESO_B + notaC * PESO_C) / (PESO_A + PESO_B + PESO_C))
print('Média: {:.2f}'.format(resultado))
