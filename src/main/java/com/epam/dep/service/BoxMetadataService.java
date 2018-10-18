package com.epam.dep.service;

import java.io.IOException;
import java.util.List;

import com.epam.dep.entity.BoxMetadata;

public interface BoxMetadataService {
	
	BoxMetadata getBoxMetadataById (int id);
	
	List<BoxMetadata> findAll();
	
	void createBoxMetadata (BoxMetadata boxMetadata) throws IOException;
	
	void updateBoxMetadata (BoxMetadata boxMetadata);
	
	void deleteBoxMetadata (BoxMetadata boxMetadata);
}