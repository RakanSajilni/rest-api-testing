package com.sajilni.api.service;

import java.util.List;

public interface CommonService<T> {
    List<T> getAll();

    T get(long id);

    T add(T t);

    T update(T t);

    T delete(long id);
}
