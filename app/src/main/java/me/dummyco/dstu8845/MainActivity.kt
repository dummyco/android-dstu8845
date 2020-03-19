package me.dummyco.dstu8845

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  companion object {
    init {
      System.loadLibrary("main")
    }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    Log.d(
        "MainActivity",
        "Native call result: ${main()}"
    )
  }

  private external fun main(): Int
}
