package com.thubrnlanguageconversion

import com.facebook.react.bridge.*
import com.google.mlkit.common.model.DownloadConditions
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.Translator
import com.google.mlkit.nl.translate.TranslatorOptions

class ThubRnLanguageConversionModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

  private var languageConversionSuccessCallback: Callback? = null
  private var languageConversionFailureCallback: Callback? = null
  private var translator: Translator? = null

  override fun getName(): String {
    return "ThubRnLanguageConversion"
  }

  private var lifecycleEventListener: LifecycleEventListener = object : LifecycleEventListener {
    override fun onHostResume() {}
    override fun onHostPause() {}
    override fun onHostDestroy() {
      translator?.close()
    }
  }

  init {
    reactContext.addLifecycleEventListener(lifecycleEventListener)
  }

  @ReactMethod
  fun textConversion(text: String, sourceLanguage: String, targetLanguage: String, successCallback: Callback, failureCallback: Callback) {
    languageConversionSuccessCallback = successCallback
    languageConversionFailureCallback = failureCallback
    convertText(text, sourceLanguage, targetLanguage)
  }

  private fun convertText(text: String, sourceLanguage: String, targetLanguage: String) {
    val options = TranslatorOptions.Builder()
      .setSourceLanguage(sourceLanguage)
      .setTargetLanguage(targetLanguage).build()
    translator = Translation.getClient(options)

    val conditions = DownloadConditions.Builder().build()
    translator?.downloadModelIfNeeded(conditions)
      ?.addOnSuccessListener {
        translator?.translate(text)?.addOnSuccessListener { translatedText ->
          languageConversionSuccessCallback?.invoke(translatedText)
        }?.addOnFailureListener { exception ->
          languageConversionFailureCallback?.invoke(exception.message)
        }
      }?.addOnFailureListener { exception ->
        languageConversionFailureCallback?.invoke(exception.message)
      }
  }


}
