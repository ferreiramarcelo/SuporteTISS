package br.org.cac.tiss.suporte.dao;

import java.lang.reflect.ParameterizedType;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class DaoFactory<T> {
	
	  @Produces
	  public DAO<T> create(InjectionPoint injectionPoint) {
	    ParameterizedType type = (ParameterizedType) injectionPoint.getType();
	    Class classe = (Class) type.getActualTypeArguments()[0];
	    return new DAO(classe);
	  }
	
}
