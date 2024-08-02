package com.javaweb.simpledictionary.repository.impl;

import com.javaweb.simpledictionary.repository.IRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IRepository {
    private static Map<String,String> dictionary = new HashMap<>();

    static{
        dictionary.put("hello","Xin chào");
        dictionary.put("goodbye","Tạm biệt");
        dictionary.put("book","quyển sách");
        dictionary.put("car","oto");
        dictionary.put("dream","Ước mơ");
        dictionary.put("hair","Mái tóc");
        dictionary.put("monitor","Màn hình");
        dictionary.put("cloud","Đám mây");
    }
    @Override
    public String translate(String word) {
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        return "Sorry. Your word not found in dictionary";
    }
}
