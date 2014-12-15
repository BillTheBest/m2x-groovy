package com.att.m2x.client.examples

/*
 * push_data.groovy - Groovy script used to push data to M2X
 *
 * See README file on how to run this script
 */

import com.att.m2x.client.M2XClient
import com.att.m2x.client.M2XResponse
import org.json.JSONArray
import org.json.JSONObject

import java.text.DateFormat
import java.text.SimpleDateFormat

// Your M2X key
String key = "<key>"
// The device to push data
String deviceId = "<feed id>"
// The steam to push data
String streamName = "<stream name>"
// The actual data
String pushValue = "<value to push>"

M2XClient client = new M2XClient(key)

// This method is used to print values in a stream, we use it to
// show the differences after pushing data
def print_response(client, deviceId, streamName) {
    M2XResponse response = client.device(deviceId).stream(streamName).values()
    println "Values for feed: " + deviceId + " stream: " + streamName
    println "===================="
    JSONArray values = response.json().getJSONArray("values");
    for ( i = 0; i < values.length(); i++ ) {
        JSONObject value = values.getJSONObject(i);
        println "Value: " + value.get("value") + " Timestamp: " + value.getString("timestamp")
    }
    println "===================="
    println()
}

def format_timestamp(date) {
    TimeZone tz = TimeZone.getTimeZone("UTC")
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
    df.setTimeZone(tz)
    return df.format(date)
}

println "Before pushing data:"
// Print values before pushing the data
print_response(client, deviceId, streamName)

// Push data to the stream, please refer to the Java library documentation
// for details
jsonValue = M2XClient.jsonSerialize(new HashMap<String, Object>(){{
    put("value", pushValue);
    put("timestamp", format_timestamp(new Date()));
}})
putResponse = client.device(deviceId).stream(streamName).updateValue(jsonValue)

println "After pushing data:"
// Print values after pushing the data
print_response(client, deviceId, streamName)
