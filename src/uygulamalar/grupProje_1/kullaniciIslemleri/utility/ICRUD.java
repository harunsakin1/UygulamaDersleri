package uygulamalar.grupProje_1.kullaniciIslemleri.utility;

import java.util.List;

public interface ICRUD <T>{
	T save(T t);
	List<T> saveAll(List<T> t);
	T update(T t);
	List<T> findAll();
	T findByID(int id);
}