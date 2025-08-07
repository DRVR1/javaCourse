package com.example.springbootproject6.service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.Jwts.SIG;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

    public String generateToken(String username) {

        Map<String, Object> claims = new HashMap<>();

        Jwts.builder()
                .claims(claims)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 4))
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();

        return "String";
    }

    private Key getKey() {
        byte[] keyBytes = Decoders.BASE64.decode("Secret Key");
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
