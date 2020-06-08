package com.edhik.module.services

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.edhik.R
import com.edhik.mvp.BaseMvpActivity
import kotlinx.android.synthetic.main.productlisttoolbar.*

class bathroomCartTotalActivity : BaseMvpActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.services_bathroom_cart_total)

        arrowBack.setOnClickListener(this)

        titleLabel.setText("Bathroom Deep Cleaning")
    }

    override fun onClick(p0: View?) {

    }
}
