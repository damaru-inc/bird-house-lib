
package com.solace.birdhouse.gen;


public  class Picture {

	private Integer agentId;
	private String picture;
	private String timestamp;

	public Integer getAgentId() {
		return agentId;
	}

	public Picture setAgentId(Integer agentId) {
		this.agentId = agentId;
		return this;
	}

	public String getPicture() {
		return picture;
	}

	public Picture setPicture(String picture) {
		this.picture = picture;
		return this;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public Picture setTimestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	public String toString() {
		return "Picture ["
		+ " agentId: " + agentId
		+ " picture: " + picture
		+ " timestamp: " + timestamp
		+ " ]";
	}
}

