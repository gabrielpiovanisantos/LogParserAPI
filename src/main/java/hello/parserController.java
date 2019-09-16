package hello;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class parserController {

    //retorna as informações do jogo a partir do seu id exemplo: /games?game=15
    @RequestMapping("/games")
    public static Game games(@RequestParam(value="game", defaultValue="") Integer id) {

        ArrayList<String> strs = Parser.readFile();
        ArrayList<Game> games = new ArrayList<Game>();
        strs = Parser.excludeTime(strs);


        games = Parser.coreMethod(strs);
        for (Game game : games)
            game.getPlayers().remove(0);


        return games.get(id);
    }



}
