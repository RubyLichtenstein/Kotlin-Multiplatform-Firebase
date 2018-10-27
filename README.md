# Kotlin Multiplatform 
### Android/iOS/Web/Node.js

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


### Kotlin targets
- JVM
- JS
- Native

#### KotlinJS

- Kotlin provides the ability to target JavaScript. It does so by transpiling Kotlin to JavaScript. The current implementation  targets ECMAScript 5.1 but there are plans to eventually target ECMAScript 2015 as well.

- this excludes the JDK and any JVM or Java framework or library used.

##### Client-side JS
Interacting with DOM elements. Kotlin provides a series of statically typed interfaces to interact with the Document Object Model, allowing creation and update of DOM elements.

Interacting with graphics such as WebGL. You can use Kotlin to create graphical elements on a web page using WebGL.

##### Server-side JS 
Working with server-side technology. You can use Kotlin to interact with server-side JavaScript such as Node.js
you can convert TypeScript definitions from the Definitely Typed type definitions repository to Kotlin using the ts2kt tool. Alternatively, you can use the dynamic type to access any framework without strong typing.

##### ts2kt

##### dynamic type

#### Kotlin Native

##### Why Kotlin/Native?

Kotlin/Native is primarily designed to allow compilation for platforms where virtual machines are not desirable or possible, for example, embedded devices or iOS. It solves the situations when a developer needs to produce a self-contained program that does not require an additional runtime or virtual machine.
 
###### Target Platforms
Kotlin/Native supports the following platforms:

- iOS (arm32, arm64, emulator x86_64)
- MacOS (x86_64)
- Android (arm32, arm64)
- Windows (mingw x86_64)
- Linux (x86_64, arm32, MIPS, MIPS little endian)
- WebAssembly (wasm32)

## Kotlin Multiplatform

##### Multiplatform projects are an experimental feature in Kotlin 1.2 and 1.3. All of the language and tooling features described in this document are subject to change in future Kotlin versions.
 
##### sharing code between platforms. With support for JVM, Android, JavaScript, iOS, Linux, Windows, Mac and even embedded systems like STM32, 

#### How it works

Overall, multiplatform is not about compiling all code for all platforms. This model has its obvious limitations, and we understand that modern applications need access to unique features of the platforms they are running on. Kotlin doesn't limit you to the common subset of all APIs in the world. Every component can share as much code as needed with others but can access platform APIs at any time through the expect/actual mechanism provided by the language.

#### Platform-Specific Declarations - expected/actual mechanism 

##### Why not interfaces? 

- All implementatinos are known at compile time. 
- Simpler inmplementation - no factory or DI. 
- Interface dose not have constractors. 
- Top level and extintion functions.

##### Common module.
- Cannot referance any platform spsific code.
- Can only have kotlin code. 
- Can only depend on other Kotlin common module or libraris. 

### Multiplatform Architecture.

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
