package top.onetrue.backend.service.impl.user.bot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import top.onetrue.backend.mapper.BotMapper;
import top.onetrue.backend.pojo.Bot;
import top.onetrue.backend.pojo.User;
import top.onetrue.backend.service.impl.utils.UserDetailsImpl;
import top.onetrue.backend.service.user.bot.GetListService;

import java.util.List;

@Service
public class GetListServiceImpl implements GetListService {
    @Autowired
    private BotMapper botMapper;

    @Override
    public List<Bot> getList() {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();

        QueryWrapper<Bot> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", user.getId());

        return botMapper.selectList(queryWrapper);
    }
}
