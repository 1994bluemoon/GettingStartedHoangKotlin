package vinova.henry.com.gettingstarted

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        Log.d("test", "oncreate")

    }
    override fun onStart() {
        super.onStart()
        Log.d("test", "onstart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("test", "onrestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("test", "onresume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("test", "onpause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("test", "onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("test", "ondestroy")
    }
}
