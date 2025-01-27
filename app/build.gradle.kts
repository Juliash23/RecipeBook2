
plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("org.jetbrains.kotlin.plugin.serialization" version "$kotlin_version")
    id ("androidx.navigation.safeargs.kotlin")
    id ("kotlin-parcelize")
    id ("org.jetbrains.kotlin.kapt")

}
/*apply plugin: "kotlinx-serialization"*/
android {
    compileSdk 32

    lintOptions {
        disable ("NullSafeMutableLiveData")
    }

    buildFeatures {
        viewBinding true
    }

    defaultConfig {
        applicationId "com.example.recipebook"
        minSdk 23
        targetSdk 32
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled true
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
}

dependencies {

    implementation ("androidx.core:core-ktx:1.8.0")
    implementation ("androidx.appcompat:appcompat:1.4.2")
    implementation ("com.google.android.material:material:1.6.1")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    //ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1')
    implementation ("androidx.activity:activity-ktx:1.4.0")
    //LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.4.1")
    //Fragment
    implementation ("androidx.fragment:fragment-ktx:1.4.1")
    implementation ("com.google.code.gson:gson:2.9.0")
    implementation ("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.0")
    //Navigation
    implementation ("androidx.navigation:navigation-fragment-ktx:2.4.1")
    implementation ("androidx.navigation:navigation-ui-ktx:2.4.1")
    //Room
    implementation ("androidx.room:room-runtime:2.4.2")
    kapt ("androidx.room:room-compiler:2.4.2")
    //Test
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")

}