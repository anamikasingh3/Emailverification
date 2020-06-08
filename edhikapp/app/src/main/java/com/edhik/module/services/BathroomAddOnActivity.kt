package com.edhik.module.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.edhik.R
import com.edhik.mvp.BaseMvpActivity
import kotlinx.android.synthetic.main.productlisttoolbar.*
import kotlinx.android.synthetic.main.servicesbathroomdeep.*

class BathroomAddOnActivity : BaseMvpActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.servicesbathroomaddons)


        arrowBack.setOnClickListener(this)

        titleLabel.setText("Bathroom Deep Cleaning")
        bottomLayout.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0) {
            bottomLayout -> {
                startActivity(Intent(this, bathroomCartTotalActivity::class.java))
            }

    }}}
