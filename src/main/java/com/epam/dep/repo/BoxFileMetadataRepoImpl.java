package com.epam.dep.repo;

import java.io.IOException;
import java.util.List;

import com.epam.dep.coreAPI.boxAPI.BoxFileMetadataCRUD;
import com.epam.dep.entity.BoxMetadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BoxFileMetadataRepoImpl implements BoxMetadataRepo {
	
@Autowired
public BoxFileMetadataCRUD boxFileMetadataCRUD;

public BoxMetadata getBoxMetadataById(String id) throws IOException {
	return boxFileMetadataCRUD.getBoxFileMetadataById(id);
}

public List<BoxMetadata> findAll() {
	// TODO Auto-generated method stub
	return null;
}

public void createBoxMetadata(BoxMetadata boxMetadata) throws IOException {
	boxFileMetadataCRUD.createBoxFileMetadata();
	
}

public void updateBoxMetadata(BoxMetadata boxMetadata) {
	// TODO Auto-generated method stub
	
}

public void deleteBoxMetadata(BoxMetadata boxMetadata) {
	// TODO Auto-generated method stub
	
}



}
	
	