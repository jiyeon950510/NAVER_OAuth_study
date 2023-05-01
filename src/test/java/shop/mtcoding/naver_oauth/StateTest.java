package shop.mtcoding.naver_oauth;

import java.math.BigInteger;
import java.security.SecureRandom;

public class StateTest {
    public String generateState() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }

}
