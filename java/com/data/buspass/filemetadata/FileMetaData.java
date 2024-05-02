package com.data.buspass.filemetadata;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="docs_data")

public class FileMetaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;

    private String fileName;

    private String filePath;
	
    private long size;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	
	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	
	@Override
	public String toString() {
		return "FileMetaData [id=" + id + ", fileName=" + fileName + ", filePath=" + filePath + ", size=" + size + "]";
	}

	public FileMetaData(Long id, String fileName, String filePath,  long size) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.filePath = filePath;
		this.size = size;
	}

	public FileMetaData() {
		super();
	}

    
}
