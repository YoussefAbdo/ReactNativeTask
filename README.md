# ReactNativeTask
Instabug Cross-Platform Developer Task

# react-native-instacapture-library

## Getting started

`$ npm install react-native-instacapture-library --save`

### Mostly automatic installation

`$ react-native link react-native-instacapture-library`

##############################################################

# Native Module: react-native-helloworld
Getting started to write React Native bridge module for Android.

## How to Run the Example

```bash
cd CaptureApp
npm install
react-native run-android
```

## How to Use the Module
1. Create a new React Native project:

    ```bash
    react-native init NewProject
    ```
2. Add the local module to dependencies in **package.json**: 

    ```json
  "dependencies": {
    "react-native-instacapture-library": "file:../InstacaptureLibrary",
  },
    ```
3. Link dependencies:

    ```bash
# react-native-instacapture-library

## Getting started

`$ npm install react-native-instacapture-library --save`

### Mostly automatic installation

`$ react-native link react-native-instacapture-library`
    ```
4. Use the module in **index.android.js**:

    ```javascript
    import MyModule from 'react-native-helloworld';

    const onButtonPress = () => {
        RNInstacaptureLibrary.capture();
    };
    ```
