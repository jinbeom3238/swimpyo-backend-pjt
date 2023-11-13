package com.btc.swimpyo.backend.controller.mypage.user;

import com.btc.swimpyo.backend.dto.reservation.ReservationDto;
import com.btc.swimpyo.backend.service.mypage.user.UserMypageService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/api/user/mypage")
@RequiredArgsConstructor
public class UserMypageController {

    private final UserMypageService userMypageService;

    @GetMapping("/GetRezList")
    public Object GetRezList(HttpServletRequest request){
        log.info("GetRezList");

        List<ReservationDto> GetRezList = userMypageService.GetRezList(request);
        if(GetRezList == null){
            return "GetRezListFail";
        }
        return GetRezList;
    }

}
