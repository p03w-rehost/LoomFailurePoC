plugins {
    java
    `maven-publish`
    `java-gradle-plugin`
}

group = "io.github.p03w"
version = "0.0.0"

buildscript {
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.6.10"))
    }
}

repositories {
    mavenCentral()
}

dependencies {

}

tasks.withType<GenerateModuleMetadata> {
    enabled = false
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = group as String
            artifactId = "loomfailure"
            version = version

            from(components["java"])
        }
    }
}

gradlePlugin {
    plugins {
        create("loomFailurePlugin") {
            id = "io.github.p03w.loomFailure"
            implementationClass = "io.github.p03w.LoomFailurePlugin"
        }
    }
}
