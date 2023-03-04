package com.fs.hotel.HotelService.Repository;

import com.fs.hotel.HotelService.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel , String> {
}
