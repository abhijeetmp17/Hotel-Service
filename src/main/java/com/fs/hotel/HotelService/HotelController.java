package com.fs.hotel.HotelService;

import com.fs.hotel.HotelService.Entity.Hotel;
import com.fs.hotel.HotelService.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController
{
    @Autowired
    private HotelService hotelService;
    @PostMapping("/create")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
    {
        Hotel hotel1 = hotelService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId)
    {
        Hotel hotel1 = hotelService.getHotel(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotel1);
    }

    @GetMapping("/hotels")
    public ResponseEntity<List<Hotel>> getAllHotel()
    {
        List<Hotel> allHotels = hotelService.getAllHotels();
        return ResponseEntity.status(HttpStatus.CREATED).body(allHotels);
    }
}
