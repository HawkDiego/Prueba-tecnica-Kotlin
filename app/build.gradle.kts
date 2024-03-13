plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.prueba_tecnica"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.prueba_tecnica"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }

}

dependencies {
    val lifecycle_version = "2.7.0"
    val fragment_version = "1.6.2"
    val activity_version = "1.8.2"
    val retrofit_version = "2.9.0"
    val nav_version = "2.7.7"


    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //View model
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    //LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    //Fragment
    implementation("androidx.fragment:fragment-ktx:$fragment_version")
    //Activity
    implementation("androidx.activity:activity-ktx:$activity_version")
    //retrofit
    implementation("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation("com.squareup.retrofit2:converter-gson:$retrofit_version")
    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")
    //Picasso
    implementation("com.squareup.picasso:picasso:2.8")
    //NavComponent
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    //DagerHilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")

}