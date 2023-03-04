package com.fs.hotel.HotelService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hotels")
public class Hotel
{
    @Id
    private String hotelId;

    private String hotelName;

    private String hotelLocation;

    private String hotelAbout;



}
