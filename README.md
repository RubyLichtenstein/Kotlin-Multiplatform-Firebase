# Kotlin Multiplatform Firebase - build multiplatform application with kotlin and Firebase. 

####  Android/iOS/Web/Node.js

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/7/74/Kotlin-logo.svg" width="50">
  <img src="https://upload.wikimedia.org/wikipedia/commons/d/db/Android_robot_2014.svg" width="50">
  <img src="https://upload.wikimedia.org/wikipedia/commons/6/66/Apple_iOS_logo.svg" width="50">
  <img src="https://upload.wikimedia.org/wikipedia/commons/6/6a/JavaScript-logo.png" width="50">
  <img src="https://upload.wikimedia.org/wikipedia/commons/d/d9/Node.js_logo.svg" width="70">
  <img src="https://upload.wikimedia.org/wikipedia/commons/4/42/Firebase_logo1.png" width="170">
</p>

[![Build Status](https://travis-ci.org/RubyLichtenstein/Kotlin-Multiplatform-Firebase.svg?branch=master)](https://travis-ci.org/RubyLichtenstein/Kotlin-Multiplatform-Firebase)
[![Kotlin](https://img.shields.io/badge/kotlin-1.3.0-blue.svg)](http://kotlinlang.org)


### Kotlin is everywhere!

## Project directories.

- `android` - Android app.
- `common-all` - Multiplatform Module - share code between clients/server.
- `common-client` - Multiplatform Module share code between clients: Android/iOS. 
- `firebase` - Node.Js app.

## Project Architecture

### `common-all`

#### Client/Server shared code.
- Data Models.
- Repositories.

### `common-client`

#### All Client shared code.
- Presenters. 

#### Platform specific code.
- Views.

## Testing

### Testing libraris
Common module testing.
https://github.com/mockk/mockk

### JVM
### JS

NodeJs tests with jest.
https://github.com/JetBrains/kotlin-examples/tree/master/gradle/js-tests

### Native

## Build run and test. 

### Setup
1. Clone this project.
2. enable kotlin 1.3 (https://proandroiddev.com/setup-kotlin-eap-in-your-android-app-73f2c06308e5)

- if you're using the canary version of Android Studio
 check if kotlin 1.3 plugin is enabled for your version
 
 https://plugins.jetbrains.com/plugin/6954-kotlin

#### Running the Android app.
//TODO

#### Running the iOS app.
//TODO

#### Running the Node.js App (deploy to Firebase)

1. `cd common-all/firebase/functions`
2. ` npm install`
3. `./gradlew common-all:firebaseDeploy`

#### Testing the Node.js App.
- `./gradlew common-all:firebaseTest`

## Libraries used in this project

#### common

- Serialization https://github.com/Kotlin/kotlinx.serialization
- Multiplatform Settings https://github.com/russhwolf/multiplatform-settings
- mockk https://github.com/mockk/mockk

## Resources

### Kotlin Multiplatform
//TODO

### KotlinJs
//TODO
