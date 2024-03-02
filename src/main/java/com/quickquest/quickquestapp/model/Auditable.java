package com.quickquest.quickquestapp.model;

import java.util.Date;

public interface Auditable {
    Date getCreated_at();
    Date getModified_at();
    void setCreated_at(Date created_at);
    void setModified_at(Date modified_at);
}

