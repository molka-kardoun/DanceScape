package org.sid.ebankingbackend.payload.request;

import lombok.Data;

@Data
public class UpdateTrainingRequest {
    private String name;
    private String description;
    private String coachName;
}
