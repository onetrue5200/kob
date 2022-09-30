package top.onetrue.botrunningsystem.service.impl;

import org.springframework.stereotype.Service;
import top.onetrue.botrunningsystem.service.BotRunningService;

@Service
public class BotRunningServiceImpl implements BotRunningService {
    @Override
    public String addBot(Integer userId, String botCode, String input) {
        System.out.println("add bot: " + userId + " " + botCode + " " + input);
        return "add bot success";
    }
}
