# 25. - mouredev.weeklychallenge2022 #25
""" ROCK, PAPER, SCISSORS
Crea un programa que calcule quien gana más partidas al piedra, papel, tijera.
- El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
- La función recibe un listado que contiene pares, representando cada jugada.
- El par puede contener combinaciones de "R" (piedra), "P" (papel) o "S" (tijera).
- Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2". """

VALUES = ["R","P","S"]

def game(games: list[tuple]):
    player1PTS = 0
    player2PTS = 0

    for i in games:
        if type(i) != tuple or len(i) != 2 or (i[0] not in VALUES) or (i[1] not in VALUES):
            return "error"
        
        player1 = i[0]
        player2 = i[1]

        if player1 != player2:
            #if player1 wins
            if player1 == VALUES[0] and player2 == VALUES[2]:
                player1PTS+=1
            elif player1 == VALUES [2] and player2 == VALUES[1]:
                player1PTS+=1
            elif player1 == VALUES[1] and player2 == VALUES[0]:
                player1PTS+=1
            #if player2 wins
            else:
                player2PTS+=1  

    if player1PTS == player2PTS:
        return 'Tie'
    elif player1PTS > player2PTS:
        return 'Player1'
    elif player1PTS < player2PTS:
        return 'Player2'
        


# Tests
print(game([("R", "P"), ("R", "R"), ("S", "P")]))
print(game([("R", "P"), ("R", "S"), ("P", "R")]))
print(game([("R", "P"), ("P", "S"), ("P", "R")]))
print(game([(0), ("S", "P"), ("P", "R"), ("R", "P")]))
print(game([("S", "P"), ("P", "R"), ("R", "P"), "R"]))
