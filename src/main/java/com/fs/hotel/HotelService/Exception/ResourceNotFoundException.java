package com.fs.hotel.HotelService.Exception;

public class ResourceNotFoundException extends RuntimeException
{
    public ResourceNotFoundException()
    {
        super("Resource not found with the given id");
    }

    public ResourceNotFoundException(String msg)
    {
        super(msg);
    }
}
