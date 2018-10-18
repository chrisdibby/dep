package com.epam.dep.repo;

import java.io.IOException;
import java.util.List;

import com.epam.dep.entity.BoxMetadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoxFolderMetadataRepoImpl implements BoxMetadataRepo {
	
@Autowired
public BoxFolderMetadataCRUD boxFolderMetadataCRUD;

public BoxMetadata getBoxMetadataById(int id) {
	// TODO Auto-generated method stub
	return null;
}

public List<BoxMetadata> findAll() {
	// TODO Auto-generated method stub
	return null;
}

public void createBoxMetadata(BoxMetadata boxMetadata) throws IOException {
	// TODO Auto-generated method stub
	
}

public void updateBoxMetadata(BoxMetadata boxMetadata) {
	// TODO Auto-generated method stub
	
}

public void deleteBoxMetadata(BoxMetadata boxMetadata) {
	// TODO Auto-generated method stub
	
}


}
	
	