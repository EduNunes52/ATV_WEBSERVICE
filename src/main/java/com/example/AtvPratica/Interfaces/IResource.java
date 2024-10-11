package com.example.AtvPratica.Interfaces;

import java.util.List;

public interface IResource<T, N> {

    public T creat( T entity );

    public T get(N id);

    public List<T> get ();

    public T updat(N id, T entity);

    public void delete (N id);
}
