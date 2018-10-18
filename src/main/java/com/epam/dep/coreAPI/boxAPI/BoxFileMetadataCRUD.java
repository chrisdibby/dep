package com.epam.dep.coreAPI.boxAPI;

import java.io.IOException;
import java.util.List;

import com.box.sdk.*;

public class BoxFileMetadataCRUD {

	BoxApiAccess boxApiAccess = new BoxApiAccess();

    
    public String getBoxFileMetadataById(String id) throws IOException{
        BoxFile file = new BoxFile(boxApiAccess.apiConnect(), id);
        BoxFile.Info metadataInfo = file.getInfo();
		return metadataInfo.getName();
    }

 
	public List<Metadata> findAllBoxFileMetadata(String id) throws IOException{
		BoxFile file = new BoxFile(boxApiAccess.apiConnect(), id);
		Iterable<Metadata> metadataList = file.getAllMetadata();
		return (List<Metadata>) metadataList;
	}
	
	
	public void createBoxFileMetadata(String id) throws IOException {
		BoxFile file = new BoxFile(boxApiAccess.apiConnect(), id);
		file.createMetadata(new Metadata().add("/", ""));
	}

	
	public void updateBoxFileMetadata(String id) throws IOException {
		BoxFile file = new BoxFile(boxApiAccess.apiConnect(), id);
		file.updateMetadata(new Metadata().add("/", ""));
	}
	
	
	public void deleteBoxFileMetadata(String id) throws IOException {
		BoxFile file = new BoxFile(boxApiAccess.apiConnect(), id);
		file.deleteMetadata("");
	}

	
    private BoxFileMetadataCRUD () {}
    
}



