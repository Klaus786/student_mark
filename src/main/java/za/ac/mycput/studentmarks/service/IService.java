package za.ac.mycput.studentmarks.service;

import za.ac.mycput.studentmarks.entity.grade.Grade;

public interface IService<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}