import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.text.SimpleDateFormat;

public class ParseJwtTest {
    public static void main(String[] args){
        Claims claims = Jwts.parser().setSigningKey("itcast")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2NjYiLCJzdWIiOiLlsI_pqawiLCJpYXQiOjE1NjM0NDYyNzIsImV4cCI6MTU2MzQ0NjMzMiwicm9sZSI6ImFkbWluIn0.L2DlK3t5QLD7jBuT10Nj4J--aKZ7X_NCHhIeNpzqzOo")
                .getBody();
        System.out.println("用户id:"+claims.getId());
        System.out.println("用户名:"+claims.getSubject());
        System.out.println("登陆时间:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getIssuedAt()));
        System.out.println("过期时间:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getExpiration()));
        System.out.println("用户角色:"+claims.get("role"));
    }
}
