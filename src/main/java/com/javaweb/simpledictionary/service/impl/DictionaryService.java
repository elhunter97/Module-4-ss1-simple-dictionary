package com.javaweb.simpledictionary.service.impl;

import com.javaweb.simpledictionary.repository.IRepository;
import com.javaweb.simpledictionary.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements Iservice {
    @Autowired
    IRepository dictionaryRepository;
    @Override
    public String translate(String word) {
        return dictionaryRepository.translate(word);
    }
}
