
package com.solace.birdhouse.gen;


public  class Heartbeat {

	private Integer agentId;
	private String timestamp;

	public Integer getAgentId() {
		return agentId;
	}

	public Heartbeat setAgentId(Integer agentId) {
		this.agentId = agentId;
		return this;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public Heartbeat setTimestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	public String toString() {
		return "Heartbeat ["
		+ " agentId: " + agentId
		+ " timestamp: " + timestamp
		+ " ]";
	}
}

