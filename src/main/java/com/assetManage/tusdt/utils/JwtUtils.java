package com.assetManage.tusdt.utils;

import com.assetManage.tusdt.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * jwt工具类
 */
public class JwtUtils {


    public static final String SUBJECT = "xdclass";

    public static final long EXPIRE = 1000*60*60*24;  //过期时间，毫秒，一天

    //秘钥
    public static final  String APPSECRET = "xd666";

    /**
     * 校验token
     *
     * @param request
     * @return
     */
    public static Claims validateToken(HttpServletRequest request) {
        String token = request.getHeader("token");
        return checkJWT(token);
    }
    /**
     * 生成jwt
     * @param user
     * @return
     */
    public static String geneJsonWebToken(User user){

        if(user == null || user.getId() == null || user.getUserName() == null
                || user.getSignature()==null){
            return null;
        }
        String token = Jwts.builder().setSubject(SUBJECT)
                .claim("id",user.getId())
                .claim("name",user.getUserName())
                .claim("sign",user.getSignature())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE))
                .signWith(SignatureAlgorithm.HS256,APPSECRET).compact();

        return token;
    }


    /**
     * 校验token
     * @param token
     * @return
     */
    public static Claims checkJWT(String token ){

        try{
            final Claims claims =  Jwts.parser().setSigningKey(APPSECRET).
                    parseClaimsJws(token).getBody();
            return  claims;

        }catch (Exception e){ }
        return null;

    }



}
