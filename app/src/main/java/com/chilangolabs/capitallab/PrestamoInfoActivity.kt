package com.chilangolabs.capitallab

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.SeekBar
import com.chilangolabs.capitallab.OwnElements.NothingSelectedSpinnerAdapter
import kotlinx.android.synthetic.main.activity_prestamo_info.*

class PrestamoInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prestamo_info)

        val categorias: Array<String> = arrayOf("6 meses", "12 meses", "24 meses", "48 meses")

        val adapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categorias)

        spinnerCategoria.adapter = NothingSelectedSpinnerAdapter(adapter, R.layout.item_nothing_selected, this)

        seeker.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

            override fun onProgressChanged(seekbar: SeekBar?, progress: Int, fromUser: Boolean) {
                txtMoney.text = """${'$'}$progress"""
            }

        })

    }
}
