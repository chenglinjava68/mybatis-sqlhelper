package sample.mybatis.xml.service;

import sample.mybatis.xml.domain.City;

public interface TestService {
    City findByState(String state);
}
