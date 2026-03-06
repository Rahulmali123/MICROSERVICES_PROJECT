package com.api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass

public class AuditableEntity {

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    
    
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public AuditableEntity(LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public AuditableEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AuditableEntity [createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}   
    
}