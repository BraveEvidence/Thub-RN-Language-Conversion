# thub-rn-language-conversion

React Native module for android and ios to do languag conversion

## Installation

```sh
npm install thub-rn-language-conversion
```

## Usage

```js
For Android
go to AndroidManifest.xml file and add following permission

<uses-permission android:name="android.permission.INTERNET" />

In React Native Project

import ThubRnLanguageConversion from 'thub-rn-language-conversion';

ThubRnLanguageConversion.textConversion(
  textTobeTraslated,
  fromLanguage,
  toLanguage,
  (data) => {
    console.log(data)
  },
  (errorMessage) => {
    console.log(errorMessage);
  }
);
```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT
