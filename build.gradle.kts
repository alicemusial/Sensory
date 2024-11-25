// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")
    }
    repositories {
        google()  // Google Maven repository (dla Compose, AndroidX itp.)
        mavenCentral()  // Maven Central
        jcenter()  // Może być używane w niektórych przypadkach
    }
}




