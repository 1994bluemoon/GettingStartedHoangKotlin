package vinova.henry.com.gettingstarted

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_design.*
import vinova.henry.com.gettingstarted.R.id.*

class DesignActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when {
            rdbt_bussiness.isChecked -> cl_backgound.setBackgroundColor(Color.RED)
            rdbt_social.isChecked -> cl_backgound.setBackgroundColor(Color.WHITE)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design)
        rdbt_bussiness.setOnCheckedChangeListener(this)
        rdbt_social.setOnCheckedChangeListener(this)
    }
}
