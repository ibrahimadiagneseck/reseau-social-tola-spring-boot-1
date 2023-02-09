package sn.esp.tola.services.impl;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import sn.esp.tola.entities.FichierDB;
import sn.esp.tola.repositories.FichierDBRepository;
import sn.esp.tola.services.FichierStockageService;

@Service
public class FichierStockageServiceImpl implements FichierStockageService {

	@Autowired
	private FichierDBRepository fichierDBRepository;

	public FichierDB store(MultipartFile file) throws IOException {
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	    FichierDB FileDB = new FichierDB(fileName, file.getContentType(), file.getBytes());

	    return fichierDBRepository.save(FileDB);
	  }
	  
//	  public FileDB store(MultipartFile file) throws IOException {
//	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//	    FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
//	
//	    fileDBRepository.save(FileDB);
//	    return FileDB;
//	  }

	  public FichierDB getFile(String id) {
	    return fichierDBRepository.findById(id).get();
	  }
	  
	  public FichierDB getFileByNom(String nom) {
		    return fichierDBRepository.findByNom(nom);
		  }
	  
	  public void deleteFile(String id) {
		  fichierDBRepository.deleteById(id);
	  }
	  
	  public Stream<FichierDB> getAllFiles() {
	    return fichierDBRepository.findAll().stream();
	  }
}
