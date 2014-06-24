// Groovy script used to upload data from axeda to m2x, the following parameters
// must be configured on Axeda when creating CustomObject:
// key : AT&amp;T M2X key
// feedid : ID of the Feed to push
// streamname: Name of Stream to push
// val : The actual value

// NOTE: Uncomment the following for testing mode, you can run the script in JDK directly.
// def parameters = [ key: "<m2x key>",
//    feedid: "<feed ID>",
//    streamname: "<stream name>",
//    val: "<value>"]
String key = parameters.key
String feedid = parameters.feedid
String streamname = parameters.streamname
String val = parameters.val

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*

def builder = new groovy.json.JsonBuilder()
builder { value val }

def http = new HTTPBuilder("https://api-m2x.att.com")
http.request( PUT, JSON ) {
    uri.path = "/v1/feeds/${feedid}/streams/${streamname}"
    headers.'User-Agent' = 'AT&T M2X Groovy Client 0.0.1'
    headers.'X-M2X-KEY' = key
    body = builder.toString()

    // response handler for a success response code:
    response.success = { resp, json ->
        println resp.statusLine
    }

    // handler for any failure status code:
    response.failure = { resp ->
        println "Unexpected error: ${resp.statusLine.statusCode} : ${resp.statusLine.reasonPhrase}"
    }
}
