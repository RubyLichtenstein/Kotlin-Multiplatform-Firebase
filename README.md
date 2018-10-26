# Kotlin Multiplatform - Android/iOS/Web/Node.js

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/7/74/Kotlin-logo.svg" width="50">
  <img src="https://upload.wikimedia.org/wikipedia/commons/d/db/Android_robot_2014.svg" width="50">
  <img src="https://upload.wikimedia.org/wikipedia/commons/6/66/Apple_iOS_logo.svg" width="50">
  <img src="https://upload.wikimedia.org/wikipedia/commons/6/6a/JavaScript-logo.png" width="50">
  <img src="https://upload.wikimedia.org/wikipedia/commons/d/d9/Node.js_logo.svg" width="70">
  <img src="https://upload.wikimedia.org/wikipedia/commons/4/42/Firebase_logo1.png" width="170">

</p>

[![Build Status](https://travis-ci.org/RubyLichtenstein/Kotlin-multiplatform-firebase.svg?branch=master)](https://travis-ci.org/RubyLichtenstein/Kotlin-multiplatform-firebase)
[![Kotlin](https://img.shields.io/badge/kotlin-1.3.0-blue.svg)](http://kotlinlang.org)

Simple app demonstrating how kotlin is everywhere 

Multiplatform Android/iOS/Web/Node.js

## Kotlin Multiplatform


## Project Structure

- `android` - Android app.
- `common-all` - Multiplatform and Android library.
- `common-client` - Multiplatform and Android library. 
- `firebase` - Node.Js app.

## Project Architecture

### `common-all` Module

#### Share code between all clients (Android/iOS/Web) and server (Node.Js).


#### `common`
- Models.
- Repository Expectation.

#### Platform spsific code.

#### `common-js`
- Repository Actual.
#### `common-android`
- Repository Actual.
#### `common-ios`
- Repository Actual.


### `common-client` Module
#### Share code between all clients (Android/iOS/Web)

#### `common`
- Presenters.
- View Expectation.

#### `common-js`
- View Actual.
#### `common-android`
- View Actual.
#### `common-ios`
- View Actual.


## Build and run 

### Clone and setup 

 - enable kotlin 1.3

https://proandroiddev.com/setup-kotlin-eap-in-your-android-app-73f2c06308e5

#### Running the Node.js App (Firebase functions)

1. `cd common/firebase/functions`
2. ` npm install`
3. `./gradlew common:firebaseDeploy`

#### Running the Android app 
//TODO

#### Running the Web app 
//TODO

## Libraries used in this project
//TODO 


## Resources

### Kotlin Multiplatform
//TODO

### KotlinJs
//TODO
