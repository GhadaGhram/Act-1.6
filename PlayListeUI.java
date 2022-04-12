package Streaming;

import java.util.ArrayList;


public class PlayListeUI {

	public static void main(String[] args) {
		MusiqueImpl music1=new MusiqueImpl("music1", "auteur1", "genre1", "interprete1");
		MusiqueImpl music2=new MusiqueImpl("music2", "auteur2","genre2", "interprete2");
		MusiqueImpl music3=new MusiqueImpl("music3", "auteur3", "genre3", "interprete3");
		MusiqueImpl music4=new MusiqueImpl("music4", "auteur4 ","genre4", "interprete4");
		MusiqueImpl music5=new MusiqueImpl("music5", "auteur5", "genre5", "interprete5");
		MusiqueImpl music6=new MusiqueImpl("music6", "auteur6", "genre6", "interprete6");
		music1.verifEgale(music1, music2);
		
		ArrayList<MusiqueImpl> playliste = new ArrayList<>() ;
        
		PlayListeImpl pl1=new PlayListeImpl("Nom1", "Genre1", 4, playliste);
		
		pl1.ajouterPlayListe(music1);
		pl1.afficherPlayListe();
		
		pl1.ajouterPlayListe(music2);
		pl1.afficherPlayListe();
		
		pl1.ajouterPlayListe(music3);
		pl1.afficherPlayListe();
		
		pl1.ajouterPlayListe(music4);
		pl1.afficherPlayListe();
		
		pl1.ajouterPlayListe(music5);
		pl1.afficherPlayListe();
		
		pl1.ajouterPlayListe(music6);
		pl1.afficherPlayListe();
		
		
	}

}
