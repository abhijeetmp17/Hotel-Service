package com.fs.hotel.HotelService.Service;

import com.fs.hotel.HotelService.Entity.Hotel;

import java.util.List;

public interface HotelService
{
    public Hotel createHotel(Hotel hotel);

    public List<Hotel> getAllHotels();

    public Hotel getHotel(String id);
}
