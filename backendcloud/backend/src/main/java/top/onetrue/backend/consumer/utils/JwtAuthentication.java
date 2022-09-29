package top.onetrue.backend.consumer.utils;

import io.jsonwebtoken.Claims;
import top.onetrue.backend.utils.JwtUtil;

public class JwtAuthentication {
    public static Integer getUserId(String token) {
        Integer userId = -1;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userId = Integer.parseInt(claims.getSubject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return userId;
    }
}
