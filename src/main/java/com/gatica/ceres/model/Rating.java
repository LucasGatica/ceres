package com.gatica.ceres.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @JsonProperty("Source")
    private String source;
    @JsonProperty("Value")
    private String value;
}
