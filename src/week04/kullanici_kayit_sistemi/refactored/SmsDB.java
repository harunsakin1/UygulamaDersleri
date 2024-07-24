package week04.kullanici_kayit_sistemi.refactored;

public class SmsDB extends Database<Sms> {
	static SmsOzelListe smsOzelListe = new SmsOzelListe();
	
	
	
	static Sms update(Sms sms){
		Sms[] smsDizisi = smsOzelListe.getVeriDizisi();
		int index=0;
		for(Sms user: smsDizisi){
			if(user.getId() == sms.getId()){
				return smsOzelListe.replace(index,sms);
			}
			index++;
		}
		return null;
	}

	static Sms findById(int id){
		Sms[] smsDizisi = smsOzelListe.getVeriDizisi();
		for(Sms sms : smsDizisi){
			if (sms.getId()==id){
				return sms;
			}
		}
		return null;
	}
}