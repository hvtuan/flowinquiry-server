package io.flowinquiry.modules.collab.service.dto;

import io.flowinquiry.modules.collab.domain.EntityType;
import java.time.Instant;
import lombok.Data;

@Data
public class CommentDTO {

    private Long id;
    private String content;
    private Long createdById;
    private String createdByName;
    private String createdByImageUrl;
    private Instant createdAt;
    private EntityType entityType;
    private Long entityId;
}
