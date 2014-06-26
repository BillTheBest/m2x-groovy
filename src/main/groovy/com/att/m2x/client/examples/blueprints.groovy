package com.att.m2x.client.examples

/*
 * blueprints.groovy - Groovy script used to list blueprint data
 *
 * See README file on how to run this script
 */

import com.att.m2x.client.M2XClient
import com.att.m2x.client.api.Page
import com.att.m2x.client.api.datasource.Blueprint

String key = "<key>"

M2XClient client = new M2XClient(key)

Page<Blueprint> blueprints = client.blueprints().list()

for (Blueprint blueprint : blueprints.getData()) {
    println "Blueprint: " + blueprint.getName()
    println "ID: " + blueprint.getId()
    println()
}
