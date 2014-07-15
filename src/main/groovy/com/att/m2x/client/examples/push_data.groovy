package com.att.m2x.client.examples

/*
 * push_data.groovy - Groovy script used to push data to M2X
 *
 * See README file on how to run this script
 */

import com.att.m2x.client.M2XClient
import com.att.m2x.client.api.stream.Value
import com.att.m2x.client.api.stream.ValueListResponse

// Your M2X key
String key = "<key>"
// The feed to push data
String feedId = "<feed id>"
// The steam to push data
String streamName = "<stream name>"
// The actual data
String pushValue = "<value to push>"

M2XClient client = new M2XClient(key)

// This method is used to print values in a stream, we use it to
// show the differences after pushing data
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
// Print values before pushing the data
print_response(client, feedId, streamName)

// Push data to the stream, please refer to the Java library documentation
// for details
client.feed(feedId).streams().addValues(streamName, new Value(pushValue, new Date()))

println "After pushing data:"
// Print values after pushing the data
print_response(client, feedId, streamName)
