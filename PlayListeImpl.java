import java.util.ArrayList;
public class PlayListeImpl implements PlayListe {
final int MAX_MUSIQUES=3;
private String nomMusique;
private String genreMusique;
private int nombreTitresMusique;

ArrayList<MusiqueImpl> playliste=new ArrayList<MusiqueImpl>();

public PlayListeImpl(String nomMusique, String genreMusique, int nombreTitresMusique,
		ArrayList<MusiqueImpl> playliste) {
	this.nomMusique = nomMusique;
	this.genreMusique = genreMusique;
	this.nombreTitresMusique = nombreTitresMusique;
	this.playliste = playliste;
}

@Override
public String toString() {
	return "PlayListeImpl [playliste=" + playliste + "]";
}

@Override
public void afficherPlayListe() {
	System.out.println(toString());
}
	
@Override
public void ajouterPlayListe(MusiqueImpl music) {
	//System.out.println(playliste.size());
	if (playliste.size()<MAX_MUSIQUES) {
		playliste.add(music);
	}
	else { System.out.println("Oups! Espace insuffisant");}}

public String getNomMusique() {
	return nomMusique;
}

public void setNomMusique(String nomMusique) {
	this.nomMusique = nomMusique;
}

public String getGenreMusique() {
	return genreMusique;
}

public void setGenreMusique(String genreMusique) {
	this.genreMusique = genreMusique;
}

public int getNombreTitresMusique() {
	return nombreTitresMusique;
}

public void setNombreTitresMusique(int nombreTitresMusique) {
	this.nombreTitresMusique = nombreTitresMusique;
}
	
}



