# thub-rn-language-conversion

React Native module for android and ios to do languag conversion

## Installation

```sh
npm install thub-rn-language-conversion
```

## Usage

Supported Languages
{code: 'af', name: 'Afrikaans', nativeName: 'Afrikaans'},
{code: 'sq', name: 'Albanian', nativeName: 'Shqip'},
{code: 'ar', name: 'Arabic', nativeName: 'العربية'},
{code: 'be', name: 'Belarusian', nativeName: 'Беларуская'},
{code: 'bn', name: 'Bengali', nativeName: 'বাংলা'},
{code: 'bg', name: 'Bulgarian', nativeName: 'български език'},
{code: 'ca', name: 'Catalan; Valencian', nativeName: 'Català'},
{code: 'zh', name: 'Chinese', nativeName: '中文 (Zhōngwén), 汉语, 漢語'},
{code: 'hr', name: 'Croatian', nativeName: 'hrvatski'},
{code: 'cs', name: 'Czech', nativeName: 'česky, čeština'},
{code: 'da', name: 'Danish', nativeName: 'dansk'},
{code: 'nl', name: 'Dutch', nativeName: 'Nederlands, Vlaams'},
{code: 'en', name: 'English', nativeName: 'English'},
{code: 'eo', name: 'Eperanto', nativeName: 'Eperanto'},
{code: 'et', name: 'Estonian', nativeName: 'eesti, eesti keel'},
{code: 'fi', name: 'Finnish', nativeName: 'suomi, suomen kieli'},
{code: 'fr', name: 'French', nativeName: 'français, langue française'},
{code: 'gl', name: 'Galician', nativeName: 'Galego'},
{code: 'ka', name: 'Georgian', nativeName: 'ქართული'},
{code: 'de', name: 'German', nativeName: 'Deutsch'},
{code: 'el', name: 'Greek', nativeName: 'Ελληνικά'},
{code: 'gu', name: 'Gujarati', nativeName: 'ગુજરાતી'},
{code: 'he', name: 'Hebrew', nativeName: 'עברית'},
{code: 'hi', name: 'Hindi', nativeName: 'हिन्दी, हिंदी'},
{code: 'hu', name: 'Hungarian', nativeName: 'Magyar'},
{code: 'ga', name: 'Irish', nativeName: 'Gaeilge'},
{code: 'is', name: 'Icelandic', nativeName: 'Íslenska'},
{code: 'it', name: 'Italian', nativeName: 'Italiano'},
{code: 'iu', name: 'Indonesian', nativeName: 'ᐃᓄᒃᑎᑐᑦ'},
{code: 'ja', name: 'Japanese', nativeName: '日本語 (にほんご／にっぽんご)'},
{code: 'kn', name: 'Kannada', nativeName: 'ಕನ್ನಡ'},
{
code: 'ko',
name: 'Korean',
nativeName: '한국어 (韓國語), 조선말 (朝鮮語)',
},
{code: 'la', name: 'Latvian', nativeName: 'latine, lingua latina'},
{code: 'lt', name: 'Lithuanian', nativeName: 'lietuvių kalba'},
{code: 'mk', name: 'Macedonian', nativeName: 'македонски јазик'},
{code: 'mg', name: 'Malagasy', nativeName: 'Malagasy fiteny'},
{code: 'ms', name: 'Malay', nativeName: 'bahasa Melayu, بهاس ملايو·'},
{code: 'mt', name: 'Maltese', nativeName: 'Malti'},
{code: 'mr', name: 'Marathi', nativeName: 'मराठी'},
{code: 'nb', name: 'Norwegian', nativeName: 'Norsk bokmål'},
{code: 'fa', name: 'Persian', nativeName: 'فارسی'},
{code: 'pl', name: 'Polish', nativeName: 'polski'},
{code: 'pt', name: 'Portuguese', nativeName: 'Português'},
{code: 'ro', name: 'Romanian', nativeName: 'română'},
{code: 'ru', name: 'Russian', nativeName: 'русский язык'},
{code: 'sk', name: 'Slovak', nativeName: 'slovenčina'},
{code: 'sl', name: 'Slovenian', nativeName: 'slovenščina'},
{code: 'es', name: 'Spanish', nativeName: 'español, castellano'},
{code: 'sw', name: 'Swahili', nativeName: 'Kiswahili'},
{code: 'sv', name: 'Swedish', nativeName: 'svenska'},
{code: 'ta', name: 'Tamil', nativeName: 'தமிழ்'},
{code: 'te', name: 'Telugu', nativeName: 'తెలుగు'},
{code: 'th', name: 'Thai', nativeName: 'ไทย'},
{code: 'tr', name: 'Turkish', nativeName: 'Türkçe'},
{code: 'tl', name: 'Tagalog', nativeName: 'Wikang Tagalog, ᜏᜒᜃᜅ᜔ ᜆᜄᜎᜓᜄ᜔'},
{code: 'uk', name: 'Ukrainian', nativeName: 'українська'},
{code: 'ur', name: 'Urdu', nativeName: 'اردو'},
{code: 'vi', name: 'Vietnamese', nativeName: 'Tiếng Việt'},
{code: 'cy', name: 'Welsh', nativeName: 'Cymraeg'},

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
