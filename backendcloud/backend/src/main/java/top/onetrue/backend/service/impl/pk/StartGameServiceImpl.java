package top.onetrue.backend.service.impl.pk;

import org.springframework.stereotype.Service;
import top.onetrue.backend.consumer.WebSocketServer;
import top.onetrue.backend.service.pk.StartGameService;

@Service
public class StartGameServiceImpl implements StartGameService {
    @Override
    public String startGame(Integer aId, Integer bId) {
        System.out.println("start game: " + aId + " " + bId);
        WebSocketServer.startGame(aId, bId);
        return "start game success";
    }
}
