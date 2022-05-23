package com.github.cyberpunkperson.retryer.router.domain.archive;

import lombok.RequiredArgsConstructor;
import org.springframework.integration.transformer.GenericTransformer;
import org.springframework.stereotype.Component;
import src.main.java.com.github.cyberpunkperson.retryer.router.RetryerArchive.ArchiveRecord;
import src.main.java.com.github.cyberpunkperson.retryer.router.RetryerSource.RetryRecord;

@Component
@RequiredArgsConstructor
class ArchiveFlowTransformer implements GenericTransformer<RetryRecord, ArchiveRecord> {

    private final ArchiveRecordMapper archiveRecordMapper;

    @Override
    public ArchiveRecord transform(RetryRecord retryRecord) {
        return archiveRecordMapper.toArchiveRecordBuilder(retryRecord).build();
    }
}