package com.epam.dep.repo;

import java.io.IOException;
import java.util.List;

import com.epam.dep.coreAPI.boxAPI.BoxFileMetadataCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoxFileMetadataRepoImpl implements BoxMetadataRepo {
	
@Autowired
public BoxFileMetadataCRUD boxFileMetadataCRUD;

	@Override
	public BoxMetadata getBoxMetadataById(int id) {
		return null;
	}

	@Override
	public List<BoxMetadata> findAll() {
		return null;
	}

	@Override
	public void createBoxMetadata(BoxMetadata boxMetadata) throws IOException {

	}

	@Override
	public void updateBoxMetadata(BoxMetadata boxMetadata) {

	}

	@Override
	public void deleteBoxMetadata(BoxMetadata boxMetadata) {

	}
}
	
	