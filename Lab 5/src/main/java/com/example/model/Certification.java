package com.example.model;
import org.springframework.stereotype.Component;
@Component
public class Certification {
private int id = 215;
private String name = "Java Full Stack";
private String dateOfCompletion = "2026-01-28";
public int getId() { return id; }
public String getName() { return name; }
public String getDateOfCompletion() { return dateOfCompletion; }
@Override
public String toString() {
return "Certification [id=" + id +
", name=" + name +
", dateOfCompletion=" + dateOfCompletion + "]";
}
}