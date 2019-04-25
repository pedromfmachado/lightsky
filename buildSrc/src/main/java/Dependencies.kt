object Dependencies {

    // Core
    val gradle = "com.android.tools.build:gradle:${DepVersions.gradle}"
    val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${DepVersions.kotlin}"
    val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${DepVersions.kotlin}"

    // AndroidX
    val androidxAppCompat = "androidx.appcompat:appcompat:${DepVersions.androidxAppCompat}"
    val androidxTestRunner = "androidx.test:runner:${DepVersions.androidxTestRunner}"
    val androidxEspresso = "androidx.test.espresso:espresso-core:${DepVersions.androidxEspresso}"
    val androidxConstraintLayout = "androidx.constraintlayout:constraintlayout:${DepVersions.androidxConstraintLayout}"
    val androidxRecyclerView = "androidx.recyclerview:recyclerview:${DepVersions.androidxRecyclerView}"
    val androidxKtx = "androidx.core:core-ktx:${DepVersions.androidxKtx}"

    // Tests
    val junit = "junit:junit:${DepVersions.junit}"
    val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${DepVersions.mockitoKotlin}"

    // Other
    val rxJava = "io.reactivex.rxjava2:rxjava:${DepVersions.rxJava}"
    val rxJavaAndroid = "io.reactivex.rxjava2:rxandroid:${DepVersions.rxJavaAndroid}"
    val retrofit = "com.squareup.retrofit2:retrofit:${DepVersions.retrofit}"
    val retrofitRx = "com.squareup.retrofit2:adapter-rxjava2:${DepVersions.retrofit}"
    val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${DepVersions.retrofit}"
    val koin = "org.koin:koin-core-ext:${DepVersions.koin}"
    val koinAndroid = "org.koin:koin-android:${DepVersions.koin}"
    val moshi = "com.squareup.moshi:moshi:${DepVersions.moshi}"
    val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${DepVersions.moshi}"
    val timber = "com.jakewharton.timber:timber:${DepVersions.timber}"
}