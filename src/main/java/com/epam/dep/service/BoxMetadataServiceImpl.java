package com.epam.dep.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.dep.repo.BoxMetadataRepo;

@Service
public class BoxMetadataServiceImpl implements BoxMetadataService {
	
	@Autowired
	public BoxMetadataRepo boxMetadataRepo;

	public BoxMetadata getBoxMetadataById(int id) {
		return boxMetadataRepo.getBoxMetadataById(id);
	}
	
	public List<BoxMetadata> findAll() {
		return boxMetadataRepo.findAll();
	}

	public void createBoxMetadata(BoxMetadata boxMetadata) throws IOException {
		boxMetadataRepo.createBoxMetadata(boxMetadata);
	}

	public void updateBoxMetadata(BoxMetadata boxMetadata) {
		boxMetadataRepo.updateBoxMetadata(boxMetadata);
	}

	public void deleteBoxMetadata(BoxMetadata boxMetadata) {
		boxMetadataRepo.deleteBoxMetadata(boxMetadata);
	}

}