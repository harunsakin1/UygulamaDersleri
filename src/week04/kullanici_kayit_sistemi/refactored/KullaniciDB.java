package week04.kullanici_kayit_sistemi.refactored;

class KullaniciDB extends Database<Kullanici> {
	static KullaniciOzelListe kullaniciOzelListe = new KullaniciOzelListe();
	
	static Kullanici update(Kullanici kullanici){
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getVeriDizisi();
		int index=0;
		for(Kullanici user: kullaniciDizisi){
			if(user.getId() == kullanici.getId()){
				return kullaniciOzelListe.replace(index,kullanici);
			}
			index++;
		}
		return null;
	}
	static Kullanici findById(int id){
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getVeriDizisi();
		for(Kullanici kullanici : kullaniciDizisi){
			if (kullanici.getId()==id){
				return kullanici;
			}
		}
		return null;
	}
	
	static boolean existsByUsername(String username) {
		for (Kullanici kullanici : kullaniciOzelListe.getVeriDizisi()) {
			if (kullanici.getKullaniciAdi().equals(username)){
				return true;
			}
		}
		return false;
	}
	
	static boolean existsByTcKimlik(String tcKimlik) {
		for (Kullanici kullanici : kullaniciOzelListe.getVeriDizisi()) {
			if (kullanici.getTcKimlik().equals(tcKimlik)){
				return true;
			}
		}
		return false;
	}
	static boolean existsByEmail(String email) {
		for (Kullanici kullanici : kullaniciOzelListe.getVeriDizisi()) {
			if (kullanici.getEmail().equals(email)){
				return true;
			}
		}
		return false;
	}
	
	static Kullanici findByUsernameAndPassword(String username, String password){
		for (Kullanici kullanici : kullaniciOzelListe.getVeriDizisi()){
			//TODO try catch e al.
			if(kullanici.getKullaniciAdi().equals(username)&& kullanici.getSifre().equals(password)){
				return kullanici;
			}
		}
		return null;
	}
	
	static Kullanici findByTcEmailPhoneNo(String tcKimlik, String email, String telNo) {
		for (Kullanici kullanici : kullaniciOzelListe.getVeriDizisi()){
			if(kullanici.getTcKimlik().equals(tcKimlik) && kullanici.getEmail().equals(email)&& kullanici.getTelNo().equals(telNo)){
				return kullanici;
			}
		}
		return null;
	}
}