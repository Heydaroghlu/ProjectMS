package ProjectMS.config.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Map;

public class JWTHelper {
    public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60; // token expire date
    private static String secret = "menondashestoydaidimdsfsdfsdfsdfsdfdfdsfdsfsdf"; // secret code
    private static SecretKey getSigningKey() {
        byte[] keyBytes = Base64.getDecoder().decode("menondashestoydaidimdsfsdfsdfsdfsdfdfdsfdsfsdf");
        return Keys.hmacShaKeyFor(keyBytes);
    }
    public static String generateToken(String username) {
        ZonedDateTime now = (ZonedDateTime.now(ZoneOffset.UTC));
        ZonedDateTime end = (ZonedDateTime.now(ZoneOffset.UTC)).plusHours(1);

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(Date.from(now.toInstant()))
                .setExpiration(Date.from(end.toInstant()))
                .signWith(SignatureAlgorithm.HS256,secret)
                .compact();

    }
    private static Claims getClaims(String token) {
        return Jwts.parser()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
    public static String extractUsername(String token) {
        return getClaims(token).getSubject();
    }
    public  static boolean isTokenExpired(String token) {
        return getClaims(token).getExpiration().before(new Date());
    }
}
