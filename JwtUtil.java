package com.example.ecommerce.security;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    private String SECRET="secret";
    public String generateToken(String username){
        return Jwts.builder().setSubject(username)
        .signWith(SignatureAlgorithm.HS256, SECRET).compact();
    }
    public String extractUsername(String token){
        return Jwts.parser().setSigningKey(SECRET)
        .parseClaimsJws(token).getBody().getSubject();
    }
}