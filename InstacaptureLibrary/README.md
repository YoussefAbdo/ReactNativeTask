
# react-native-instacapture-library

## Getting started

`$ npm install react-native-instacapture-library --save`

### Mostly automatic installation

`$ react-native link react-native-instacapture-library`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-instacapture-library` and add `RNInstacaptureLibrary.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNInstacaptureLibrary.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNInstacaptureLibraryPackage;` to the imports at the top of the file
  - Add `new RNInstacaptureLibraryPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-instacapture-library'
  	project(':react-native-instacapture-library').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-instacapture-library/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-instacapture-library')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNInstacaptureLibrary.sln` in `node_modules/react-native-instacapture-library/windows/RNInstacaptureLibrary.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Instacapture.Library.RNInstacaptureLibrary;` to the usings at the top of the file
  - Add `new RNInstacaptureLibraryPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNInstacaptureLibrary from 'react-native-instacapture-library';

// TODO: What to do with the module?
RNInstacaptureLibrary;
```
  