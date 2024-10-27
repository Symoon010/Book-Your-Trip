package com.zadid.rnd.hms.api;

import com.zadid.rnd.hms.domain.HotelDetailsRequest;
import com.zadid.rnd.hms.domain.HotelDetailsResponse;
import com.zadid.rnd.hms.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hotel")
@RequiredArgsConstructor
public class HotelController {

    private final HotelService hotelService;

    @PostMapping("/add")
    public Mono<HotelDetailsResponse> addHotel(@RequestBody HotelDetailsRequest hotelRequest){
        return hotelService.addHotel(hotelRequest);
    }


}
