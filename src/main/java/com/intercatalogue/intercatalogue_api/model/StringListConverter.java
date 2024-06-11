package com.intercatalogue.intercatalogue_api.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {

  @Override
  public String convertToDatabaseColumn(List<String> list) {
    // Java 8
    return String.join(",", list); 
    // Guava
  }

  @Override
  public List<String> convertToEntityAttribute(String joined) {
    return new ArrayList<>(Arrays.asList(joined.split(",")));
  }

}