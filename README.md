# Kotlin Multiplatform - Android/iOS/Web/Node.js

[![Build Status](https://travis-ci.org/RubyLichtenstein/Kotlin-multiplatform-firebase.svg?branch=master)](https://travis-ci.org/RubyLichtenstein/Kotlin-multiplatform-firebase)

Simple app demonstrating how kotlin is everywhere 

Multiplatform Android/iOS/Web/Node.js

## Kotlin Multiplatform

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
