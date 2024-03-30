# Elaborar um programa que apresente o valor da conversão em dólar (US$) 
# de umvalor lido em real (R$). O programa deve solicitar ao usuário o valor 
# da cotação dodólar e também a quantidade de reais disponível

SAL_MIN = 1412.00
sal = float(input('Insira o valor do salário: '))
print('Esse salário equivale a {:.1f} salários mínimos'.format(sal/SAL_MIN))
