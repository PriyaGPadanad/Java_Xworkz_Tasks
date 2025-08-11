package com.xworkz.airlines.service;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;
import com.xworkz.airlines.dto.AirlinesDTO;

public interface AirlinesService {
    String validate(AirlinesDTO airlinesDTO);



    default AirlinesDTO findById(int id) {
        return null;
    }
    }

