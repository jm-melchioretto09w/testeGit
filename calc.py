print("Seja bem vind@ a minha calculadora:\nInsia as contas completas e espaçadas ex: '5 + 4'")

while True:
    n1, opt, n2 = (input().split() + [None, None])[:3]
    
    if n1 == "-->":
        break

    txt_size = len(n1) + len(n2) + 3

    n1 = float(n1)
    n2 = float(n2)

    res = 0

    match opt:
        case "+":
            res = n1 + n2
        case "-":
            res = n1 - n2
        case "*":
            res = n1 * n2
        case "/":
            res = n1 / n2
        case "^":
            res = n1 ** n2
        case _:
            res = "ERROR"

    print(f"\033[1A\033[{txt_size}C = {res}")

print("Saindo...")