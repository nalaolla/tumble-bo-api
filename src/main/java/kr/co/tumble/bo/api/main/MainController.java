package kr.co.tumble.bo.api.main;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : kr.co.tumble.bo.api.main
 * fileName       : MainController
 * author         : DANIEL
 * date           : 2023-08-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-01        DANIEL       최초 생성
 */

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/main")
public class MainController {

    @GetMapping(path = "/getMainData")
    public String getMainData() {
        return "test";
    }
}
