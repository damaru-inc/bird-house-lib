
package com.solace.birdhouse.gen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import reactor.core.publisher.EmitterProcessor;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.Map;

@Configuration
public class Messaging {

	private static final String SPRING_DESTINATION_HEADER = "spring.cloud.stream.sendto.destination";
	private static final Logger log = LoggerFactory.getLogger(Messaging.class);


	// channel: dickeycloud/birdhouse/picture/v1/1

	// subscriber
	private Consumer<Message<Picture>> pictureCallback;

	public void setPictureCallback( Consumer<Message<Picture>> callback ) {
		pictureCallback = callback;
	}

	@Bean
	Consumer<Message<Picture>> pictureConsumer() {
		return message -> { if (pictureCallback != null) pictureCallback.accept(message); };
	}



	// channel: dickeycloud/birdhouse/agentHb/v1/1

	// subscriber
	private Consumer<Message<Heartbeat>> heartbeatCallback;

	public void setHeartbeatCallback( Consumer<Message<Heartbeat>> callback ) {
		heartbeatCallback = callback;
	}

	@Bean
	Consumer<Message<Heartbeat>> heartbeatConsumer() {
		return message -> { if (heartbeatCallback != null) heartbeatCallback.accept(message); };
	}



	// channel: dickeycloud/birdhouse/previews/v1/1

	// subscriber
	private Consumer<Message<Picture>> previewCallback;

	public void setPreviewCallback( Consumer<Message<Picture>> callback ) {
		previewCallback = callback;
	}

	@Bean
	Consumer<Message<Picture>> previewConsumer() {
		return message -> { if (previewCallback != null) previewCallback.accept(message); };
	}




}

