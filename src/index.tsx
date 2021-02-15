import { NativeModules } from 'react-native';

type ThubRnLanguageConversionType = {
  multiply(a: number, b: number): Promise<number>;
};

const { ThubRnLanguageConversion } = NativeModules;

export default ThubRnLanguageConversion as ThubRnLanguageConversionType;
