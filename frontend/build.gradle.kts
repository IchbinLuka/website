plugins {
    kotlin("multiplatform")
}

group = "com.ichbinluka"

repositories {
    mavenCentral()
}

val kotlinWrappersVersion = "1.0.0-pre.718"


kotlin {
    js {
        useEsModules()
        browser {
            commonWebpackConfig {
                outputFileName = "index.js"
            }
        }
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(platform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:$kotlinWrappersVersion"))
                implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-tanstack-react-table")
            }
        }
    }
}