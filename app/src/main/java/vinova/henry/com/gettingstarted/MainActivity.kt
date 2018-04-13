package vinova.henry.com.gettingstarted

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener {

    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_count.setOnClickListener(this)
        bt_count.setOnLongClickListener(this)
        Log.d("main", "oncreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("main", "onstart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("main", "onrestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("main", "onresume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("main", "onpause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("main", "onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("main", "ondestroy")
    }

    override fun onClick(v: View?) {
        count += 1
        tv_count.text = count.toString()
    }

    override fun onLongClick(v: View?): Boolean {
        count += 5
        tv_count.text = count.toString()
        startActivity(Intent(this, TestActivity::class.java))
        return true
    }

}
