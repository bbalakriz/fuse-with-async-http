package com.redhat.edw.handler;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.UUID;

/**
 * <pre>
 *     com.redhat.edw.handler.TransformHandler
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 07 Mei 2020 13:52
 */
@Component("transformHandler")
public class TransformHandler {

    public HashMap sayHi(String id) {
        HashMap hashMap = new HashMap();
        hashMap.put("uuid", UUID.randomUUID().toString());
        hashMap.put("id",id);
        return hashMap;
    }

}
