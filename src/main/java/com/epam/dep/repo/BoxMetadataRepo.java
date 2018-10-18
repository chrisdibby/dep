package com.epam.dep.repo;

import java.io.IOException;
import java.util.List;

import com.epam.dep.entity.BoxMetadata;

public interface BoxMetadataRepo {
	
	BoxMetadata getBoxMetadataById (int id);
	
	List<BoxMetadata> findAll();
	
	void createBoxMetadata (BoxMetadata boxMetadata) throws IOException;
	
	void updateBoxMetadata (BoxMetadata boxMetadata);
	
	void deleteBoxMetadata (BoxMetadata boxMetadata);
}