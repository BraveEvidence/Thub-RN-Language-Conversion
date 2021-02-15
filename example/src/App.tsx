/* eslint-disable react-hooks/exhaustive-deps */
import * as React from 'react';
import { StyleSheet, View, Text, NativeModules } from 'react-native';

export default function App() {
  const { ThubRnLanguageConversionModule } = NativeModules;
  const [result, setResult] = React.useState();

  React.useEffect(() => {
    ThubRnLanguageConversionModule.textConversion(
      'Hi How are you?',
      'en',
      'mr'
    ).then(setResult);
  }, []);

  return (
    <View style={styles.container}>
      <Text>Result: {result}</Text>
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
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
