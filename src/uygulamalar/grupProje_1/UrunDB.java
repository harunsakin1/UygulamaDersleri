package uygulamalar.grupProje_1;

import uygulamalar.grupProje_1.entities.Urun;

public class UrunDB {
	
	static Urun findById(int id){
		for (Urun urun:Urun.urunArrayList){
			if (id == urun.getUrunId()){
				return urun;
			}
		}
		return null;
	}
}