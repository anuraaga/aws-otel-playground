/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

plugins {
    application
    java
}

base {
    archivesBaseName = "frontend"
}

application {
    mainClassName = "com.softwareaws.xray.examples.Application"
}

dependencies {
    implementation(project(":api"))

    implementation("com.amazonaws:aws-xray-recorder-sdk-apache-http")
    implementation("com.amazonaws:aws-xray-recorder-sdk-core")
    implementation("io.grpc:grpc-netty-shaded")
    implementation("org.apache.httpcomponents:httpclient:4.5.12")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("software.amazon.awssdk:dynamodb")

    runtimeOnly("com.amazonaws:aws-xray-recorder-sdk-aws-sdk-v2-instrumentor")
}
