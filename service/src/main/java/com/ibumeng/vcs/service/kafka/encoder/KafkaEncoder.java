package com.ibumeng.vcs.service.kafka.encoder;

import com.ibumeng.vcs.base.Message;
import com.ibumeng.vcs.base.util.BeanUtils;
import kafka.serializer.Encoder;
import kafka.utils.VerifiableProperties;

public class KafkaEncoder implements Encoder<Message> {
	public KafkaEncoder(VerifiableProperties prop){
		
	}
	public byte[] toBytes(Message msg) {
		return BeanUtils.obj2Bytes(msg);
	}

}
