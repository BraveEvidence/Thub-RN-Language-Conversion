# thub-rn-language-conversion

React Native module for android and ios to do languag conversion

## Installation

```sh
npm install thub-rn-language-conversion
```

## Usage

Supported Languages:

Afrikaans,Albanian,Arabic,Belarusian,Bengali,
Bulgarian,Catalan,Chinese,Croatian,Czech,Danish,
Dutch,English,Eperanto,Estonian,Finnish,French,Galician,Georgian,German,Gujarati,
Greek,Hebrew,Hindi,Hungarian,Irish,
Icelandic,Italian,Indonesian,Japanese,Kannada,Korean,Latvian,
Lithuanian,Macedonian,Malagasy,Malay,Maltese,Marathi,Norwegian,
Persian,Polish,Portuguese,Romanian,Russian,Slovak,
Slovenian,Spanish,Swahili,Swedish,Tamil,Telugu,
Thai,Turkish,Tagalog,Ukrainian,Urdu,Vietnamese,Welsh

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
