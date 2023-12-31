// Top-level build file where you can add configuration options common to all sub-projects/
buildscript {
    repositories {
        google()
        mavenCentral()

    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.4")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.71")
        val navVersion = "2.7.3"
        classpath( "androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

    plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false

}


