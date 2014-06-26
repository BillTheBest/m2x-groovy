package com.att.m2x.client.examples

/*
 * push_data.groovy - Groovy script used to push data to M2X
 *
 * See README file on how to run this script
 */

import com.att.m2x.client.M2XClient
import com.att.m2x.client.api.stream.Value
import com.att.m2x.client.api.stream.ValueListResponse

String key = "<key>"
String feedId = "<feed id>"
String streamName = "<stream name>"
String pushValue = "<value to push>"

M2XClient client = new M2XClient(key)

def print_response(client, feedId, streamName) {
    ValueListResponse response = client.feed(feedId).streams().values(streamName)
    println "Values for feed: " + feedId + " stream: " + streamName
    println "===================="
    for (Value value : response.values) {
        println "Value: " + value.value + " At: " + value.at
    }
    println "===================="
    println()
}

println "Before pushing data:"
print_response(client, feedId, streamName)

client.feed(feedId).streams().addValues(streamName, new Value(pushValue, new Date()))

println "After pushing data:"
print_response(client, feedId, streamName)
