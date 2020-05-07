package com.redhat.edw.model;

import lombok.*;

/**
 * <pre>
 *     com.redhat.edw.model.HelloResponse
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 20 Apr 2020 17:44
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HelloResponse {
    private String content;
}
