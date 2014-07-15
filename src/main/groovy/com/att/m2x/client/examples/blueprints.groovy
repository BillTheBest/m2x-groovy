package com.att.m2x.client.examples

/*
 * blueprints.groovy - Groovy script used to list blueprint data
 *
 * See README file on how to run this script
 */

import com.att.m2x.client.M2XClient
import com.att.m2x.client.api.Page
import com.att.m2x.client.api.datasource.Blueprint

// Please fill in your M2X key here
String key = "<key>"

// M2XClient is actually a Java class here, Groovy is able to
// instantiate Java classes and call the corresponding methos
M2XClient client = new M2XClient(key)

// Fetch blueprints
Page<Blueprint> blueprints = client.blueprints().list()

// Enumerate through blueprints to get data
for (Blueprint blueprint : blueprints.getData()) {
    println "Blueprint: " + blueprint.getName()
    println "ID: " + blueprint.getId()
    println()
}
