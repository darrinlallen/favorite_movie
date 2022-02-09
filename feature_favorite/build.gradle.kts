plugins {
    id("com.android.dynamic-feature")
    id("org.jetbrains.kotlin.android")
    // id("kotlin-kapt") GROOVY VERSION
    kotlin("kapt")
}

android {
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(project(":app"))
    implementation("androidx.room:room-common:2.3.0")
    kapt(libs.androidx.room.compiler)
    implementation(libs.bundles.feature.favorite)
    val roomVersion = "2.4.1"

    implementation("androidx.room:room-runtime:$roomVersion")
    annotationProcessor("androidx.room:room-compiler:$roomVersion")

    // To use Kotlin annotation processing tool (kapt)
    kapt("androidx.room:room-compiler:$roomVersion")
    // To use Kotlin Symbolic Processing (KSP)
    implementation ("com.squareup.retrofit2:retrofit:2.4.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.4.0")
}

