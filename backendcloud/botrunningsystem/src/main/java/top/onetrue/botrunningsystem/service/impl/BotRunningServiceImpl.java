package top.onetrue.botrunningsystem.service.impl;

import org.springframework.stereotype.Service;
import top.onetrue.botrunningsystem.service.BotRunningService;
import top.onetrue.botrunningsystem.service.impl.utils.BotPool;

@Service
public class BotRunningServiceImpl implements BotRunningService {
    public final static BotPool botPool = new BotPool();
    @Override
    public String addBot(Integer userId, String botCode, String input) {
        System.out.println("add bot: " + userId + " " + botCode + " " + input);
        botPool.addBot(userId, botCode, input);
        return "add bot success";
    }
}
