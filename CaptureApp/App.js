/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */
import RNInstacaptureLibrary from 'react-native-instacapture-library';
import { Button } from 'react-native-elements';
import React, {Component} from 'react';
import {Platform, StyleSheet, Text, View} from 'react-native';
import { PermissionsAndroid } from 'react-native';

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' + 'Cmd+D or shake for dev menu',
  android:
    'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};

async function requestStoragePermission() {
  try {
    const granted = await PermissionsAndroid.request(
      PermissionsAndroid.PERMISSIONS.WRITE_EXTERNAL_STORAGE,
      {
        'title': 'Write Storage Permission',
        'message': 'CaptureApp needs access to your Storage '
      }
    )
    if (granted === PermissionsAndroid.RESULTS.GRANTED) {
      console.log("You can use the Storage")
    } else {
      console.log("Storage permission denied")
    }
  } catch (err) {
    console.warn(err)
  }
}

const onButtonPress = () => {
  requestStoragePermission();
  RNInstacaptureLibrary.capture();
};

export default class App extends Component<Props> {
  render() {
    return (
      <View style={styles.container}>
        <Button title='Take a ScreeShot!' onPress={onButtonPress}/>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
});
