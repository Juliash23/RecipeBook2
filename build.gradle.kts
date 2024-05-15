ext {
    kotlin_version = '1.6.20'
    nav_version = "2.5.0"
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"")"
        /*classpath "org.jetbrains.kotlin:kotlin-serialization:$kotlin_version";*/
    }
}

plugins {
    id com.android.application' version '7.2.1' apply false
    id 'com.android.library' version '7.2.1' apply false
    id 'org.jetbrains.kotlin.android' version '1.5.30' apply false
}

task clean(type: Delete) {
    delete rootProject.buildDir
}
