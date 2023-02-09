package sn.esp.tola;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.esp.tola.entities.FichierDB;
import sn.esp.tola.entities.Theme;
import sn.esp.tola.repositories.FichierDBRepository;
import sn.esp.tola.repositories.ThemeRepository;

@SpringBootApplication
public class TolaApplication implements CommandLineRunner {
	
	@Autowired
	ThemeRepository themeRepository;
	
	@Autowired
	FichierDBRepository fichierDBRepository;

	public static void main(String[] args) {
		SpringApplication.run(TolaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Optional<FichierDB> fichier;
		
		fichier = fichierDBRepository.findById("1");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)1, "Anglais", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("2");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)2, "Réseau", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("3");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)3, "Systèmes d'exploitation", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("4");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)4, "Web", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("5");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)5, "Cloud computing", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("6");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)6, "Ingénierie des Processus de Développement Logiciel", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("7");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)7, "Mathématique", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("8");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)8, "Cyber Sécurité", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("9");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)9, "Java", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("10");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)10, "Python", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("11");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)11, "Intelligence artificielle", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("12");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)12, "Architecture logicielle", null, fichier.get()));	
		
		fichier = fichierDBRepository.findById("13");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)13, "Algorithmique", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("14");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)14, "Mobile", null, fichier.get()));
		
		fichier = fichierDBRepository.findById("15");
		if(fichier.isPresent())
			themeRepository.save(new Theme((long)15, "Programmation orientée objet", null, fichier.get()));			
						
    }
	
	

}
