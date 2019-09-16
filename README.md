# LogParserAPI
# LogParserAPI
API simples para o repositório do parser do log gerado pelo jogo Quake 3. Este parser lê o arquivo games.log e computa as informações de cada jogo:
  
  - Nome e quantidades de mortes para cada jogador
  - Quantidade de mortes para cada causa de morte
  - Quantidade total de mortes no jogo

API criada em Java, usando o framework Spring e testada no Postman, para testá-la use a request games, com o parameto game e o id do respectivo jogo, exemplo : localhost:8080/games?game=2
