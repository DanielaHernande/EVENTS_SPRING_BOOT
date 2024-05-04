package com.riwi.beauty_center.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientToResponse {

    private Long client_id;
    private String first_name;
    private String last_name;
    private String phone;
    private String email;

}
