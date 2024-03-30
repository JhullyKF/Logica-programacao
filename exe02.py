# Elabore um algoritmo que leia uma temperatura em graus 
# Celsius digitada pelousuário e apresente-a convertida em 
# graus Fahrenheit. A fórmula de conversão é:
# F = (9.0/5.0) * C + 32.0,em que F é a temperatura em Fahrenheit 
# e C é a temperatura em Celsius.
temp = float(input('Insira uma tempera em Celsius: '))
resultado = float(temp * 9/5 + 32)
print('Resultado: {:.2f}'.format(resultado))