package top.onetrue.backend.controller.ranklist;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.onetrue.backend.service.ranklist.GetRanklistService;

import java.util.Map;

@RestController
public class GetRanklistController {
    @Autowired
    private GetRanklistService getRanklistService;

    @GetMapping("/ranklist/getlist/")
    public JSONObject getList(@RequestParam Map<String, String> data) {
        Integer page = Integer.parseInt(data.get("page"));
        return getRanklistService.getList(page);
    }
}
