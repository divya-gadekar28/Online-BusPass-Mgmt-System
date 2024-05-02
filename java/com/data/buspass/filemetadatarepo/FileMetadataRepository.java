package com.data.buspass.filemetadatarepo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.data.buspass.filemetadata.FileMetaData;

public interface FileMetadataRepository extends JpaRepository<FileMetaData, Long> {
	
}
