package com.bigduu.acp.common.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;


@Data
public class BaseEntity {
    @Version
    protected Long version;
    protected Boolean active;
    protected Boolean delete;
}