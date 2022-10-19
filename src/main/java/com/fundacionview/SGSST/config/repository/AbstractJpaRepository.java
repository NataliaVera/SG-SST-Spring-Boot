package com.fundacionview.SGSST.config.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface AbstractJpaRepository<T extends Serializable> {
    
    T create(T entity);
    Optional<List<T>> findOne();
    T update(T entity);
    void delete(T entity);
    void deleteById(Object enityId);

    void setClazz(Class<T> employeeClass);
}
