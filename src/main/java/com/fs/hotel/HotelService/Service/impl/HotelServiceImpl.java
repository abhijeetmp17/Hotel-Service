package com.fs.hotel.HotelService.Service.impl;

import com.fs.hotel.HotelService.Entity.Hotel;
import com.fs.hotel.HotelService.Exception.ResourceNotFoundException;
import com.fs.hotel.HotelService.Repository.HotelRepo;
import com.fs.hotel.HotelService.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService
{
    @Autowired
    private HotelRepo hotelRepo;
    @Override
    public Hotel createHotel(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setHotelId(id);
        Hotel save = hotelRepo.save(hotel);
        return save;
    }

    @Override
    public List<Hotel> getAllHotels() {
        List<Hotel> allHotels = hotelRepo.findAll();
        return allHotels;
    }

    @Override
    public Hotel getHotel(String id) {
        Hotel hotel = hotelRepo.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Resourcr not found ny ID :" + id));
        return hotel;
    }
}
