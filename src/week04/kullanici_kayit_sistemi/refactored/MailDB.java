package week04.kullanici_kayit_sistemi.refactored;

public class MailDB extends Database<Mail>{
	static MailOzelListe mailOzelListe = new MailOzelListe();
	
	
	static Mail update(Mail mail){
		Mail[] mailDizisi = mailOzelListe.getVeriDizisi();
		int index=0;
		for(Mail mail1: mailDizisi){
			if(mail1.getId() == mail.getId()){
				return mailOzelListe.replace(index,mail);
			}
			index++;
		}
		return null;
	}

	static Mail findById(int id){
		Mail[] mailDizisi = mailOzelListe.getVeriDizisi();
		for(Mail mail : mailDizisi){
			if (mail.getId()==id){
				return mail;
			}
		}
		return null;
	}
}