import * as React from 'react';

import { StyleSheet, View } from 'react-native';
import { MyTexteditView } from 'react-native-my-textedit';

export default function App() {
  return (
    <View style={styles.container}>
      <MyTexteditView color="#32a852" style={styles.box} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    flex: 1,
    width: '100%',
    marginVertical: 20,
  },
});
