package com.att.m2x.client.examples

/*
 * devices.groovyGroovy script used to list device data
 *
 * See README file on how to run this script
 */

import com.att.m2x.client.M2XClient
import com.att.m2x.client.M2XResponse
import org.json.JSONArray
import org.json.JSONObject

// Please fill in your M2X key here
String key = "<key>"

// M2XClient is actually a Java class here, Groovy is able to
// instantiate Java classes and call the corresponding methos
M2XClient client = new M2XClient(key)

M2XResponse response = client.devices()

if (response.success()) {
    JSONArray devices = response.json().getJSONArray("devices")
    for (i = 0; i < devices.length(); i++) {
        JSONObject device = devices.getJSONObject(i)
        println "Device #" + (i + 1) + ":"
        println "Device Name: " + device.get("name")
        println "Device Description: " + device.get("description")
        println "Device ID: " + device.get("id")
    }
}
