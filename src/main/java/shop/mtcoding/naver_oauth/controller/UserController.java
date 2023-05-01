package shop.mtcoding.naver_oauth.controller;

import java.math.BigInteger;
import java.security.SecureRandom;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/loginForm")
    public String loginForm() {
        return "loginForm";
    }

    @GetMapping("/callback")
    public @ResponseBody String callback() {
        // 1. code 값 존재 유무 확인
        // if(code == null || code.isEmpty()){
        // return "bad Request";
        // }

        // 2. code 값 카카오 전달 -> access token 받기

        // 3. access token으로 카카오의 홍길동 resource 접근 가능해짐 -> access token을 파싱하고

        // 4. access token으로 email 정보 받기 (ssar@gmail.com)

        // 5. 해당 email로 회원가입되어 있는 user 정보가 있는지 DB 조회 (X)

        // 6. 있으면 그 user 정보로 session 만들어주고, (자동로그인) (X)

        // 7. 없으면 강제 회원가입 시키고, 그 정보로 session 만들어주고, (자동로그인)

        // 상태 토큰으로 사용할 랜덤 문자열 생성
        String state = generateState();
        // 세션 또는 별도의 저장 공간에 상태 토큰을 저장
        request.session().attribute("state", state);
        return state;
    }

    public String generateState() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }

}
