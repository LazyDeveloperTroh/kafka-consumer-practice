package com.example.kafkaconsumerpractice;

import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;
import org.apache.kafka.common.TopicPartition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
public class RebalanceListener implements ConsumerRebalanceListener {
    private final static Logger logger = LoggerFactory.getLogger(RebalanceListener.class);
    @Override
    public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
        logger.warn("partitions are revoked : "+ partitions.toString());
    }

    @Override
    public void onPartitionsAssigned(Collection<TopicPartition> partitions) {
        logger.warn("partitions are assigned : "+partitions.toString());
    }
}
