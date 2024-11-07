package com.example.crud;

import lombok.Data;

@Data
public class StudentDTO {
    private String username; // matches the JSON field name
    private String type;
    private String displayname_en; // matches the JSON field name
    private String email;
    private String faculty;
}